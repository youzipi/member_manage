package com.mapper;

import com.entity.User;
import com.entity.UserExample;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    int countByExample(UserExample example);

    List<User> selectAll();

    User selectById(int id);
}