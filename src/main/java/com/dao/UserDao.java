package com.dao;

import com.entity.User;
import com.dao.mapper.UserMapper;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public interface UserDao extends UserMapper {

    List<User> selectAll();

    User selectById(int id);

    Integer delectById(int id);

    User validate(User user);

    int count();

    List<User> selectByPage(HashMap map);
}