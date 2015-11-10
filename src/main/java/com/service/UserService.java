package com.service;

import com.entity.User;
import com.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * project_name:member_manage
 * package_name:com.service
 * user: youzipi
 * date: 15-11-10 下午8:35
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public int add(User user) {
        return userMapper.insertSelective(user);
    }

    public List<User> getAll() {
        return userMapper.selectAll();
    }

    public User getById(Integer id) {
        return userMapper.selectById(id);
    }

    public User validate(User user) {
        return userMapper.validate(user);
    }
}
