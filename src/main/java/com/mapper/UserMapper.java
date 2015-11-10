package com.mapper;

import com.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    List<User> selectAll();

    User selectById(int id);

    Integer delectById(int id);

    User validate(User user);


    int insertSelective(User record);
}