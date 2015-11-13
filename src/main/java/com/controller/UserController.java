package com.controller;

import com.common.DateUtil;
import com.common.PageBuilder;
import com.common.annotation.Login;
import com.common.annotation.LoginRequired;
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
        return redirect("/u/p/1");
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String getById(@PathVariable Integer id, ModelMap map) {
        User user = userService.getById(id);
        map.addAttribute("users", user);
        return "user_info";
    }

    @LoginRequired
    @RequestMapping(value = "/p/{page_num}", method = RequestMethod.GET)
    public String getByPage(@PathVariable("page_num") Integer pageNum, ModelMap model) {

//        HttpSession session = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession();
//        if (session.getAttribute("user") == null) {
//            model.addAttribute("msg", "请登陆后操作");
//            return "login";
//        }

        PageBuilder builder = new PageBuilder();
        builder.number(pageNum);

        List<User> users = userService.getByPage(builder.page());
        int count = userService.count();
        builder.total(count);


        model.addAttribute("users", users);
        model.addAttribute("page", builder.page());
        return "dashbroad";
    }

    @Login
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(User user, HttpServletRequest request, ModelMap model) {
        User fullUser = userService.validate(user);

        HttpSession session = request.getSession();

        if (fullUser != null) {
            session.setAttribute("user", fullUser);
            session.setAttribute("user_name", fullUser.getName());
            session.setAttribute("hello", true);
            return redirect("/u/");
        } else {
            session.setAttribute("msg", "登录失败检查用户名,密码");
            return "login";
        }
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.removeAttribute("user");
        session.removeAttribute("user_name");
        return redirect();
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String add(User user) {
        System.out.println(user);
        DateUtil.addTime(user);
        userService.add(user);

        return redirect();
    }

}
