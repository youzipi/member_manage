package com.controller;

import com.entity.User;
import com.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.List;

/**
 * project_name:member_manage
 * package_name:com.controller
 * user: youzipi
 * date: 15-11-9 下午8:38
 */
@Controller
@EnableWebMvc
@RequestMapping("/u")
public class UserController {
    @Autowired
    UserMapper userMapper;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getAll(ModelMap map) {
        List<User> users = userMapper.selectAll();
        map.addAttribute("users", users);
        return "dashbroad";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String getById(@PathVariable Integer id, ModelMap map) {
        User user = userMapper.selectById(id);
        map.addAttribute("users", user);
        return "user_info";
    }

}
