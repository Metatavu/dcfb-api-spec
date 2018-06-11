package fi.metatavu.dcfb.client;

import fi.metatavu.dcfb.ApiClient;
import fi.metatavu.dcfb.client.BadRequest;
import fi.metatavu.dcfb.client.Forbidden;
import fi.metatavu.dcfb.client.InternalServerError;
import fi.metatavu.dcfb.client.PurchaseRequest;
import java.util.UUID;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PurchaseRequestsApi
 */
public class PurchaseRequestsApiTest {

    private PurchaseRequestsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(PurchaseRequestsApi.class);
    }

    
    /**
     * Create purchase request
     *
     * Create purchase request
     */
    @Test
    public void createPurchaseRequestTest() {
        PurchaseRequest payload = null;
        // PurchaseRequest response = api.createPurchaseRequest(payload);

        // TODO: test validations
    }

    
    /**
     * deletes an purchase request
     *
     * Delete purchase request
     */
    @Test
    public void deletePurchaseRequestTest() {
        UUID purchaseRequestId = null;
        // api.deletePurchaseRequest(purchaseRequestId);

        // TODO: test validations
    }

    
    /**
     * Finds an purchaseRequest
     *
     * Find purchaseRequest
     */
    @Test
    public void findPurchaseRequestTest() {
        UUID purchaseRequestId = null;
        // List<PurchaseRequest> response = api.findPurchaseRequest(purchaseRequestId);

        // TODO: test validations
    }

    
    /**
     * List purchase requests
     *
     * List purchase requests
     */
    @Test
    public void listPurchaseRequestsTest() {
        String categoryIds = null;
        String search = null;
        Long firstResult = null;
        Long maxResults = null;
        // List<PurchaseRequest> response = api.listPurchaseRequests(categoryIds, search, firstResult, maxResults);

        // TODO: test validations
    }

    /**
     * List purchase requests
     *
     * List purchase requests
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listPurchaseRequestsTestQueryMap() {
        PurchaseRequestsApi.ListPurchaseRequestsQueryParams queryParams = new PurchaseRequestsApi.ListPurchaseRequestsQueryParams()
            .categoryIds(null)
            .search(null)
            .firstResult(null)
            .maxResults(null);
        // List<PurchaseRequest> response = api.listPurchaseRequests(queryParams);

    // TODO: test validations
    }
    
    /**
     * updates an purchase request
     *
     * Update purchase request
     */
    @Test
    public void updatePurchaseRequestTest() {
        UUID purchaseRequestId = null;
        PurchaseRequest payload = null;
        // PurchaseRequest response = api.updatePurchaseRequest(purchaseRequestId, payload);

        // TODO: test validations
    }

    
}
