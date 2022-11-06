package com.daeYeon.deputySite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @GetMapping("/page")
    public String mainPage(){
        System.out.println("뀨?");
        return "index";
    }

    @GetMapping("/price_info")
    public String price_info(){
        System.out.println("뀨뀨");
        return "price_info";
    }

}
