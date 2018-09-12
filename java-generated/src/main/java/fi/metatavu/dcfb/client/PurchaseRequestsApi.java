package fi.metatavu.dcfb.client;

import fi.metatavu.dcfb.ApiClient;
import fi.metatavu.dcfb.EncodingUtils;

import fi.metatavu.dcfb.client.BadRequest;
import fi.metatavu.dcfb.client.Forbidden;
import fi.metatavu.dcfb.client.InternalServerError;
import fi.metatavu.dcfb.client.PurchaseRequest;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-12T15:03:11.037+03:00")
public interface PurchaseRequestsApi extends ApiClient.Api {


  /**
   * Create purchase request
   * Create purchase request
    * @param payload Payload (required)
   * @return PurchaseRequest
   */
  @RequestLine("POST /purchaseRequests")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PurchaseRequest createPurchaseRequest(PurchaseRequest payload);

  /**
   * deletes an purchase request
   * Delete purchase request
    * @param purchaseRequestId PurchaseRequest id (required)
   */
  @RequestLine("DELETE /purchaseRequests/{purchaseRequestId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  void deletePurchaseRequest(@Param("purchaseRequestId") UUID purchaseRequestId);

  /**
   * Finds an purchaseRequest
   * Find purchaseRequest
    * @param purchaseRequestId PurchaseRequest id (required)
   * @return List&lt;PurchaseRequest&gt;
   */
  @RequestLine("GET /purchaseRequests/{purchaseRequestId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<PurchaseRequest> findPurchaseRequest(@Param("purchaseRequestId") UUID purchaseRequestId);

  /**
   * List purchase requests
   * List purchase requests
    * @param categoryIds Filter by category ids (comma delimitered) (optional)
    * @param search Search  by free-text query (optional)
    * @param firstResult First result (optional)
    * @param maxResults Max results (optional)
   * @return List&lt;PurchaseRequest&gt;
   */
  @RequestLine("GET /purchaseRequests?categoryIds={categoryIds}&search={search}&firstResult={firstResult}&maxResults={maxResults}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<PurchaseRequest> listPurchaseRequests(@Param("categoryIds") String categoryIds, @Param("search") String search, @Param("firstResult") Long firstResult, @Param("maxResults") Long maxResults);

  /**
   * List purchase requests
   * List purchase requests
   * Note, this is equivalent to the other <code>listPurchaseRequests</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListPurchaseRequestsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>categoryIds - Filter by category ids (comma delimitered) (optional)</li>
   *   <li>search - Search  by free-text query (optional)</li>
   *   <li>firstResult - First result (optional)</li>
   *   <li>maxResults - Max results (optional)</li>
   *   </ul>
   * @return List&lt;PurchaseRequest&gt;
   */
  @RequestLine("GET /purchaseRequests?categoryIds={categoryIds}&search={search}&firstResult={firstResult}&maxResults={maxResults}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  List<PurchaseRequest> listPurchaseRequests(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listPurchaseRequests</code> method in a fluent style.
   */
  public static class ListPurchaseRequestsQueryParams extends HashMap<String, Object> {
    public ListPurchaseRequestsQueryParams categoryIds(final String value) {
      put("categoryIds", EncodingUtils.encode(value));
      return this;
    }
    public ListPurchaseRequestsQueryParams search(final String value) {
      put("search", EncodingUtils.encode(value));
      return this;
    }
    public ListPurchaseRequestsQueryParams firstResult(final Long value) {
      put("firstResult", EncodingUtils.encode(value));
      return this;
    }
    public ListPurchaseRequestsQueryParams maxResults(final Long value) {
      put("maxResults", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * updates an purchase request
   * Update purchase request
    * @param purchaseRequestId PurchaseRequest id (required)
    * @param payload Payload (required)
   * @return PurchaseRequest
   */
  @RequestLine("PUT /purchaseRequests/{purchaseRequestId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PurchaseRequest updatePurchaseRequest(@Param("purchaseRequestId") UUID purchaseRequestId, PurchaseRequest payload);
}
