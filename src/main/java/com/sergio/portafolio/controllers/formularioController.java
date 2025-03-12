package com.sergio.portafolio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import com.sergio.portafolio.model.Entity.formulario;
import com.sergio.portafolio.model.Services.formularioService;

@Controller
public class formularioController {
     @Autowired
    private formularioService formularioService;
@GetMapping("/formulario")
public String formulario() {
    return "www/formulario/index";
    }
      @PostMapping("/formulario")
    public String postContacto(
            @RequestParam Long id,
            @RequestParam String email,
            @RequestParam String telefono,
            @RequestParam String intagram,
            @RequestParam String twitter,
            @RequestParam String especialidad,
            @RequestParam String skype,   
            Model model) {
        formulario nuevoContacto = new formulario();
        nuevoContacto.setId(id);
        nuevoContacto.setGmail(email);
        nuevoContacto.setTelefono(telefono);
        nuevoContacto.setInstagram(intagram);
        nuevoContacto.setTwitter(twitter);
        nuevoContacto.setEspecialidad(especialidad);
        nuevoContacto.setSkype(skype);
        

        formularioService.guardar(nuevoContacto);

        model.addAttribute("mensajeExito", "Mensaje enviado correctamente");

        return "www/site/contacto"; 
    }

}

