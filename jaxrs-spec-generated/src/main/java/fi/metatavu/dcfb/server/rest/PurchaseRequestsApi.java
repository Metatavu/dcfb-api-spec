package fi.metatavu.dcfb.server.rest;

import fi.metatavu.dcfb.server.rest.model.BadRequest;
import fi.metatavu.dcfb.server.rest.model.Forbidden;
import fi.metatavu.dcfb.server.rest.model.InternalServerError;
import fi.metatavu.dcfb.server.rest.model.PurchaseRequest;
import java.util.UUID;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
import java.lang.Exception;

@Path("/purchaseRequests")

@Api(description = "the purchaseRequests API")
@Consumes({ "application/json;charset=utf-8" })
@Produces({ "application/json;charset=utf-8" })
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2018-10-03T17:07:52.965+03:00")


public interface PurchaseRequestsApi  {

    @POST
    
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "Create purchase request", notes = "Create purchase request", response = PurchaseRequest.class, authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "PurchaseRequests",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Created purchaseRequest", response = PurchaseRequest.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response createPurchaseRequest(@Valid PurchaseRequest payload) throws Exception;

    @DELETE
    @Path("/{purchaseRequestId}")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "deletes an purchase request", notes = "Delete purchase request", response = Void.class, authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "PurchaseRequests",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Empty resonse indicating a successful removal", response = Void.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response deletePurchaseRequest(@PathParam("purchaseRequestId") @ApiParam("PurchaseRequest id") UUID purchaseRequestId) throws Exception;

    @GET
    @Path("/{purchaseRequestId}")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "Finds an purchaseRequest", notes = "Find purchaseRequest", response = PurchaseRequest.class, responseContainer = "List", authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "PurchaseRequests",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An array of purchase requests", response = PurchaseRequest.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response findPurchaseRequest(@PathParam("purchaseRequestId") @ApiParam("PurchaseRequest id") UUID purchaseRequestId) throws Exception;

    @GET
    
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "List purchase requests", notes = "List purchase requests", response = PurchaseRequest.class, responseContainer = "List", authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "PurchaseRequests",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An array of purchase requests", response = PurchaseRequest.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response listPurchaseRequests(@QueryParam("categoryIds")   @ApiParam("Filter by category ids (comma delimitered)")  String categoryIds,@QueryParam("search")   @ApiParam("Search  by free-text query")  String search,@QueryParam("firstResult")   @ApiParam("First result")  Long firstResult,@QueryParam("maxResults")   @ApiParam("Max results")  Long maxResults) throws Exception;

    @PUT
    @Path("/{purchaseRequestId}")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "updates an purchase request", notes = "Update purchase request", response = PurchaseRequest.class, authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "PurchaseRequests" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Updated purchaseRequest", response = PurchaseRequest.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response updatePurchaseRequest(@PathParam("purchaseRequestId") @ApiParam("PurchaseRequest id") UUID purchaseRequestId,@Valid PurchaseRequest payload) throws Exception;
}
