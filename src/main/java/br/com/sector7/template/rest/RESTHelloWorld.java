package br.com.sector7.template.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/hello")
public class RESTHelloWorld {

    @GET
    @Path("/world")
    public Response world() {
        return Response.ok().entity("Hello World!").build();
    }

}
