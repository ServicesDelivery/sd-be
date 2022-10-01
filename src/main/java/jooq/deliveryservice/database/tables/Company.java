/*
 * This file is generated by jOOQ.
 */
package jooq.deliveryservice.database.tables;


import java.util.function.Function;

import jooq.deliveryservice.database.Delivery;
import jooq.deliveryservice.database.Keys;
import jooq.deliveryservice.database.tables.records.CompanyRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function5;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row5;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Company extends TableImpl<CompanyRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>delivery.company</code>
     */
    public static final Company COMPANY = new Company();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CompanyRecord> getRecordType() {
        return CompanyRecord.class;
    }

    /**
     * The column <code>delivery.company.id</code>.
     */
    public final TableField<CompanyRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>delivery.company.name</code>.
     */
    public final TableField<CompanyRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>delivery.company.description</code>.
     */
    public final TableField<CompanyRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * The column <code>delivery.company.price</code>.
     */
    public final TableField<CompanyRecord, String> PRICE = createField(DSL.name("price"), SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>delivery.company.rating</code>.
     */
    public final TableField<CompanyRecord, Double> RATING = createField(DSL.name("rating"), SQLDataType.DOUBLE, this, "");

    private Company(Name alias, Table<CompanyRecord> aliased) {
        this(alias, aliased, null);
    }

    private Company(Name alias, Table<CompanyRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>delivery.company</code> table reference
     */
    public Company(String alias) {
        this(DSL.name(alias), COMPANY);
    }

    /**
     * Create an aliased <code>delivery.company</code> table reference
     */
    public Company(Name alias) {
        this(alias, COMPANY);
    }

    /**
     * Create a <code>delivery.company</code> table reference
     */
    public Company() {
        this(DSL.name("company"), null);
    }

    public <O extends Record> Company(Table<O> child, ForeignKey<O, CompanyRecord> key) {
        super(child, key, COMPANY);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Delivery.DELIVERY;
    }

    @Override
    public Identity<CompanyRecord, Integer> getIdentity() {
        return (Identity<CompanyRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<CompanyRecord> getPrimaryKey() {
        return Keys.COMPANY_PKEY;
    }

    @Override
    public Company as(String alias) {
        return new Company(DSL.name(alias), this);
    }

    @Override
    public Company as(Name alias) {
        return new Company(alias, this);
    }

    @Override
    public Company as(Table<?> alias) {
        return new Company(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Company rename(String name) {
        return new Company(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Company rename(Name name) {
        return new Company(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Company rename(Table<?> name) {
        return new Company(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, String, String, String, Double> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function5<? super Integer, ? super String, ? super String, ? super String, ? super Double, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function5<? super Integer, ? super String, ? super String, ? super String, ? super Double, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
