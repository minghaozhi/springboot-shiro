package com.shiro.service.impl;

import com.shiro.mapper.SysResourcesMapper;
import com.shiro.model.SysResources;
import com.shiro.service.ResourcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 墨殇
 * @description:
 * @Date : 2018/5/8.
 */
@Service
public class ResourcesServiceImpl  implements ResourcesService {
    @Autowired
    private SysResourcesMapper sysResourcesMapper;

    @Override
    public List<SysResources> selectAll() {
        List<SysResources> resourcesList = sysResourcesMapper.selectAll();
        return resourcesList;
    }
}
