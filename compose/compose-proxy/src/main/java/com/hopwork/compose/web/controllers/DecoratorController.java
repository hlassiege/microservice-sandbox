package com.hopwork.compose.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/decorators")
public class DecoratorController {

    @RequestMapping("/decorator")
    public ModelAndView standardLayout(ModelAndView model) {
        model.setViewName("layout/decorator");
        return model;
    }

}
