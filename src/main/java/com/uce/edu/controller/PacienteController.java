package com.uce.edu.controller;

import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;

import com.uce.edu.service.IPacienteService;
import com.uce.edu.service.mapper.PacienteMapper;
import com.uce.edu.service.to.PacienteTo;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;

@Path("/paciente")
public class PacienteController {

    @Inject
    private IPacienteService pacienteService;


    @GET
    @Path("/{ced}")
    public Response obtenerPacPorCedula(@PathParam("ced") String ced){
        PacienteTo pacienteTo = PacienteMapper.toTo(this.pacienteService.obtenerPacientePorCedula(ced));
        return Response.status(200).entity(pacienteTo).build();
    }

    @POST
    @Path("")
    public Response obtenerPacPorCedula(@RequestBody PacienteTo pacienteTo){
        pacienteService.guardarPaciente(PacienteMapper.toEntity(pacienteTo));
        return Response.status(200).build();
    }






}
