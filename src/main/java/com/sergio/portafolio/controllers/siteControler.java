package com.sergio.portafolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class siteControler {
    @GetMapping("/")
    public String home() {
        return "www/site/index";
    }
    // @GetMapping("/formulario")
    // public String contacto(Model model) {
    //     model.addAttribute("title", "Contacto");
    //     return "www/formulario/index";
    // }
    
}
