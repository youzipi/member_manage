package com.controller;

import com.entity.User;
import com.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


/**
 * project_name:member_manage
 * package_name:controller
 * user: youzipi
 * date: 15-11-8 下午12:51
 */
@Controller
@RequestMapping("/home")
public class HomeController {
    private static int counter = 0;


    @Autowired
    private UserDao userMapper;



    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String welcome(ModelMap model) {
        model.addAttribute("message", "Welcome");
        model.addAttribute("counter", ++counter);
        List<User> users = userMapper.selectAll();
        model.addAttribute("users", users);
        return "index";
    }

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String welcome2(@PathVariable String name, ModelMap model) {
        return "index";
    }

}
