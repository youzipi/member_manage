package com.controller;

import com.common.DateUtil;
import com.entity.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getAll(ModelMap map) {
        List<User> users = userService.getAll();
        map.addAttribute("users", users);
        return "dashbroad";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String getById(@PathVariable Integer id, ModelMap map) {
        User user = userService.getById(id);
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
        User fullUser = userService.validate(user);

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
        String IdCard = request.getParameter("id_card");
        String phone = request.getParameter("phone");
        User user = new User();
        user.setName(name);
        user.setPassword(password);
        user.setIdCard(IdCard);
        user.setPhone(phone);
        DateUtil.AddDate(user);
        userService.add(user);

        return redirect("/");
    }

}
