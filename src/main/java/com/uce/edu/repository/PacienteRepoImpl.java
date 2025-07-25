package com.uce.edu.repository;

import com.uce.edu.repository.model.Paciente;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;


@Transactional
@ApplicationScoped
public class PacienteRepoImpl implements IPacienteRepo{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void ingresarPaciente(Paciente paciente) {
        this.entityManager.persist(paciente);        
    }

    @Override
    public Paciente consultarPacientePorCedula(String cedula) {
        TypedQuery<Paciente> typedQuery = this.entityManager.createQuery("SELECT p FROM Paciente p WHERE p.cedula =: cedula", Paciente.class);
        return typedQuery.getSingleResult();
    }

}
