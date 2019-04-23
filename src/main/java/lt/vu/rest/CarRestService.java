package lt.vu.rest;

import lt.vu.entities.Car;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@ApplicationScoped
@Path("/car")
@Produces(MediaType.APPLICATION_JSON)
public class CarRestService {

    @Inject private EntityManager em;

    @GET
    @Path("/{studentId}")
    public Car find(@PathParam("studentId") Integer studentId) {
        return em.find(Car.class, studentId);
    }
}
