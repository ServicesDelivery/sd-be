/*
 * This file is generated by jOOQ.
 */
package jooq.deliveryservice.database;


import jooq.deliveryservice.database.tables.Address;
import jooq.deliveryservice.database.tables.Category;
import jooq.deliveryservice.database.tables.Company;
import jooq.deliveryservice.database.tables.CompanyCategory;
import jooq.deliveryservice.database.tables.District;
import jooq.deliveryservice.database.tables.Subcategory;
import jooq.deliveryservice.database.tables.User;
import jooq.deliveryservice.database.tables.UserInfo;


/**
 * Convenience access to all tables in delivery.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>delivery.address</code>.
     */
    public static final Address ADDRESS = Address.ADDRESS;

    /**
     * The table <code>delivery.category</code>.
     */
    public static final Category CATEGORY = Category.CATEGORY;

    /**
     * The table <code>delivery.company</code>.
     */
    public static final Company COMPANY = Company.COMPANY;

    /**
     * The table <code>delivery.company_category</code>.
     */
    public static final CompanyCategory COMPANY_CATEGORY = CompanyCategory.COMPANY_CATEGORY;

    /**
     * The table <code>delivery.district</code>.
     */
    public static final District DISTRICT = District.DISTRICT;

    /**
     * The table <code>delivery.subcategory</code>.
     */
    public static final Subcategory SUBCATEGORY = Subcategory.SUBCATEGORY;

    /**
     * The table <code>delivery.user</code>.
     */
    public static final User USER = User.USER;

    /**
     * The table <code>delivery.user_info</code>.
     */
    public static final UserInfo USER_INFO = UserInfo.USER_INFO;
}
