package com.originbackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.originbackend.entity.SysMenu;
import com.originbackend.mapper.SysMenuMapper;
import com.originbackend.service.ISysMenuService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 菜单权限表 服务实现类
 * </p>
 *
 * @author wpc
 * @since 2022-02-07
 */
@Service
public class SysMenuServiceImpl extends ServiceImpl<SysMenuMapper, SysMenu> implements ISysMenuService {

}
