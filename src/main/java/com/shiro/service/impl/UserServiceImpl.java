package com.shiro.service.impl;

import com.shiro.mapper.SysResourcesMapper;
import com.shiro.mapper.SysUserMapper;
import com.shiro.model.SysUser;
import com.shiro.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author 墨殇
 * @description:
 * @Date : 2018/5/8.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private SysUserMapper userMapper;
    @Autowired
    private SysResourcesMapper sysResourcesMapper;

    @Override
    public SysUser getUser(SysUser user) {
        SysUser info = userMapper.selectOne(user);
        return info;
    }

    @Override
    public Set<String> findPermissionsByUserId(Integer id) {
        Set<String> permissions = sysResourcesMapper.findRoleNameByUserId(id);
        Set<String> result = new HashSet<>();
        for (String permission : permissions) {
            if (StringUtils.isBlank(permission)) {
                continue;
            }
            permission = StringUtils.trim(permission);
            result.addAll(Arrays.asList(permission.split("\\s*;\\s*")));
        }
        return result;
    }

}
