package com.shiro.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author 墨殇
 * @description:
 * @Date : 2018/5/9.
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
