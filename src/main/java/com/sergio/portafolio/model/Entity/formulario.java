package com.sergio.portafolio.model.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "contactos")
public class formulario {
    
    @Id
    private String gmail;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "instagram")
    private String instagram;

    @Column(name = "twitter")
    private String twitter;

    @Column(name = "especialidad")
    private String especialidad;

    @Column(name = "skypes")
    private String skypes;

    public formulario() {
    }

    public formulario(String gmail, String telefono, String instagram, String twitter, String especialidad, String skypes) {
        this.setEmail(gmail);
        this.setTelefono(telefono);
        this.setInstagram(instagram);
        this.setTwitter(twitter);
        this.setEspecialidad(especialidad);
        this.setSkypes(skypes);
       
        
    }

 
    public String getEmail() {
        return gmail;
    }

    public void setEmail(String email) {
        this.gmail = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getSkypes() {
        return skypes;
    }

    public void setSkypes(String skypes) {
        this.skypes = skypes;
    }

    @Override
    public String toString() {
        return 
                "<" + this.gmail + "," 
                + this.telefono + "," 
                + this.instagram + ","
                 + this.twitter+ ","
                  + this.especialidad + ","
                   + this.skypes + ">";
    }
}