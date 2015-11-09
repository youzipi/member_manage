package com.service;

/**
 * project_name:member_manage
 * package_name:com.service
 * user: youzipi
 * date: 15-11-9 下午3:51
 */


import com.dao.UserDao;
import com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

    @Autowired
    private UserDao userDao;


    public User getUser(Integer userid){
//        return userDao.selectByPrimaryKey(userid);
        return null;
    }

    public List<User> getUsers(){
        return userDao.selectAll();
    }
}