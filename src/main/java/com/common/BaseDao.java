package com.common;

import java.util.HashMap;
import java.util.List;

/**
 * project_name:member_manage
 * package_name:com.dao
 * user: youzipi
 * date: 15-11-13 下午2:58
 */
public interface BaseDao<T> {
    int count();

    List<T> selectByPage(HashMap map);
}
