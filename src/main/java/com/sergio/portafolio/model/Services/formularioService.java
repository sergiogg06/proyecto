package com.sergio.portafolio.model.Services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sergio.portafolio.model.Repository.formularioRepository;
import com.sergio.portafolio.model.Entity.formulario;

@Service
public class formularioService {

    @Autowired
    formularioRepository fR;
  
    public void guardar(formulario formulario) {
        fR.save(formulario);
    }
}
