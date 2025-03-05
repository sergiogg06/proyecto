package com.sergio.portafolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class formularioController {
@GetMapping("/formulario")
public String formulario() {
    return "www/formulario/index";
    }
}
