package com.originbackend.handler;


import com.originbackend.entity.R;
import com.originbackend.exception.BizException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.List;
import java.util.Set;


/**
 * 全局controller层异常处理
 */
@Slf4j
@ControllerAdvice
class GlobalExceptionHandler {

	/**
	 * 处理Bean 校验返回报错
	 * @param e
	 * @return
	 */
	@ExceptionHandler({BindException.class, MethodArgumentNotValidException.class})
	@ResponseBody
	public R validBeanExceptionHandler(BindException e) {
		List<FieldError> fieldErrors=e.getBindingResult().getFieldErrors();
		String defaultMessage = fieldErrors.get(0).getDefaultMessage();
		return R.error(defaultMessage);
	}

	/**
	 * 处理方法 校验返回报错
	 * @param e
	 * @return
	 */
	@ExceptionHandler(ConstraintViolationException.class)
	@ResponseBody
	public R validMethodExceptionHandler(ConstraintViolationException e) {
		StringBuilder message = new StringBuilder();
		Set<ConstraintViolation<?>> violations = e.getConstraintViolations();
		if( violations.size() > 0){
			message.append(violations.iterator().next().getMessage());
		}
		return R.error(message.toString());
	}


	@ResponseBody
	@ExceptionHandler(BizException.class)
	public R handleBizException(BizException e) {
		return R.error(e.getLocalizedMessage());
	}


	@ResponseBody
	@ExceptionHandler(Exception.class)
	public R handleException(Exception e) throws Exception {
		log.error("报错了--Exception----{}", e);
		throw e;
	}

}
