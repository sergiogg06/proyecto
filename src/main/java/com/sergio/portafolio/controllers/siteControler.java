package com.sergio.portafolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class siteControler {
    @GetMapping("/")
    public String home() {
        return "www/site/index";
    }
    
}
