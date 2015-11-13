package com.controller.api;

import com.entity.User;
import com.google.gson.Gson;
import com.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * project_name:member_manage
 * package_name:com.controller
 * user: youzipi
 * date: 15-11-9 下午9:12
 */
@Controller
@RequestMapping("/v1/u")
public class UserAPIController {
    @Autowired
    UserDao userMapper;

    @ResponseBody
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String getById(@PathVariable Integer id) {
        User user = userMapper.selectById(id);
        return new Gson().toJson(user);

    }

    @ResponseBody
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable Integer id) {
        User user = userMapper.selectById(id);
        return new Gson().toJson(user);
    }

    @ResponseBody
    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public String add(@PathVariable Integer id) {
        User user = userMapper.selectById(id);
        return new Gson().toJson(user);
    }

    @ResponseBody
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String update(@PathVariable Integer id) {
        User user = userMapper.selectById(id);
        return new Gson().toJson(user);
    }

}