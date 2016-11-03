package com.youzipi.controller;

import com.common.PageBean;
import com.google.gson.Gson;
import com.youzipi.bean.MarketingForm;
import com.youzipi.bean.entity.Marketing;
import com.youzipi.service.MarketingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by youzipi on 16/11/3.
 */
@Controller
@RequestMapping("/marketing")
public class MarketingController {
    @Autowired
    private MarketingService marketingService;


    @ResponseBody
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String info(@PathVariable Integer id) {
        Marketing marketing = marketingService.findById(id);
        return new Gson().toJson(marketing);
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public PageBean<Marketing> list(@PathVariable MarketingForm form, PageBean<Marketing> pageBean) {
        return marketingService.findByForm(form, pageBean);
    }

    @ResponseBody
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Integer add(Marketing marketing) {
        return marketingService.create(marketing);
    }

    @ResponseBody
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Integer update(Marketing marketing) {
        return marketingService.update(marketing);
    }

    @ResponseBody
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Integer destory(@PathVariable Integer id) {
        return marketingService.destory(id);
    }

}
