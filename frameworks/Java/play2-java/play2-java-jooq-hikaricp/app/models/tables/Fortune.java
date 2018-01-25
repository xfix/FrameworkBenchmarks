/*
 * This file is generated by jOOQ.
*/
package models.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import models.HelloWorld;
import models.Indexes;
import models.Keys;
import models.tables.records.FortuneRecord;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Fortune extends TableImpl<FortuneRecord> {

    private static final long serialVersionUID = -1486345712;

    /**
     * The reference instance of <code>hello_world.fortune</code>
     */
    public static final Fortune FORTUNE = new Fortune();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FortuneRecord> getRecordType() {
        return FortuneRecord.class;
    }

    /**
     * The column <code>hello_world.fortune.id</code>.
     */
    public final TableField<FortuneRecord, UInteger> ID = createField("id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>hello_world.fortune.message</code>.
     */
    public final TableField<FortuneRecord, String> MESSAGE = createField("message", org.jooq.impl.SQLDataType.VARCHAR(2048).nullable(false), this, "");

    /**
     * Create a <code>hello_world.fortune</code> table reference
     */
    public Fortune() {
        this(DSL.name("fortune"), null);
    }

    /**
     * Create an aliased <code>hello_world.fortune</code> table reference
     */
    public Fortune(String alias) {
        this(DSL.name(alias), FORTUNE);
    }

    /**
     * Create an aliased <code>hello_world.fortune</code> table reference
     */
    public Fortune(Name alias) {
        this(alias, FORTUNE);
    }

    private Fortune(Name alias, Table<FortuneRecord> aliased) {
        this(alias, aliased, null);
    }

    private Fortune(Name alias, Table<FortuneRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return HelloWorld.HELLO_WORLD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.FORTUNE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<FortuneRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_FORTUNE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FortuneRecord> getPrimaryKey() {
        return Keys.KEY_FORTUNE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FortuneRecord>> getKeys() {
        return Arrays.<UniqueKey<FortuneRecord>>asList(Keys.KEY_FORTUNE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Fortune as(String alias) {
        return new Fortune(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Fortune as(Name alias) {
        return new Fortune(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Fortune rename(String name) {
        return new Fortune(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Fortune rename(Name name) {
        return new Fortune(name, null);
    }
}