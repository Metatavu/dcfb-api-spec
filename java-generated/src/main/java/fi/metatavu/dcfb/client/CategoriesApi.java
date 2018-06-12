package fi.metatavu.dcfb.client;

import fi.metatavu.dcfb.ApiClient;
import fi.metatavu.dcfb.EncodingUtils;

import fi.metatavu.dcfb.client.BadRequest;
import fi.metatavu.dcfb.client.Category;
import fi.metatavu.dcfb.client.Forbidden;
import fi.metatavu.dcfb.client.InternalServerError;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-11T15:59:47.037+03:00")
public interface CategoriesApi extends ApiClient.Api {


  /**
   * Create category
   * Create category
    * @param payload Payload (required)
   * @return Category
   */
  @RequestLine("POST /categories")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Category createCategory(Category payload);

  /**
   * deletes an category
   * Delete category
    * @param categoryId Category id (required)
   */
  @RequestLine("DELETE /categories/{categoryId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  void deleteCategory(@Param("categoryId") UUID categoryId);

  /**
   * Finds an category
   * Find category
    * @param categoryId Category id (required)
   * @return List&lt;Category&gt;
   */
  @RequestLine("GET /categories/{categoryId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<Category> findCategory(@Param("categoryId") UUID categoryId);

  /**
   * List categories
   * List categories
    * @param firstResult First result (optional)
    * @param maxResults Max results (optional)
   * @return List&lt;Category&gt;
   */
  @RequestLine("GET /categories?firstResult={firstResult}&maxResults={maxResults}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<Category> listCategories(@Param("firstResult") Long firstResult, @Param("maxResults") Long maxResults);

  /**
   * List categories
   * List categories
   * Note, this is equivalent to the other <code>listCategories</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListCategoriesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>firstResult - First result (optional)</li>
   *   <li>maxResults - Max results (optional)</li>
   *   </ul>
   * @return List&lt;Category&gt;
   */
  @RequestLine("GET /categories?firstResult={firstResult}&maxResults={maxResults}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  List<Category> listCategories(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listCategories</code> method in a fluent style.
   */
  public static class ListCategoriesQueryParams extends HashMap<String, Object> {
    public ListCategoriesQueryParams firstResult(final Long value) {
      put("firstResult", EncodingUtils.encode(value));
      return this;
    }
    public ListCategoriesQueryParams maxResults(final Long value) {
      put("maxResults", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * updates an category
   * Update category
    * @param categoryId Category id (required)
    * @param payload Payload (required)
   * @return Category
   */
  @RequestLine("PUT /categories/{categoryId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Category updateCategory(@Param("categoryId") UUID categoryId, Category payload);
}
