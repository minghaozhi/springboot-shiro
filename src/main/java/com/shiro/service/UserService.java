package com.shiro.service;

import com.shiro.model.SysUser;

import java.util.Set;

/**
 * @author 墨殇
 * @description:
 * @Date : 2018/5/8.
 */
public interface UserService {
    SysUser getUser(SysUser user);

    Set<String> findPermissionsByUserId(Integer id);
}
