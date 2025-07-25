package com.uce.edu.service;

import com.uce.edu.repository.model.Doctor;


public interface IDoctorService {

    public Doctor buscarDoctoresPorCedula(String cedula);
    public void guardarDoctor(Doctor doctor);


    

}
