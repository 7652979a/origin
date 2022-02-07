package com.originbackend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.originbackend.entity.SysUserRole;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 用户和角色关联表 Mapper 接口
 * </p>
 *
 * @author wpc
 * @since 2022-02-07
 */
@Repository
public interface SysUserRoleMapper extends BaseMapper<SysUserRole> {

}
