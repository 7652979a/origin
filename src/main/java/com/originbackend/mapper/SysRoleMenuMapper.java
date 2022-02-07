package com.originbackend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.originbackend.entity.SysRoleMenu;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 角色和菜单关联表 Mapper 接口
 * </p>
 *
 * @author wpc
 * @since 2022-02-07
 */
@Repository
public interface SysRoleMenuMapper extends BaseMapper<SysRoleMenu> {

}
