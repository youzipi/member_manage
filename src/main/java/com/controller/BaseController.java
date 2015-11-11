package com.controller;

/**
 * project_name:member_manage
 * package_name:com.controller
 * user: youzipi
 * date: 15-11-10 下午7:14
 */
public class BaseController {

    protected String redirect() {
        return redirect("/");
    }

    protected String redirect(String url) {
        return "redirect:" + url;
    }

}
