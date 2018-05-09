package com.shiro.service;

import java.util.Set;

/**
 * @author 墨殇
 * @description:
 * @Date : 2018/5/8.
 */
public interface SysRoleService {
    Set<String> findRoleNameByUserId(Integer userId);
}
