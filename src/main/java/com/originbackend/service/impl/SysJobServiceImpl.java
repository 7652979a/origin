package com.originbackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.originbackend.entity.SysJob;
import com.originbackend.mapper.SysJobMapper;
import com.originbackend.service.ISysJobService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 定时任务调度表 服务实现类
 * </p>
 *
 * @author wpc
 * @since 2022-02-07
 */
@Service
public class SysJobServiceImpl extends ServiceImpl<SysJobMapper, SysJob> implements ISysJobService {

}
