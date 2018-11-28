package com.sample.drop.controller;
import com.codahale.metrics.annotation.Timed;
import com.sample.drop.entities.Person;
import com.sample.drop.repositories.PersonDB;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/person")
public class PersonController {

    @GET
    @Path("/get/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Person getPerson(@NotNull @PathParam("id") int id){
        return PersonDB.getById(id);
    }

    @GET
    @Timed
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Person> getPersons() {
        return PersonDB.getAll();
    }

    @GET
    @Timed
    @Path("/remove")
    @Produces(MediaType.TEXT_PLAIN)
    public String removePerson() {
        PersonDB.remove();
        return "Last person remove. Total count: " + PersonDB.getCount();
    }

    @POST
    @Timed
    @Path("/save")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String addPerson(Person person) {
        return PersonDB.save(person);
    }
}
