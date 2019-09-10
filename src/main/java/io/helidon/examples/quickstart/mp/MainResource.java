package io.helidon.examples.quickstart.mp;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/greet")
@RequestScoped
public class MainResource{
    @Path("/")
    @GET
    public String hellou(){
        return "eu to vivo";
    }
}