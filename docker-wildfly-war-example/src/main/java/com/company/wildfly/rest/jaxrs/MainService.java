package com.company.wildfly.rest.jaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/")
public class MainService {

    @GET
    @Path("/json")
    @Produces({"application/json"})
    public String getJSON() {
        return "{\"result\":\"" + ("Hello OpenShift!!") + "\"}";
    }

    @GET
    @Path("/xml")
    @Produces({"application/xml"})
    public String getXML() {
        return "<xml><result>" + ("Hello OpenShift!!") + "</result></xml>";
    }

}