package com.sergio.portafolio.model.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sergio.portafolio.model.Entity.formulario;

@Repository
public interface formularioRepository extends JpaRepository<formulario, Long> {
}

