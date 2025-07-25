package com.uce.edu.service.mapper;

import com.uce.edu.repository.model.Doctor;
import com.uce.edu.service.to.DoctorTo;

public class DoctorMapper {

    public static DoctorTo toTo(Doctor doctor) {
        DoctorTo docTo = new DoctorTo();
        docTo.setId(doctor.getId());
        docTo.setApellido(doctor.getApellido());
        docTo.setCedula(doctor.getCedula());
        docTo.setGenero(doctor.getGenero());
        docTo.setNombre(doctor.getNombre());

        return docTo;
    }

    public static Doctor toEntity(DoctorTo dTo) {
        Doctor doctor = new Doctor();
        doctor.setId(dTo.getId());
        doctor.setApellido(dTo.getApellido());
        doctor.setCedula(dTo.getCedula());
        doctor.setGenero(dTo.getGenero());
        doctor.setNombre(dTo.getNombre());
        return doctor;
    }

}
