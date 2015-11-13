package com.aspect;

import com.common.DateUtil;
import com.entity.User;
import com.service.UserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;

/**
 * project_name:member_manage
 * package_name:com.aspect
 * user: youzipi
 * date: 15-11-9 下午7:07
 */

@Aspect
public class ControllerAspect {
    private static final Log log = LogFactory.getLog(ControllerAspect.class);
    @Autowired
    UserService userService;

    //    @Pointcut(value = "execution ( * com.controller.UserController.get*(..))")
    @Pointcut(value = "@annotation( com.common.annotation.LoginRequired)")
    private void loginRequired() {
    }

    @Pointcut(value = "@annotation( com.common.annotation.Login)")
    private void login() {
    }

    @Around(value = "loginRequired()")
    public String checkLogin(ProceedingJoinPoint joinPoint) throws Throwable {

        HttpSession session = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession();
        System.out.println("aspect======");
        if (session.getAttribute("user") != null) {
            return (String) joinPoint.proceed();
        } else {
            return "login";
        }

    }

    @AfterReturning(pointcut = "login()", returning = "returnValue")
    public void logined(JoinPoint joinPoint, String returnValue) throws Throwable {
        if(!returnValue.equals("login")){
            HttpSession session = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession();
            User user = (User) session.getAttribute("user");
            user.getId();
            DateUtil.updateTime(user);
            userService.update(user);
        }
    }
}