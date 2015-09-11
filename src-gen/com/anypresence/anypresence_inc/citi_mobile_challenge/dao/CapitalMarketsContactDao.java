package com.anypresence.anypresence_inc.citi_mobile_challenge.dao;

import java.util.List;
import java.util.ArrayList;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.SqlUtils;
import de.greenrobot.dao.internal.DaoConfig;

import com.anypresence.anypresence_inc.citi_mobile_challenge.dao.CapitalMarketsContact;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table CAPITALMARKETSCONTACTS.
 */
public class CapitalMarketsContactDao
		extends
			AbstractDao<CapitalMarketsContact, Long> {

	public static final String TABLENAME = "CAPITALMARKETSCONTACTS";

	/**
	 * Properties of entity CapitalMarketsContact.<br/>
	 * Can be used for QueryBuilder and for referencing column names.
	 */
	public static class Properties {
		public final static Property Id = new Property(0, Long.class, "id",
				true, "_id");
		public final static Property Address = new Property(1, String.class,
				"address", false, "ADDRESS");
		public final static Property City = new Property(2, String.class,
				"city", false, "CITY");
		public final static Property ClientName = new Property(3, String.class,
				"clientName", false, "CLIENT_NAME");
		public final static Property Country = new Property(4, String.class,
				"country", false, "COUNTRY");
		public final static Property Email = new Property(5, String.class,
				"email", false, "EMAIL");
		public final static Property JobRole = new Property(6, String.class,
				"jobRole", false, "JOB_ROLE");
		public final static Property JobTitle = new Property(7, String.class,
				"jobTitle", false, "JOB_TITLE");
		public final static Property Name = new Property(8, String.class,
				"name", false, "NAME");
		public final static Property Phone = new Property(9, String.class,
				"phone", false, "PHONE");
		public final static Property State = new Property(10, String.class,
				"state", false, "STATE");
		public final static Property Year = new Property(11, Integer.class,
				"year", false, "YEAR");
		public final static Property Scope = new Property(12, String.class,
				"scope", false, "SCOPE");
		public final static Property ObjectId = new Property(13, String.class,
				"objectId", false, "OBJECT_ID");
		public final static Property _cacheUpdatedAt = new Property(14,
				java.util.Date.class, "_cacheUpdatedAt", false,
				"_CACHE_UPDATED_AT");
		public final static Property ApCachedRequestId = new Property(15,
				Long.class, "apCachedRequestId", false, "AP_CACHED_REQUEST_ID");
	};

	private DaoSession daoSession;

	public CapitalMarketsContactDao(DaoConfig config) {
		super(config);
	}

	public CapitalMarketsContactDao(DaoConfig config, DaoSession daoSession) {
		super(config, daoSession);
		this.daoSession = daoSession;
	}

	/** Creates the underlying database table. */
	public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
		String constraint = ifNotExists ? "IF NOT EXISTS " : "";
		db.execSQL("CREATE TABLE " + constraint + "'CAPITALMARKETSCONTACTS' (" + //
				"'_id' INTEGER PRIMARY KEY ," + // 0: id
				"'ADDRESS' TEXT," + // 1: address
				"'CITY' TEXT," + // 2: city
				"'CLIENT_NAME' TEXT," + // 3: clientName
				"'COUNTRY' TEXT," + // 4: country
				"'EMAIL' TEXT," + // 5: email
				"'JOB_ROLE' TEXT," + // 6: jobRole
				"'JOB_TITLE' TEXT," + // 7: jobTitle
				"'NAME' TEXT," + // 8: name
				"'PHONE' TEXT," + // 9: phone
				"'STATE' TEXT," + // 10: state
				"'YEAR' INTEGER," + // 11: year
				"'SCOPE' TEXT," + // 12: scope
				"'OBJECT_ID' TEXT," + // 13: objectId
				"'_CACHE_UPDATED_AT' INTEGER," + // 14: _cacheUpdatedAt
				"'AP_CACHED_REQUEST_ID' INTEGER);"); // 15: apCachedRequestId
		// Add Indexes
		db.execSQL("CREATE UNIQUE INDEX "
				+ constraint
				+ "IDX_CAPITALMARKETSCONTACTS_OBJECT_ID ON CAPITALMARKETSCONTACTS"
				+ " (OBJECT_ID);");
	}

	/** Drops the underlying database table. */
	public static void dropTable(SQLiteDatabase db, boolean ifExists) {
		String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "")
				+ "'CAPITALMARKETSCONTACTS'";
		db.execSQL(sql);
	}

	/** @inheritdoc */
	@Override
	protected void bindValues(SQLiteStatement stmt, CapitalMarketsContact entity) {
		stmt.clearBindings();

		Long id = entity.getId();
		if (id != null) {
			stmt.bindLong(1, id);
		}

		String address = entity.getAddress();
		if (address != null) {
			stmt.bindString(2, address);
		}

		String city = entity.getCity();
		if (city != null) {
			stmt.bindString(3, city);
		}

		String clientName = entity.getClientName();
		if (clientName != null) {
			stmt.bindString(4, clientName);
		}

		String country = entity.getCountry();
		if (country != null) {
			stmt.bindString(5, country);
		}

		String email = entity.getEmail();
		if (email != null) {
			stmt.bindString(6, email);
		}

		String jobRole = entity.getJobRole();
		if (jobRole != null) {
			stmt.bindString(7, jobRole);
		}

		String jobTitle = entity.getJobTitle();
		if (jobTitle != null) {
			stmt.bindString(8, jobTitle);
		}

		String name = entity.getName();
		if (name != null) {
			stmt.bindString(9, name);
		}

		String phone = entity.getPhone();
		if (phone != null) {
			stmt.bindString(10, phone);
		}

		String state = entity.getState();
		if (state != null) {
			stmt.bindString(11, state);
		}

		Integer year = entity.getYear();
		if (year != null) {
			stmt.bindLong(12, year);
		}

		String scope = entity.getScope();
		if (scope != null) {
			stmt.bindString(13, scope);
		}

		String objectId = entity.getObjectId();
		if (objectId != null) {
			stmt.bindString(14, objectId);
		}

		java.util.Date _cacheUpdatedAt = entity.get_cacheUpdatedAt();
		if (_cacheUpdatedAt != null) {
			stmt.bindLong(15, _cacheUpdatedAt.getTime());
		}

		Long apCachedRequestId = entity.getApCachedRequestId();
		if (apCachedRequestId != null) {
			stmt.bindLong(16, apCachedRequestId);
		}
	}

	@Override
	protected void attachEntity(CapitalMarketsContact entity) {
		super.attachEntity(entity);
		entity.__setDaoSession(daoSession);
	}

	/** @inheritdoc */
	@Override
	public Long readKey(Cursor cursor, int offset) {
		return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
	}

	/** @inheritdoc */
	@Override
	public CapitalMarketsContact readEntity(Cursor cursor, int offset) {
		CapitalMarketsContact entity = new CapitalMarketsContact(
				//
				cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
				cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // address
				cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // city
				cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // clientName
				cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // country
				cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // email
				cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // jobRole
				cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // jobTitle
				cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // name
				cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // phone
				cursor.isNull(offset + 10) ? null : cursor
						.getString(offset + 10), // state
				cursor.isNull(offset + 11) ? null : cursor.getInt(offset + 11), // year
				cursor.isNull(offset + 12) ? null : cursor
						.getString(offset + 12), // scope
				cursor.isNull(offset + 13) ? null : cursor
						.getString(offset + 13), // objectId
				cursor.isNull(offset + 14) ? null : new java.util.Date(cursor
						.getLong(offset + 14)), // _cacheUpdatedAt
				cursor.isNull(offset + 15) ? null : cursor.getLong(offset + 15) // apCachedRequestId
		);
		return entity;
	}

	/** @inheritdoc */
	@Override
	public void readEntity(Cursor cursor, CapitalMarketsContact entity,
			int offset) {
		entity.setId(cursor.isNull(offset + 0) ? null : cursor
				.getLong(offset + 0));
		entity.setAddress(cursor.isNull(offset + 1) ? null : cursor
				.getString(offset + 1));
		entity.setCity(cursor.isNull(offset + 2) ? null : cursor
				.getString(offset + 2));
		entity.setClientName(cursor.isNull(offset + 3) ? null : cursor
				.getString(offset + 3));
		entity.setCountry(cursor.isNull(offset + 4) ? null : cursor
				.getString(offset + 4));
		entity.setEmail(cursor.isNull(offset + 5) ? null : cursor
				.getString(offset + 5));
		entity.setJobRole(cursor.isNull(offset + 6) ? null : cursor
				.getString(offset + 6));
		entity.setJobTitle(cursor.isNull(offset + 7) ? null : cursor
				.getString(offset + 7));
		entity.setName(cursor.isNull(offset + 8) ? null : cursor
				.getString(offset + 8));
		entity.setPhone(cursor.isNull(offset + 9) ? null : cursor
				.getString(offset + 9));
		entity.setState(cursor.isNull(offset + 10) ? null : cursor
				.getString(offset + 10));
		entity.setYear(cursor.isNull(offset + 11) ? null : cursor
				.getInt(offset + 11));
		entity.setScope(cursor.isNull(offset + 12) ? null : cursor
				.getString(offset + 12));
		entity.setObjectId(cursor.isNull(offset + 13) ? null : cursor
				.getString(offset + 13));
		entity.set_cacheUpdatedAt(cursor.isNull(offset + 14)
				? null
				: new java.util.Date(cursor.getLong(offset + 14)));
		entity.setApCachedRequestId(cursor.isNull(offset + 15) ? null : cursor
				.getLong(offset + 15));
	}

	/** @inheritdoc */
	@Override
	protected Long updateKeyAfterInsert(CapitalMarketsContact entity, long rowId) {
		entity.setId(rowId);
		return rowId;
	}

	/** @inheritdoc */
	@Override
	public Long getKey(CapitalMarketsContact entity) {
		if (entity != null) {
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

	private String selectDeep;

	protected String getSelectDeep() {
		if (selectDeep == null) {
			StringBuilder builder = new StringBuilder("SELECT ");
			SqlUtils.appendColumns(builder, "T", getAllColumns());
			builder.append(',');
			SqlUtils.appendColumns(builder, "T0", daoSession
					.getAPCachedRequestDao().getAllColumns());
			builder.append(" FROM CAPITALMARKETSCONTACTS T");
			builder.append(" LEFT JOIN APCACHED_REQUEST T0 ON T.'AP_CACHED_REQUEST_ID'=T0.'_id'");
			builder.append(' ');
			selectDeep = builder.toString();
		}
		return selectDeep;
	}

	protected CapitalMarketsContact loadCurrentDeep(Cursor cursor, boolean lock) {
		CapitalMarketsContact entity = loadCurrent(cursor, 0, lock);
		int offset = getAllColumns().length;

		APCachedRequest aPCachedRequest = loadCurrentOther(
				daoSession.getAPCachedRequestDao(), cursor, offset);
		entity.setAPCachedRequest(aPCachedRequest);

		return entity;
	}

	public CapitalMarketsContact loadDeep(Long key) {
		assertSinglePk();
		if (key == null) {
			return null;
		}

		StringBuilder builder = new StringBuilder(getSelectDeep());
		builder.append("WHERE ");
		SqlUtils.appendColumnsEqValue(builder, "T", getPkColumns());
		String sql = builder.toString();

		String[] keyArray = new String[]{key.toString()};
		Cursor cursor = db.rawQuery(sql, keyArray);

		try {
			boolean available = cursor.moveToFirst();
			if (!available) {
				return null;
			} else if (!cursor.isLast()) {
				throw new IllegalStateException(
						"Expected unique result, but count was "
								+ cursor.getCount());
			}
			return loadCurrentDeep(cursor, true);
		} finally {
			cursor.close();
		}
	}

	/** Reads all available rows from the given cursor and returns a list of new ImageTO objects. */
	public List<CapitalMarketsContact> loadAllDeepFromCursor(Cursor cursor) {
		int count = cursor.getCount();
		List<CapitalMarketsContact> list = new ArrayList<CapitalMarketsContact>(
				count);

		if (cursor.moveToFirst()) {
			if (identityScope != null) {
				identityScope.lock();
				identityScope.reserveRoom(count);
			}
			try {
				do {
					list.add(loadCurrentDeep(cursor, false));
				} while (cursor.moveToNext());
			} finally {
				if (identityScope != null) {
					identityScope.unlock();
				}
			}
		}
		return list;
	}

	protected List<CapitalMarketsContact> loadDeepAllAndCloseCursor(
			Cursor cursor) {
		try {
			return loadAllDeepFromCursor(cursor);
		} finally {
			cursor.close();
		}
	}

	/** A raw-style query where you can pass any WHERE clause and arguments. */
	public List<CapitalMarketsContact> queryDeep(String where,
			String... selectionArg) {
		Cursor cursor = db.rawQuery(getSelectDeep() + where, selectionArg);
		return loadDeepAllAndCloseCursor(cursor);
	}

}