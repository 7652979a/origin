package com.originbackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.originbackend.entity.SysJobLog;
import com.originbackend.mapper.SysJobLogMapper;
import com.originbackend.service.ISysJobLogService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 定时任务调度日志表 服务实现类
 * </p>
 *
 * @author wpc
 * @since 2022-02-07
 */
@Service
public class SysJobLogServiceImpl extends ServiceImpl<SysJobLogMapper, SysJobLog> implements ISysJobLogService {

}
