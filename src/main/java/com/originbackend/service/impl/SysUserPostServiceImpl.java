package com.originbackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.originbackend.entity.SysUserPost;
import com.originbackend.mapper.SysUserPostMapper;
import com.originbackend.service.ISysUserPostService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户与岗位关联表 服务实现类
 * </p>
 *
 * @author wpc
 * @since 2022-02-07
 */
@Service
public class SysUserPostServiceImpl extends ServiceImpl<SysUserPostMapper, SysUserPost> implements ISysUserPostService {

}
