package com.uce.edu.service;

import com.uce.edu.repository.model.Paciente;

public interface IPacienteService {

    public void guardarPaciente(Paciente paciente);
    public Paciente obtenerPacientePorCedula(String cedula);

    

}
