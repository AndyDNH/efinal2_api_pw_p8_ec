package com.uce.edu.repository.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name = "cita")
public class Cita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cita_id")
    private Integer id;

    @Column(name = "cita_cdoc")
    private String cedulaDoc;

    @Column(name = "cita_cpaci")
    private String nombrePaci;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCedulaDoc() {
        return cedulaDoc;
    }

    public void setCedulaDoc(String cedulaDoc) {
        this.cedulaDoc = cedulaDoc;
    }

    public String getNombrePaci() {
        return nombrePaci;
    }

    public void setNombrePaci(String nombrePaci) {
        this.nombrePaci = nombrePaci;
    }

    
    
}
