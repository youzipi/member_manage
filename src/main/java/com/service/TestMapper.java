package com.service;

import com.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * project_name:member_manage
 * package_name:com.mapper
 * user: youzipi
 * date: 15-11-9 下午7:17
 */
@Repository
public interface TestMapper {
    @Select("SELECT * FROM user")
    List<User> selectAll();
}

