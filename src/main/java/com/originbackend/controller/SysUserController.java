package com.originbackend.controller;


import com.originbackend.entity.SysUser;
import com.originbackend.mapper.SysUserMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户信息表 前端控制器
 * </p>
 *
 * @author wpc
 * @since 2022-02-07
 */
@RestController
@RequestMapping("/sys-user")
@AllArgsConstructor
public class SysUserController {
    private SysUserMapper sysUserMapper;

    @GetMapping("/{userId}")
    public String getUserById(@PathVariable Long userId){
        SysUser sysUser = sysUserMapper.selectById(userId);
        System.out.println(sysUser.toString());
        return null;
    }

}
