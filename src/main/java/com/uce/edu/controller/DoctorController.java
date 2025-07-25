package com.uce.edu.controller;

import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;

import com.uce.edu.service.IDoctorService;
import com.uce.edu.service.mapper.DoctorMapper;
import com.uce.edu.service.to.DoctorTo;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;

@Path("/doctor")
// @Consumes()
public class DoctorController {

    @Inject
    private IDoctorService doctorService;

    @GET
    @Path("/{ced}")
    public Response consultarDocPorCedula(@PathParam("ced") String ced) {
        DoctorTo dTo = DoctorMapper.toTo(doctorService.buscarDoctoresPorCedula(ced));
        return Response.status(200).entity(dTo).build();

    }

    @POST
    @Path("")
    public Response guardarDoc(@RequestBody DoctorTo doctorTo){

        doctorService.guardarDoctor(DoctorMapper.toEntity(doctorTo));
        return Response.status(200).build();
    }

}
