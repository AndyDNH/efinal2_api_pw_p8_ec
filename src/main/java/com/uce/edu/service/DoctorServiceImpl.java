package com.uce.edu.service;

import com.uce.edu.repository.IDoctorRepo;
import com.uce.edu.repository.model.Doctor;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;


@ApplicationScoped
public class DoctorServiceImpl implements IDoctorService{

    @Inject
    private IDoctorRepo docoDoctorRepo;

    @Override
    public Doctor buscarDoctoresPorCedula(String cedula) {
        return this.docoDoctorRepo.consultarDoctoresPorCedula(cedula);
    }

    @Override
    public void guardarDoctor(Doctor doctor) {
        this.docoDoctorRepo.insertarDoctor(doctor);
    }

}
