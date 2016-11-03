package com.controller.api;

import com.entity.User;
import com.google.gson.Gson;
import com.service.UserService;
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
    UserService userService;

    @ResponseBody
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String info(@PathVariable Integer id) {
        User user = userService.findById(id);
        return new Gson().toJson(user);
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public String list(@PathVariable Integer id) {
        User user = userService.findById(id);
        return new Gson().toJson(user);
    }

    @ResponseBody
    @RequestMapping(value = "/", method = RequestMethod.DELETE)
    public String delete(@PathVariable Integer id) {
        return null;
    }

    @ResponseBody
    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public String add(@PathVariable Integer id) {
//        User user = userService.add(user);
//        return new Gson().toJson(user);
        return null;
    }

    @ResponseBody
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String update(@PathVariable Integer id) {
        return null;
    }

}