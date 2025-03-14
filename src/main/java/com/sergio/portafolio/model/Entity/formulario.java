package com.sergio.portafolio.model.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "contactos")
public class formulario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Esto permite que se genere automáticamente un ID único
    private Long id;

   
    private String gmail;

   
    private String telefono;

    
    private String instagram;

   
    private String twitter;

   
    private String especialidad;

    
    private String skype;


    
    // Getters y Setters aquí...
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getGmail() {
        return gmail;
    }
    public void setGmail(String gmail) {
        this.gmail = gmail;
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
    public String getSkype() {
        return skype;
    }
    public void setSkype(String skype) {
        this.skype = skype;
    }

    @Override
    public String toString() {
        return "formulario [especialidad=" + especialidad + ", gmail=" + gmail + ", id=" + id + ", instagram=" + instagram
                + ", skype=" + skype + ", telefono=" + telefono + ", twitter=" + twitter + "]";
    }
}
