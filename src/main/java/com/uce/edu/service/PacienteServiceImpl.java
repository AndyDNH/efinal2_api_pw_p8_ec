package com.uce.edu.service;

import com.uce.edu.repository.IPacienteRepo;
import com.uce.edu.repository.model.Paciente;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;


@ApplicationScoped
public class PacienteServiceImpl implements IPacienteService{

    @Inject
    private IPacienteRepo pacienteRepo;

    @Override
    public void guardarPaciente(Paciente paciente) {
        pacienteRepo.ingresarPaciente(paciente);
    }

    @Override
    public Paciente obtenerPacientePorCedula(String cedula) {
        return pacienteRepo.consultarPacientePorCedula(cedula);
    }



}
