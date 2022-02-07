package com.originbackend.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 异常
 */
@AllArgsConstructor
@Getter
public class BizException extends RuntimeException {
	private String message;
	public BizException() {
	}

	public BizException(String message, Throwable e){
		super(message, e);
	}
}
