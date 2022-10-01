/*
 * This file is generated by jOOQ.
 */
package jooq.deliveryservice.database.tables.daos;


import java.util.List;
import java.util.Optional;

import jooq.deliveryservice.database.tables.UserInfo;
import jooq.deliveryservice.database.tables.records.UserInfoRecord;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserInfoDao extends DAOImpl<UserInfoRecord, jooq.deliveryservice.database.tables.pojos.UserInfo, Integer> {

    /**
     * Create a new UserInfoDao without any configuration
     */
    public UserInfoDao() {
        super(UserInfo.USER_INFO, jooq.deliveryservice.database.tables.pojos.UserInfo.class);
    }

    /**
     * Create a new UserInfoDao with an attached configuration
     */
    public UserInfoDao(Configuration configuration) {
        super(UserInfo.USER_INFO, jooq.deliveryservice.database.tables.pojos.UserInfo.class, configuration);
    }

    @Override
    public Integer getId(jooq.deliveryservice.database.tables.pojos.UserInfo object) {
        return object.getUserId();
    }

    /**
     * Fetch records that have <code>user_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<jooq.deliveryservice.database.tables.pojos.UserInfo> fetchRangeOfUserId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(UserInfo.USER_INFO.USER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>user_id IN (values)</code>
     */
    public List<jooq.deliveryservice.database.tables.pojos.UserInfo> fetchByUserId(Integer... values) {
        return fetch(UserInfo.USER_INFO.USER_ID, values);
    }

    /**
     * Fetch a unique record that has <code>user_id = value</code>
     */
    public jooq.deliveryservice.database.tables.pojos.UserInfo fetchOneByUserId(Integer value) {
        return fetchOne(UserInfo.USER_INFO.USER_ID, value);
    }

    /**
     * Fetch a unique record that has <code>user_id = value</code>
     */
    public Optional<jooq.deliveryservice.database.tables.pojos.UserInfo> fetchOptionalByUserId(Integer value) {
        return fetchOptional(UserInfo.USER_INFO.USER_ID, value);
    }
}