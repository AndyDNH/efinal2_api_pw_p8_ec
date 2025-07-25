package com.uce.edu.repository;

import com.uce.edu.repository.model.Doctor;

public interface IDoctorRepo {

    public Doctor consultarDoctoresPorCedula(String cedula);
    public void insertarDoctor(Doctor doctor);

}
