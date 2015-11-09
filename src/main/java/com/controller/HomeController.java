package com.controller;

import com.dao.UserDao;
import com.entity.User;
import com.mapper.TestMapper;
import com.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
@RequestMapping("/")
public class HomeController {
    private static int counter = 0;
    private static final String VIEW_INDEX = "index";
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    private UserDao userDao;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private TestMapper testMapper;
//
//    @Autowired
//    private UserService userService;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String welcome(ModelMap model) {
        model.addAttribute("message", "Welcome");
        model.addAttribute("counter", ++counter);
        List<User> users = userMapper.selectAll();
        model.addAttribute("users", users);
        return "index";
    }

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String welcome(@PathVariable String name, ModelMap model) {

        return "index";
    }
}
