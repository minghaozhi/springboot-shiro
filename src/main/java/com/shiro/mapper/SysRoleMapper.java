package com.shiro.mapper;

import com.shiro.model.SysRole;
import com.shiro.util.MyMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.Set;

/**
 * @author 墨殇
 * @description:
 * @Date : 2018/5/8.
 */
public interface SysRoleMapper extends MyMapper<SysRole> {

    @Select("SELECT sr.role_desc FROM sys_user_role sur LEFT JOIN sys_role sr ON sr.id = sur.role_id \n" +
            "LEFT JOIN sys_user su ON sur.user_id = su.id WHERE su.id = #{userId}")
    Set<String> findRoleNameByUserId(@Param("userId") int userId);
}
