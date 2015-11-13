package com.service;

import com.common.Page;
import com.dao.UserDao;
import com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
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
    UserDao userDao;

    public int add(User user) {
        return userDao.insertSelective(user);
    }

    public List<User> getAll() {
        return userDao.selectAll();
    }

    public User getById(Integer id) {
        return userDao.selectById(id);
    }

    public User validate(User user) {
        return userDao.validate(user);
    }

    public int count() {
        return userDao.count();
    }

    public List<User> getByPage(Page page) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("offset", (page.getNumber() - 1) * page.getSize());
        map.put("limit", page.getSize());
        return userDao.selectByPage(map);
    }
}
