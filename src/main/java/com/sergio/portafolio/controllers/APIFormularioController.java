package com.sergio.portafolio.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.sergio.portafolio.model.Entity.formulario;
import com.sergio.portafolio.model.Services.formularioService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/formulario")
@CrossOrigin(origins = "*")
public class APIFormularioController {

    @Autowired
    private formularioService formularioService;

    @PostMapping("/guardar") // 🔥 SOLO ACEPTA POST
    public formulario guardarFormulario(@RequestBody formulario formulario) {
        System.out.println("Datos recibidos: " + formulario.toString());
        return formularioService.guardarFormulario(formulario);
    }
}


