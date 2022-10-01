/*
 * This file is generated by jOOQ.
 */
package jooq.deliveryservice.database.tables.daos;


import java.util.List;
import java.util.Optional;

import jooq.deliveryservice.database.tables.Subcategory;
import jooq.deliveryservice.database.tables.records.SubcategoryRecord;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SubcategoryDao extends DAOImpl<SubcategoryRecord, jooq.deliveryservice.database.tables.pojos.Subcategory, Integer> {

    /**
     * Create a new SubcategoryDao without any configuration
     */
    public SubcategoryDao() {
        super(Subcategory.SUBCATEGORY, jooq.deliveryservice.database.tables.pojos.Subcategory.class);
    }

    /**
     * Create a new SubcategoryDao with an attached configuration
     */
    public SubcategoryDao(Configuration configuration) {
        super(Subcategory.SUBCATEGORY, jooq.deliveryservice.database.tables.pojos.Subcategory.class, configuration);
    }

    @Override
    public Integer getId(jooq.deliveryservice.database.tables.pojos.Subcategory object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<jooq.deliveryservice.database.tables.pojos.Subcategory> fetchRangeOfId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Subcategory.SUBCATEGORY.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<jooq.deliveryservice.database.tables.pojos.Subcategory> fetchById(Integer... values) {
        return fetch(Subcategory.SUBCATEGORY.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public jooq.deliveryservice.database.tables.pojos.Subcategory fetchOneById(Integer value) {
        return fetchOne(Subcategory.SUBCATEGORY.ID, value);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public Optional<jooq.deliveryservice.database.tables.pojos.Subcategory> fetchOptionalById(Integer value) {
        return fetchOptional(Subcategory.SUBCATEGORY.ID, value);
    }

    /**
     * Fetch records that have <code>name BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<jooq.deliveryservice.database.tables.pojos.Subcategory> fetchRangeOfName(String lowerInclusive, String upperInclusive) {
        return fetchRange(Subcategory.SUBCATEGORY.NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<jooq.deliveryservice.database.tables.pojos.Subcategory> fetchByName(String... values) {
        return fetch(Subcategory.SUBCATEGORY.NAME, values);
    }

    /**
     * Fetch records that have <code>category_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<jooq.deliveryservice.database.tables.pojos.Subcategory> fetchRangeOfCategoryId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Subcategory.SUBCATEGORY.CATEGORY_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>category_id IN (values)</code>
     */
    public List<jooq.deliveryservice.database.tables.pojos.Subcategory> fetchByCategoryId(Integer... values) {
        return fetch(Subcategory.SUBCATEGORY.CATEGORY_ID, values);
    }
}
