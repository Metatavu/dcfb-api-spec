package fi.metatavu.dcfb.client;

import fi.metatavu.dcfb.ApiClient;
import fi.metatavu.dcfb.EncodingUtils;

import fi.metatavu.dcfb.client.BadRequest;
import fi.metatavu.dcfb.client.Forbidden;
import fi.metatavu.dcfb.client.InternalServerError;
import fi.metatavu.dcfb.client.Item;
import fi.metatavu.dcfb.client.ItemReservation;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-14T16:35:48.136+03:00")
public interface ItemsApi extends ApiClient.Api {


  /**
   * Create item
   * Create item
    * @param payload Payload (required)
   * @return Item
   */
  @RequestLine("POST /items")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Item createItem(Item payload);

  /**
   * Create item reservation
   * Create item reservation
    * @param itemId Item id (required)
    * @param payload Payload (required)
   * @return ItemReservation
   */
  @RequestLine("POST /items/{itemId}/reservations")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ItemReservation createItemReservation(@Param("itemId") UUID itemId, ItemReservation payload);

  /**
   * deletes an item
   * Delete item
    * @param itemId Item id (required)
   */
  @RequestLine("DELETE /items/{itemId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  void deleteItem(@Param("itemId") UUID itemId);

  /**
   * Finds an item
   * Find item
    * @param itemId Item id (required)
   * @return Item
   */
  @RequestLine("GET /items/{itemId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Item findItem(@Param("itemId") UUID itemId);

  /**
   * Find item reservation
   * Find item reservation
    * @param itemId Item id (required)
    * @param itemReservationId Item id (required)
   * @return ItemReservation
   */
  @RequestLine("GET /items/{itemId}/reservations/{itemReservationId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ItemReservation findItemReservation(@Param("itemId") UUID itemId, @Param("itemReservationId") UUID itemReservationId);

  /**
   * List items
   * List items
    * @param categoryIds Filter by category ids (comma delimitered) (optional)
    * @param locationIds Filter by location ids (comma delimitered) (optional)
    * @param userIds Filter by user ids (comma delimitered) (optional)
    * @param search Search by free-text query (optional)
    * @param nearLat Prefer results near geo-point (optional)
    * @param nearLon Prefer results near geo-point (optional)
    * @param includeExhausted Whether to include items without any items in stock. Defaults to false (optional)
    * @param sort  (optional)
    * @param firstResult First result (optional)
    * @param maxResults Max results (optional)
   * @return List&lt;Item&gt;
   */
  @RequestLine("GET /items?categoryIds={categoryIds}&locationIds={locationIds}&userIds={userIds}&search={search}&nearLat={nearLat}&nearLon={nearLon}&includeExhausted={includeExhausted}&sort={sort}&firstResult={firstResult}&maxResults={maxResults}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<Item> listItems(@Param("categoryIds") String categoryIds, @Param("locationIds") String locationIds, @Param("userIds") String userIds, @Param("search") String search, @Param("nearLat") Double nearLat, @Param("nearLon") Double nearLon, @Param("includeExhausted") Boolean includeExhausted, @Param("sort") List<String> sort, @Param("firstResult") Long firstResult, @Param("maxResults") Long maxResults);

  /**
   * List items
   * List items
   * Note, this is equivalent to the other <code>listItems</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListItemsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>categoryIds - Filter by category ids (comma delimitered) (optional)</li>
   *   <li>locationIds - Filter by location ids (comma delimitered) (optional)</li>
   *   <li>userIds - Filter by user ids (comma delimitered) (optional)</li>
   *   <li>search - Search by free-text query (optional)</li>
   *   <li>nearLat - Prefer results near geo-point (optional)</li>
   *   <li>nearLon - Prefer results near geo-point (optional)</li>
   *   <li>includeExhausted - Whether to include items without any items in stock. Defaults to false (optional)</li>
   *   <li>sort -  (optional)</li>
   *   <li>firstResult - First result (optional)</li>
   *   <li>maxResults - Max results (optional)</li>
   *   </ul>
   * @return List&lt;Item&gt;
   */
  @RequestLine("GET /items?categoryIds={categoryIds}&locationIds={locationIds}&userIds={userIds}&search={search}&nearLat={nearLat}&nearLon={nearLon}&includeExhausted={includeExhausted}&sort={sort}&firstResult={firstResult}&maxResults={maxResults}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  List<Item> listItems(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listItems</code> method in a fluent style.
   */
  public static class ListItemsQueryParams extends HashMap<String, Object> {
    public ListItemsQueryParams categoryIds(final String value) {
      put("categoryIds", EncodingUtils.encode(value));
      return this;
    }
    public ListItemsQueryParams locationIds(final String value) {
      put("locationIds", EncodingUtils.encode(value));
      return this;
    }
    public ListItemsQueryParams userIds(final String value) {
      put("userIds", EncodingUtils.encode(value));
      return this;
    }
    public ListItemsQueryParams search(final String value) {
      put("search", EncodingUtils.encode(value));
      return this;
    }
    public ListItemsQueryParams nearLat(final Double value) {
      put("nearLat", EncodingUtils.encode(value));
      return this;
    }
    public ListItemsQueryParams nearLon(final Double value) {
      put("nearLon", EncodingUtils.encode(value));
      return this;
    }
    public ListItemsQueryParams includeExhausted(final Boolean value) {
      put("includeExhausted", EncodingUtils.encode(value));
      return this;
    }
    public ListItemsQueryParams sort(final List<String> value) {
      put("sort", EncodingUtils.encodeCollection(value, "csv"));
      return this;
    }
    public ListItemsQueryParams firstResult(final Long value) {
      put("firstResult", EncodingUtils.encode(value));
      return this;
    }
    public ListItemsQueryParams maxResults(final Long value) {
      put("maxResults", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * updates an item
   * Update item
    * @param itemId Item id (required)
    * @param payload Payload (required)
   * @return Item
   */
  @RequestLine("PUT /items/{itemId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Item updateItem(@Param("itemId") UUID itemId, Item payload);
}
