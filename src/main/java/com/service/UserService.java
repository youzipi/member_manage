package com.service;

import com.common.Page;
import com.common.PageUtil;
import com.dao.UserDao;
import com.dao.mapper.UserMapper;
import com.entity.User;
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
    UserDao userDao;
    @Autowired
    UserMapper userMapper;

    public int add(User user) {
        return userMapper.insertSelective(user);
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
        return userDao.selectByPage(PageUtil.page2map(page));
    }

    public int update(User user) {
        return userMapper.updateByPrimaryKey(user);
    }
}
