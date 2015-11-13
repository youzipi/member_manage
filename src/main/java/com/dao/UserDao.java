package com.dao;

import com.common.BaseDao;
import com.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends BaseDao<User> {

    List<User> selectAll();

    User selectById(int id);

    Integer delectById(int id);

    User validate(User user);

}