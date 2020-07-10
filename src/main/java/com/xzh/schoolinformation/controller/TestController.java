package com.xzh.schoolinformation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/test")
    public String getAop(){
        return "main";
    }
    @RequestMapping("/add")
    public String getAddHtml(){
        return "school_add";
    }
}
