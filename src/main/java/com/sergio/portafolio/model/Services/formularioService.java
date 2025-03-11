package com.sergio.portafolio.model.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sergio.portafolio.model.Repository.formularioRepository;
import com.sergio.portafolio.model.Entity.formulario;

@Service
public class formularioService {

    @Autowired
    formularioRepository fR;

    public List<formulario> getAll() {
        List<formulario> formulario = this.fR.findAll();
        return formulario;
    }
    
    public void create(formulario formulario) {
        this.fR.save(formulario);
    }

    public void delete(String gmail) {
        this.fR.deleteById(gmail);
    }

    public formulario getEmail(String gmail) {
        formulario formulario = this.fR.findById(gmail).get();
        return formulario;
    }
}
