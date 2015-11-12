package com.aspect;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
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

    //    @Pointcut(value = "execution ( * com.controller.UserController.get*(..))")
    @Pointcut(value = "@annotation( com.common.LoginRequired)")
    private void loginRequired() {
    }

    @Around(value = "loginRequired()")
    public String auth(ProceedingJoinPoint joinPoint) throws Throwable {

        HttpSession session = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession();
        System.out.println("aspect======");
        if (session.getAttribute("user") != null) {
            return (String) joinPoint.proceed();
//            return null;
        } else {
//            .getModel().put("error", "unauthorised");
//            return mav;
            return "login";
        }

    }
}