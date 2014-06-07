package com.daogen.clotheme;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.daogen.clotheme.Thickness;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table Thickness.
*/
public class ThicknessDao extends AbstractDao<Thickness, Long> {

    public static final String TABLENAME = "Thickness";

    /**
     * Properties of entity Thickness.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, long.class, "id", true, "_id");
        public final static Property Thickness = new Property(1, Integer.class, "Thickness", false, "THICKNESS");
        public final static Property Temperature = new Property(2, Integer.class, "Temperature", false, "TEMPERATURE");
        public final static Property Whether = new Property(3, String.class, "Whether", false, "WHETHER");
    };


    public ThicknessDao(DaoConfig config) {
        super(config);
    }
    
    public ThicknessDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'Thickness' (" + //
                "'_id' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL ," + // 0: id
                "'THICKNESS' INTEGER," + // 1: Thickness
                "'TEMPERATURE' INTEGER," + // 2: Temperature
                "'WHETHER' TEXT);"); // 3: Whether
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'Thickness'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Thickness entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
 
        Integer Thickness = entity.getThickness();
        if (Thickness != null) {
            stmt.bindLong(2, Thickness);
        }
 
        Integer Temperature = entity.getTemperature();
        if (Temperature != null) {
            stmt.bindLong(3, Temperature);
        }
 
        String Whether = entity.getWhether();
        if (Whether != null) {
            stmt.bindString(4, Whether);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Thickness readEntity(Cursor cursor, int offset) {
        Thickness entity = new Thickness( //
            cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // Thickness
            cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2), // Temperature
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3) // Whether
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Thickness entity, int offset) {
        entity.setId(cursor.getLong(offset + 0));
        entity.setThickness(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setTemperature(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
        entity.setWhether(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Thickness entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Thickness entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
