package com.controller;

import com.entity.User;
import com.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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
public class UserController extends BaseController {
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

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(HttpServletRequest request, ModelMap model) {
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        User user = new User();
        user.setName(name);
        user.setPassword(password);
        User fullUser = userMapper.validate(user);

        HttpSession session = request.getSession();

        if (fullUser != null) {
            session.setAttribute("user", fullUser);
            session.setAttribute("user_name", fullUser.getName());
            return redirect("/");
        } else {
//            System.out.println("user is not existed");
            session.setAttribute("msg", "登录失败检查用户名,密码");
            return "login";
        }
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.removeAttribute("user_id");
        session.removeAttribute("user_name");
        return redirect("/");
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String add(HttpServletRequest request) {
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        HttpSession session = request.getSession();
        session.removeAttribute("user_id");
        session.removeAttribute("user_name");
        return redirect("/");
    }

}
