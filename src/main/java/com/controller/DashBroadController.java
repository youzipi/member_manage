package com.controller;

import com.entity.User;
import com.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * project_name:member_manage
 * package_name:com.controller
 * user: youzipi
 * date: 15-11-9 下午8:36
 */
@Controller
@RequestMapping("/")
public class DashBroadController {
    @Autowired
    UserMapper userMapper;

    @RequestMapping("/")
    public String index(ModelMap model) {
        List<User> users = userMapper.selectAll();
        model.addAttribute("users", users);
        return "dashbroad";
    }
}
