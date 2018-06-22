package fi.metatavu.dcfb.client;

import fi.metatavu.dcfb.ApiClient;
import fi.metatavu.dcfb.client.BadRequest;
import fi.metatavu.dcfb.client.Forbidden;
import fi.metatavu.dcfb.client.InternalServerError;
import fi.metatavu.dcfb.client.Item;
import java.util.UUID;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ItemsApi
 */
public class ItemsApiTest {

    private ItemsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(ItemsApi.class);
    }

    
    /**
     * Create item
     *
     * Create item
     */
    @Test
    public void createItemTest() {
        Item payload = null;
        // Item response = api.createItem(payload);

        // TODO: test validations
    }

    
    /**
     * deletes an item
     *
     * Delete item
     */
    @Test
    public void deleteItemTest() {
        UUID itemId = null;
        // api.deleteItem(itemId);

        // TODO: test validations
    }

    
    /**
     * Finds an item
     *
     * Find item
     */
    @Test
    public void findItemTest() {
        UUID itemId = null;
        // Item response = api.findItem(itemId);

        // TODO: test validations
    }

    
    /**
     * List items
     *
     * List items
     */
    @Test
    public void listItemsTest() {
        String categoryIds = null;
        String locationds = null;
        String search = null;
        List<String> sort = null;
        Long firstResult = null;
        Long maxResults = null;
        // List<Item> response = api.listItems(categoryIds, locationds, search, sort, firstResult, maxResults);

        // TODO: test validations
    }

    /**
     * List items
     *
     * List items
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listItemsTestQueryMap() {
        ItemsApi.ListItemsQueryParams queryParams = new ItemsApi.ListItemsQueryParams()
            .categoryIds(null)
            .locationds(null)
            .search(null)
            .sort(null)
            .firstResult(null)
            .maxResults(null);
        // List<Item> response = api.listItems(queryParams);

    // TODO: test validations
    }
    
    /**
     * updates an item
     *
     * Update item
     */
    @Test
    public void updateItemTest() {
        UUID itemId = null;
        Item payload = null;
        // Item response = api.updateItem(itemId, payload);

        // TODO: test validations
    }

    
}
