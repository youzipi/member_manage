package com.youzipi.controller;

import com.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by youzipi on 16/11/3.
 */
@Controller("/marketing")
public class MarketingController extends BaseController{

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String list(ModelMap model, HttpServletRequest request) {
        model.addAttribute("s", "123");
//        return "list";
        return redirect("list");
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String list(@PathVariable Integer id, HttpServletRequest request, ModelMap model) {
        return "info_page";
    }
}
