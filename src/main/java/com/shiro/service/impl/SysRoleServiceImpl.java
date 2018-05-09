package com.shiro.service.impl;

import com.shiro.mapper.SysRoleMapper;
import com.shiro.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author 墨殇
 * @description:
 * @Date : 2018/5/8.
 */
@Service
public class SysRoleServiceImpl implements SysRoleService {
    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Override
    public Set<String> findRoleNameByUserId(Integer userId) {
        return sysRoleMapper.findRoleNameByUserId(userId);
    }
}
