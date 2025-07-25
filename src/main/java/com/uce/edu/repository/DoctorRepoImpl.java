package com.uce.edu.repository;

import com.uce.edu.repository.model.Doctor;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;


@Transactional
@ApplicationScoped
public class DoctorRepoImpl implements IDoctorRepo {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void insertarDoctor(Doctor doctor) {
        this.entityManager.persist(doctor);
    }

    @Override
    public Doctor consultarDoctoresPorCedula(String cedula) {
        TypedQuery<Doctor> typedQuery = this.entityManager.createQuery("SELECT d FROM Doctor d WHERE d.cedula =: cedula", Doctor.class);
        return typedQuery.getSingleResult();
    }

}
