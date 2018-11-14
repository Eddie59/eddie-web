package com.em.eddieweb.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * HomeController class
 *
 * @author Administrator
 * @date
 */
@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public ModelAndView index(){
        return new ModelAndView("home/index","messages",null);
    }

}
