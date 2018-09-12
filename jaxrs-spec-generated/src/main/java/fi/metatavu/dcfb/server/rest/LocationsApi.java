package fi.metatavu.dcfb.server.rest;

import fi.metatavu.dcfb.server.rest.model.BadRequest;
import fi.metatavu.dcfb.server.rest.model.Forbidden;
import fi.metatavu.dcfb.server.rest.model.InternalServerError;
import fi.metatavu.dcfb.server.rest.model.Location;
import java.util.UUID;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
import java.lang.Exception;

@Path("/locations")

@Api(description = "the locations API")
@Consumes({ "application/json;charset=utf-8" })
@Produces({ "application/json;charset=utf-8" })
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2018-09-12T14:49:29.387+03:00")


public interface LocationsApi  {

    @POST
    
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "Create location", notes = "Create location", response = Location.class, authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "Locations",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Created location", response = Location.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response createLocation(@Valid Location payload) throws Exception;

    @DELETE
    @Path("/{locationId}")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "deletes an location", notes = "Delete location", response = Void.class, authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "Locations",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Empty resonse indicating a successful removal", response = Void.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response deleteLocation(@PathParam("locationId") @ApiParam("Location id") UUID locationId) throws Exception;

    @GET
    @Path("/{locationId}")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "Finds an location", notes = "Find location", response = Location.class, authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "Locations",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A location", response = Location.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response findLocation(@PathParam("locationId") @ApiParam("Location id") UUID locationId) throws Exception;

    @GET
    
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "List locations", notes = "List locations", response = Location.class, responseContainer = "List", authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "Locations",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An array of locations", response = Location.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response listLocations(@QueryParam("search")   @ApiParam("Search by free-text query")  String search,@QueryParam("slug")   @ApiParam("Filter by location slug")  String slug,@QueryParam("sort")   @ApiParam("Sort results. See LocationListSort for sort options")  List<String> sort,@QueryParam("firstResult")   @ApiParam("First result")  Long firstResult,@QueryParam("maxResults")   @ApiParam("Max results")  Long maxResults) throws Exception;

    @PUT
    @Path("/{locationId}")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "updates an location", notes = "Update location", response = Location.class, authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "Locations" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Updated location", response = Location.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response updateLocation(@PathParam("locationId") @ApiParam("Location id") UUID locationId,@Valid Location payload) throws Exception;
}
