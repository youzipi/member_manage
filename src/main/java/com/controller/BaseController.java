package com.controller;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * project_name:member_manage
 * package_name:com.controller
 * user: youzipi
 * date: 15-11-10 下午7:14
 */
public class BaseController {

    private static final String CUSTOMER_ID = "customerId";


    protected String redirect() {
        return "redirect:/";
    }

    protected String redirect(String url) {
        StringBuilder builder = new StringBuilder();
        builder.append("redirect:").append(url);
        if (!url.substring(url.length() - 1).equals("/")) {
            builder.append("/");
        }
        return builder.toString();
    }

    protected Object sessionVal(String name) {
        return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
                .getRequest()
                .getSession()
                .getAttribute(name);
    }

    protected Long customerId() {
        return (Long) sessionVal(CUSTOMER_ID);
    }

}
