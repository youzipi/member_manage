package com.dao;

import com.entity.User;
import com.entity.UserExample;
import com.mapper.UserMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * project_name:member_manage
 * package_name:mapper
 * user: youzipi
 * date: 15-11-9 下午12:41
 */
@Repository
public class UserDao implements UserMapper {

    @Transactional
    public List<User> selectAll() {
        return null;
    }

    public int countByExample(UserExample example) {
        return 0;
    }

    public int deleteByExample(UserExample example) {
        return 0;
    }

    public int insert(User record) {
        return 0;
    }

    public int insertSelective(User record) {
        return 0;
    }

    public List<User> selectByExample(UserExample example) {
        return null;
    }

    public int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example) {
        return 0;
    }

    public int updateByExample(@Param("record") User record, @Param("example") UserExample example) {
        return 0;
    }
}
