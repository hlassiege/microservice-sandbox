package com.hopwork.compose.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/sample")
public class SampleController {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView process() {
        ModelMap model = new ModelMap();
        return new ModelAndView("sample", model);
    }
}