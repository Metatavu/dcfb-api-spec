package fi.metatavu.dcfb.client;

import fi.metatavu.dcfb.ApiClient;
import fi.metatavu.dcfb.client.BadRequest;
import fi.metatavu.dcfb.client.Category;
import fi.metatavu.dcfb.client.Forbidden;
import fi.metatavu.dcfb.client.InternalServerError;
import java.util.UUID;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CategoriesApi
 */
public class CategoriesApiTest {

    private CategoriesApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(CategoriesApi.class);
    }

    
    /**
     * Create category
     *
     * Create category
     */
    @Test
    public void createCategoryTest() {
        Category payload = null;
        // Category response = api.createCategory(payload);

        // TODO: test validations
    }

    
    /**
     * deletes an category
     *
     * Delete category
     */
    @Test
    public void deleteCategoryTest() {
        UUID categoryId = null;
        // api.deleteCategory(categoryId);

        // TODO: test validations
    }

    
    /**
     * Finds an category
     *
     * Find category
     */
    @Test
    public void findCategoryTest() {
        UUID categoryId = null;
        // Category response = api.findCategory(categoryId);

        // TODO: test validations
    }

    
    /**
     * List categories
     *
     * List categories
     */
    @Test
    public void listCategoriesTest() {
        String categoryIds = null;
        String search = null;
        Long firstResult = null;
        Long maxResults = null;
        // List<Category> response = api.listCategories(categoryIds, search, firstResult, maxResults);

        // TODO: test validations
    }

    /**
     * List categories
     *
     * List categories
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listCategoriesTestQueryMap() {
        CategoriesApi.ListCategoriesQueryParams queryParams = new CategoriesApi.ListCategoriesQueryParams()
            .categoryIds(null)
            .search(null)
            .firstResult(null)
            .maxResults(null);
        // List<Category> response = api.listCategories(queryParams);

    // TODO: test validations
    }
    
    /**
     * updates an category
     *
     * Update category
     */
    @Test
    public void updateCategoryTest() {
        UUID categoryId = null;
        Category payload = null;
        // Category response = api.updateCategory(categoryId, payload);

        // TODO: test validations
    }

    
}
