package com.controller;

import com.common.PageBuilder;
import com.common.annotation.LoginRequired;
import com.entity.Machine;
import com.service.MachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.List;

/**
 * project_name:member_manage
 * package_name:com.controller
 * machine: youzipi
 * date: 15-11-9 下午8:38
 */
@Controller
@EnableWebMvc
@RequestMapping("/m")
public class MachineController extends BaseController {
    @Autowired
    MachineService machineService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getAll(ModelMap map) {
        return redirect("/m/p/1");
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String getById(@PathVariable Integer id, ModelMap map) {
        Machine machine = machineService.getById(id);
        map.addAttribute("machines", machine);
        return "machine_info";
    }

    @LoginRequired
    @RequestMapping(value = "/p/{page_num}", method = RequestMethod.GET)
    public String getByPage(@PathVariable("page_num") Integer pageNum, ModelMap model) {
        PageBuilder builder = new PageBuilder();
        builder.number(pageNum);

        List<Machine> machines = machineService.getByPage(builder.page());
        int count = machineService.count();
        builder.total(count);


        model.addAttribute("machines", machines);
        model.addAttribute("page", builder.page());
        return "machine_list";
    }

}
