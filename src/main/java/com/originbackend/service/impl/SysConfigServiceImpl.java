package com.originbackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.originbackend.entity.SysConfig;
import com.originbackend.mapper.SysConfigMapper;
import com.originbackend.service.ISysConfigService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 参数配置表 服务实现类
 * </p>
 *
 * @author wpc
 * @since 2022-02-07
 */
@Service
public class SysConfigServiceImpl extends ServiceImpl<SysConfigMapper, SysConfig> implements ISysConfigService {

}
