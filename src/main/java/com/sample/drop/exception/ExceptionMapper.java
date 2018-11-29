package com.sample.drop.exception;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class ExceptionMapper implements javax.ws.rs.ext.ExceptionMapper<RestCustomException> {
    @Override
    public Response toResponse(RestCustomException e) {
        return Response.status(e.getCode()).entity(e.getMessage()).type(MediaType.TEXT_PLAIN).build();
    }
}
