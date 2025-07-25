package com.uce.edu.repository;

import com.uce.edu.repository.model.Paciente;

public interface IPacienteRepo {

    public void ingresarPaciente(Paciente paciente);
    public Paciente consultarPacientePorCedula(String cedula);

}
