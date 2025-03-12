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

    public void delete(Long id) {
        this.fR.deleteById(id);
    }

    public formulario getEmail(Long id) {
        formulario formulario = this.fR.findById(id).get();
        return formulario;
    }
  
    public formulario guardarFormulario(formulario formulario) {
        try {
            return fR.save(formulario);
        } catch (Exception e) {
            System.err.println("Error al guardar el formulario: " + e.getMessage());
            return null;
        }
    }
}
