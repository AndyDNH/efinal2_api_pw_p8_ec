package com.uce.edu.service.mapper;

import com.uce.edu.repository.model.Paciente;
import com.uce.edu.service.to.PacienteTo;

public class PacienteMapper {


    public static PacienteTo toTo(Paciente paciente){
        PacienteTo pacienteTo = new PacienteTo();
        pacienteTo.setId(paciente.getId());
        pacienteTo.setApellido(paciente.getApellido());
        pacienteTo.setCedula(paciente.getCedula());
        pacienteTo.setFechaNacimiento(paciente.getFechaNacimiento());
        pacienteTo.setNombre(paciente.getNombre());
        return pacienteTo;
    }

    public static Paciente toEntity(PacienteTo paTo){
        Paciente paci = new Paciente();
        paci.setId(paTo.getId());
        paci.setApellido(paTo.getApellido());
        paci.setCedula(paTo.getCedula());
        paci.setFechaNacimiento(paTo.getFechaNacimiento());
        paci.setNombre(paTo.getNombre());
        return paci;
    }


}
