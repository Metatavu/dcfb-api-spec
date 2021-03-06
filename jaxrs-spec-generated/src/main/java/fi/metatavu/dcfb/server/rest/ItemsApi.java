package fi.metatavu.dcfb.server.rest;

import fi.metatavu.dcfb.server.rest.model.BadRequest;
import fi.metatavu.dcfb.server.rest.model.Forbidden;
import fi.metatavu.dcfb.server.rest.model.InternalServerError;
import fi.metatavu.dcfb.server.rest.model.Item;
import fi.metatavu.dcfb.server.rest.model.ItemReservation;
import java.util.UUID;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
import java.lang.Exception;

@Path("/items")

@Api(description = "the items API")
@Consumes({ "application/json;charset=utf-8" })
@Produces({ "application/json;charset=utf-8" })
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2018-10-08T15:30:25.166+03:00")


public interface ItemsApi  {

    @POST
    
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "Create item", notes = "Create item", response = Item.class, authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "Items",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Created item", response = Item.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response createItem(@Valid Item payload) throws Exception;

    @POST
    @Path("/{itemId}/reservations")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "Create item reservation", notes = "Create item reservation", response = ItemReservation.class, authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "Items",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Created item reservation", response = ItemReservation.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response createItemReservation(@PathParam("itemId") @ApiParam("Item id") UUID itemId,@Valid ItemReservation payload) throws Exception;

    @DELETE
    @Path("/{itemId}")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "deletes an item", notes = "Delete item", response = Void.class, authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "Items",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Empty resonse indicating a successful removal", response = Void.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response deleteItem(@PathParam("itemId") @ApiParam("Item id") UUID itemId) throws Exception;

    @GET
    @Path("/{itemId}")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "Finds an item", notes = "Find item", response = Item.class, authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "Items",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An item", response = Item.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response findItem(@PathParam("itemId") @ApiParam("Item id") UUID itemId) throws Exception;

    @GET
    @Path("/{itemId}/reservations/{itemReservationId}")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "Find item reservation", notes = "Find item reservation", response = ItemReservation.class, authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "Items",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Found item reservation", response = ItemReservation.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response findItemReservation(@PathParam("itemId") @ApiParam("Item id") UUID itemId,@PathParam("itemReservationId") @ApiParam("Item id") UUID itemReservationId) throws Exception;

    @GET
    
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "List items", notes = "List items", response = Item.class, responseContainer = "List", authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "Items",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An array of items", response = Item.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response listItems(@QueryParam("categoryIds")   @ApiParam("Filter by category ids (comma delimitered)")  String categoryIds,@QueryParam("locationIds")   @ApiParam("Filter by location ids (comma delimitered)")  String locationIds,@QueryParam("userIds")   @ApiParam("Filter by user ids (comma delimitered)")  String userIds,@QueryParam("search")   @ApiParam("Search by free-text query")  String search,@QueryParam("nearLat")   @ApiParam("Prefer results near geo-point")  Double nearLat,@QueryParam("nearLon")   @ApiParam("Prefer results near geo-point")  Double nearLon,@QueryParam("includeExhausted")   @ApiParam("Whether to include items without any items in stock. Defaults to false")  Boolean includeExhausted,@QueryParam("sort")    List<String> sort,@QueryParam("firstResult")   @ApiParam("First result")  Long firstResult,@QueryParam("maxResults")   @ApiParam("Max results")  Long maxResults) throws Exception;

    @PUT
    @Path("/{itemId}")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "updates an item", notes = "Update item", response = Item.class, authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "Items" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Updated item", response = Item.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response updateItem(@PathParam("itemId") @ApiParam("Item id") UUID itemId,@Valid Item payload) throws Exception;
}
