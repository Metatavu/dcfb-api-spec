package fi.metatavu.dcfb.server.rest;

import fi.metatavu.dcfb.server.rest.model.BadRequest;
import fi.metatavu.dcfb.server.rest.model.Category;
import fi.metatavu.dcfb.server.rest.model.Forbidden;
import fi.metatavu.dcfb.server.rest.model.InternalServerError;
import java.util.UUID;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
import java.lang.Exception;

@Path("/categories")

@Api(description = "the categories API")
@Consumes({ "application/json;charset=utf-8" })
@Produces({ "application/json;charset=utf-8" })
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2018-09-11T16:33:50.661+03:00")


public interface CategoriesApi  {

    @POST
    
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "Create category", notes = "Create category", response = Category.class, authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "Categories",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Created category", response = Category.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response createCategory(@Valid Category payload) throws Exception;

    @DELETE
    @Path("/{categoryId}")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "deletes an category", notes = "Delete category", response = Void.class, authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "Categories",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Empty resonse indicating a successful removal", response = Void.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response deleteCategory(@PathParam("categoryId") @ApiParam("Category id") UUID categoryId) throws Exception;

    @GET
    @Path("/{categoryId}")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "Finds an category", notes = "Find category", response = Category.class, authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "Categories",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A category", response = Category.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response findCategory(@PathParam("categoryId") @ApiParam("Category id") UUID categoryId) throws Exception;

    @GET
    
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "List categories", notes = "List categories", response = Category.class, responseContainer = "List", authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "Categories",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An array of categories", response = Category.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response listCategories(@QueryParam("parentId")   @ApiParam("Filter by parent category id")  UUID parentId,@QueryParam("search")   @ApiParam("Search by free-text query")  String search,@QueryParam("slug")   @ApiParam("Filter by category slug")  String slug,@QueryParam("sort")   @ApiParam("Sort results. See CategoryListSort for sort options")  List<String> sort,@QueryParam("firstResult")   @ApiParam("First result")  Long firstResult,@QueryParam("maxResults")   @ApiParam("Max results")  Long maxResults) throws Exception;

    @PUT
    @Path("/{categoryId}")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "updates an category", notes = "Update category", response = Category.class, authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "Categories" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Updated category", response = Category.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response updateCategory(@PathParam("categoryId") @ApiParam("Category id") UUID categoryId,@Valid Category payload) throws Exception;
}
