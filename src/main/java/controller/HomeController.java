package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * project_name:member_manage
 * package_name:controller
 * user: youzipi
 * date: 15-11-8 下午12:51
 */
@Controller
@RequestMapping("/")
public class HomeController {
    private static int counter=0;
    private static final String VIEW_INDEX="index";


    @RequestMapping(value = "/" ,method = RequestMethod.GET)
    public String welcome(ModelMap model){
        model.addAttribute("message","Welcome");
        model.addAttribute("counter",++counter);

        return VIEW_INDEX;//返回index.jsp
    }

    @RequestMapping(value = "/{name}" ,method = RequestMethod.GET)
    public String welcome(@PathVariable String name , ModelMap model){
        model.addAttribute("message","Welcome "+name);
        model.addAttribute("counter",++counter);

        return VIEW_INDEX;//返回index.jsp
    }
}
