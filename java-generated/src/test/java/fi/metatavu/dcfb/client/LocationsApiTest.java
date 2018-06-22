package fi.metatavu.dcfb.client;

import fi.metatavu.dcfb.ApiClient;
import fi.metatavu.dcfb.client.BadRequest;
import fi.metatavu.dcfb.client.Forbidden;
import fi.metatavu.dcfb.client.InternalServerError;
import fi.metatavu.dcfb.client.Location;
import java.util.UUID;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LocationsApi
 */
public class LocationsApiTest {

    private LocationsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(LocationsApi.class);
    }

    
    /**
     * Create location
     *
     * Create location
     */
    @Test
    public void createLocationTest() {
        Location payload = null;
        // Location response = api.createLocation(payload);

        // TODO: test validations
    }

    
    /**
     * deletes an location
     *
     * Delete location
     */
    @Test
    public void deleteLocationTest() {
        UUID locationId = null;
        // api.deleteLocation(locationId);

        // TODO: test validations
    }

    
    /**
     * Finds an location
     *
     * Find location
     */
    @Test
    public void findLocationTest() {
        UUID locationId = null;
        // Location response = api.findLocation(locationId);

        // TODO: test validations
    }

    
    /**
     * List locations
     *
     * List locations
     */
    @Test
    public void listLocationsTest() {
        String search = null;
        String slug = null;
        List<String> sort = null;
        Long firstResult = null;
        Long maxResults = null;
        // List<Location> response = api.listLocations(search, slug, sort, firstResult, maxResults);

        // TODO: test validations
    }

    /**
     * List locations
     *
     * List locations
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listLocationsTestQueryMap() {
        LocationsApi.ListLocationsQueryParams queryParams = new LocationsApi.ListLocationsQueryParams()
            .search(null)
            .slug(null)
            .sort(null)
            .firstResult(null)
            .maxResults(null);
        // List<Location> response = api.listLocations(queryParams);

    // TODO: test validations
    }
    
    /**
     * updates an location
     *
     * Update location
     */
    @Test
    public void updateLocationTest() {
        UUID locationId = null;
        Location payload = null;
        // Location response = api.updateLocation(locationId, payload);

        // TODO: test validations
    }

    
}
