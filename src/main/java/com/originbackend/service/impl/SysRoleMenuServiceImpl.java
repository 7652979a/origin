package com.originbackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.originbackend.entity.SysRoleMenu;
import com.originbackend.mapper.SysRoleMenuMapper;
import com.originbackend.service.ISysRoleMenuService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色和菜单关联表 服务实现类
 * </p>
 *
 * @author wpc
 * @since 2022-02-07
 */
@Service
public class SysRoleMenuServiceImpl extends ServiceImpl<SysRoleMenuMapper, SysRoleMenu> implements ISysRoleMenuService {

}
