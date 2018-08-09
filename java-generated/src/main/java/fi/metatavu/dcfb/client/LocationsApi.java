package fi.metatavu.dcfb.client;

import fi.metatavu.dcfb.ApiClient;
import fi.metatavu.dcfb.EncodingUtils;

import fi.metatavu.dcfb.client.BadRequest;
import fi.metatavu.dcfb.client.Forbidden;
import fi.metatavu.dcfb.client.InternalServerError;
import fi.metatavu.dcfb.client.Location;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-09T09:29:27.492+03:00")
public interface LocationsApi extends ApiClient.Api {


  /**
   * Create location
   * Create location
    * @param payload Payload (required)
   * @return Location
   */
  @RequestLine("POST /locations")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Location createLocation(Location payload);

  /**
   * deletes an location
   * Delete location
    * @param locationId Location id (required)
   */
  @RequestLine("DELETE /locations/{locationId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  void deleteLocation(@Param("locationId") UUID locationId);

  /**
   * Finds an location
   * Find location
    * @param locationId Location id (required)
   * @return Location
   */
  @RequestLine("GET /locations/{locationId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Location findLocation(@Param("locationId") UUID locationId);

  /**
   * List locations
   * List locations
    * @param search Search by free-text query (optional)
    * @param slug Filter by location slug (optional)
    * @param sort Sort results. See LocationListSort for sort options (optional)
    * @param firstResult First result (optional)
    * @param maxResults Max results (optional)
   * @return List&lt;Location&gt;
   */
  @RequestLine("GET /locations?search={search}&slug={slug}&sort={sort}&firstResult={firstResult}&maxResults={maxResults}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<Location> listLocations(@Param("search") String search, @Param("slug") String slug, @Param("sort") List<String> sort, @Param("firstResult") Long firstResult, @Param("maxResults") Long maxResults);

  /**
   * List locations
   * List locations
   * Note, this is equivalent to the other <code>listLocations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListLocationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>search - Search by free-text query (optional)</li>
   *   <li>slug - Filter by location slug (optional)</li>
   *   <li>sort - Sort results. See LocationListSort for sort options (optional)</li>
   *   <li>firstResult - First result (optional)</li>
   *   <li>maxResults - Max results (optional)</li>
   *   </ul>
   * @return List&lt;Location&gt;
   */
  @RequestLine("GET /locations?search={search}&slug={slug}&sort={sort}&firstResult={firstResult}&maxResults={maxResults}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  List<Location> listLocations(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listLocations</code> method in a fluent style.
   */
  public static class ListLocationsQueryParams extends HashMap<String, Object> {
    public ListLocationsQueryParams search(final String value) {
      put("search", EncodingUtils.encode(value));
      return this;
    }
    public ListLocationsQueryParams slug(final String value) {
      put("slug", EncodingUtils.encode(value));
      return this;
    }
    public ListLocationsQueryParams sort(final List<String> value) {
      put("sort", EncodingUtils.encodeCollection(value, "csv"));
      return this;
    }
    public ListLocationsQueryParams firstResult(final Long value) {
      put("firstResult", EncodingUtils.encode(value));
      return this;
    }
    public ListLocationsQueryParams maxResults(final Long value) {
      put("maxResults", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * updates an location
   * Update location
    * @param locationId Location id (required)
    * @param payload Payload (required)
   * @return Location
   */
  @RequestLine("PUT /locations/{locationId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Location updateLocation(@Param("locationId") UUID locationId, Location payload);
}
