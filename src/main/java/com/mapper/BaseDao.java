package com.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * project_name:member_manage
 * package_name:mapper
 * user: youzipi
 * date: 15-11-9 下午1:32
 */
public class BaseDao<T, U> {
    public int countByExample(U example) {
        return 0;
    }

    public int deleteByExample(U example) {
        return 0;
    }

    public int insert(T record) {
        return 0;
    }

    public int insertSelective(T record) {
        return 0;
    }

    public List<T> selectByExample(U example) {
        return null;
    }

    public int updateByExampleSelective(@Param("record") T record, @Param("example") U example) {
        return 0;
    }

    public int updateByExample(@Param("record") T record, @Param("example") U example) {
        return 0;
    }

}
