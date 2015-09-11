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

import com.anypresence.anypresence_inc.citi_mobile_challenge.dao.CorporatePaymentsBeneficiary;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table CORPORATEPAYMENTSBENEFICIARIES.
 */
public class CorporatePaymentsBeneficiaryDao
		extends
			AbstractDao<CorporatePaymentsBeneficiary, Long> {

	public static final String TABLENAME = "CORPORATEPAYMENTSBENEFICIARIES";

	/**
	 * Properties of entity CorporatePaymentsBeneficiary.<br/>
	 * Can be used for QueryBuilder and for referencing column names.
	 */
	public static class Properties {
		public final static Property Id = new Property(0, Long.class, "id",
				true, "_id");
		public final static Property AccountStatus = new Property(1,
				String.class, "accountStatus", false, "ACCOUNT_STATUS");
		public final static Property Address = new Property(2, String.class,
				"address", false, "ADDRESS");
		public final static Property BankAccountType = new Property(3,
				String.class, "bankAccountType", false, "BANK_ACCOUNT_TYPE");
		public final static Property BankAddress = new Property(4,
				String.class, "bankAddress", false, "BANK_ADDRESS");
		public final static Property BankCountry = new Property(5,
				String.class, "bankCountry", false, "BANK_COUNTRY");
		public final static Property Bic = new Property(6, String.class, "bic",
				false, "BIC");
		public final static Property CompanyName = new Property(7,
				String.class, "companyName", false, "COMPANY_NAME");
		public final static Property Country = new Property(8, String.class,
				"country", false, "COUNTRY");
		public final static Property Currency = new Property(9, String.class,
				"currency", false, "CURRENCY");
		public final static Property EntityType = new Property(10,
				String.class, "entityType", false, "ENTITY_TYPE");
		public final static Property Iban = new Property(11, String.class,
				"iban", false, "IBAN");
		public final static Property RoutingCode = new Property(12,
				String.class, "routingCode", false, "ROUTING_CODE");
		public final static Property Scope = new Property(13, String.class,
				"scope", false, "SCOPE");
		public final static Property ObjectId = new Property(14, String.class,
				"objectId", false, "OBJECT_ID");
		public final static Property _cacheUpdatedAt = new Property(15,
				java.util.Date.class, "_cacheUpdatedAt", false,
				"_CACHE_UPDATED_AT");
		public final static Property ApCachedRequestId = new Property(16,
				Long.class, "apCachedRequestId", false, "AP_CACHED_REQUEST_ID");
	};

	private DaoSession daoSession;

	public CorporatePaymentsBeneficiaryDao(DaoConfig config) {
		super(config);
	}

	public CorporatePaymentsBeneficiaryDao(DaoConfig config,
			DaoSession daoSession) {
		super(config, daoSession);
		this.daoSession = daoSession;
	}

	/** Creates the underlying database table. */
	public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
		String constraint = ifNotExists ? "IF NOT EXISTS " : "";
		db.execSQL("CREATE TABLE " + constraint
				+ "'CORPORATEPAYMENTSBENEFICIARIES' (" + //
				"'_id' INTEGER PRIMARY KEY ," + // 0: id
				"'ACCOUNT_STATUS' TEXT," + // 1: accountStatus
				"'ADDRESS' TEXT," + // 2: address
				"'BANK_ACCOUNT_TYPE' TEXT," + // 3: bankAccountType
				"'BANK_ADDRESS' TEXT," + // 4: bankAddress
				"'BANK_COUNTRY' TEXT," + // 5: bankCountry
				"'BIC' TEXT," + // 6: bic
				"'COMPANY_NAME' TEXT," + // 7: companyName
				"'COUNTRY' TEXT," + // 8: country
				"'CURRENCY' TEXT," + // 9: currency
				"'ENTITY_TYPE' TEXT," + // 10: entityType
				"'IBAN' TEXT," + // 11: iban
				"'ROUTING_CODE' TEXT," + // 12: routingCode
				"'SCOPE' TEXT," + // 13: scope
				"'OBJECT_ID' TEXT," + // 14: objectId
				"'_CACHE_UPDATED_AT' INTEGER," + // 15: _cacheUpdatedAt
				"'AP_CACHED_REQUEST_ID' INTEGER);"); // 16: apCachedRequestId
		// Add Indexes
		db.execSQL("CREATE UNIQUE INDEX "
				+ constraint
				+ "IDX_CORPORATEPAYMENTSBENEFICIARIES_OBJECT_ID ON CORPORATEPAYMENTSBENEFICIARIES"
				+ " (OBJECT_ID);");
	}

	/** Drops the underlying database table. */
	public static void dropTable(SQLiteDatabase db, boolean ifExists) {
		String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "")
				+ "'CORPORATEPAYMENTSBENEFICIARIES'";
		db.execSQL(sql);
	}

	/** @inheritdoc */
	@Override
	protected void bindValues(SQLiteStatement stmt,
			CorporatePaymentsBeneficiary entity) {
		stmt.clearBindings();

		Long id = entity.getId();
		if (id != null) {
			stmt.bindLong(1, id);
		}

		String accountStatus = entity.getAccountStatus();
		if (accountStatus != null) {
			stmt.bindString(2, accountStatus);
		}

		String address = entity.getAddress();
		if (address != null) {
			stmt.bindString(3, address);
		}

		String bankAccountType = entity.getBankAccountType();
		if (bankAccountType != null) {
			stmt.bindString(4, bankAccountType);
		}

		String bankAddress = entity.getBankAddress();
		if (bankAddress != null) {
			stmt.bindString(5, bankAddress);
		}

		String bankCountry = entity.getBankCountry();
		if (bankCountry != null) {
			stmt.bindString(6, bankCountry);
		}

		String bic = entity.getBic();
		if (bic != null) {
			stmt.bindString(7, bic);
		}

		String companyName = entity.getCompanyName();
		if (companyName != null) {
			stmt.bindString(8, companyName);
		}

		String country = entity.getCountry();
		if (country != null) {
			stmt.bindString(9, country);
		}

		String currency = entity.getCurrency();
		if (currency != null) {
			stmt.bindString(10, currency);
		}

		String entityType = entity.getEntityType();
		if (entityType != null) {
			stmt.bindString(11, entityType);
		}

		String iban = entity.getIban();
		if (iban != null) {
			stmt.bindString(12, iban);
		}

		String routingCode = entity.getRoutingCode();
		if (routingCode != null) {
			stmt.bindString(13, routingCode);
		}

		String scope = entity.getScope();
		if (scope != null) {
			stmt.bindString(14, scope);
		}

		String objectId = entity.getObjectId();
		if (objectId != null) {
			stmt.bindString(15, objectId);
		}

		java.util.Date _cacheUpdatedAt = entity.get_cacheUpdatedAt();
		if (_cacheUpdatedAt != null) {
			stmt.bindLong(16, _cacheUpdatedAt.getTime());
		}

		Long apCachedRequestId = entity.getApCachedRequestId();
		if (apCachedRequestId != null) {
			stmt.bindLong(17, apCachedRequestId);
		}
	}

	@Override
	protected void attachEntity(CorporatePaymentsBeneficiary entity) {
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
	public CorporatePaymentsBeneficiary readEntity(Cursor cursor, int offset) {
		CorporatePaymentsBeneficiary entity = new CorporatePaymentsBeneficiary(
				//
				cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
				cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // accountStatus
				cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // address
				cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // bankAccountType
				cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // bankAddress
				cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // bankCountry
				cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // bic
				cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // companyName
				cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // country
				cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // currency
				cursor.isNull(offset + 10) ? null : cursor
						.getString(offset + 10), // entityType
				cursor.isNull(offset + 11) ? null : cursor
						.getString(offset + 11), // iban
				cursor.isNull(offset + 12) ? null : cursor
						.getString(offset + 12), // routingCode
				cursor.isNull(offset + 13) ? null : cursor
						.getString(offset + 13), // scope
				cursor.isNull(offset + 14) ? null : cursor
						.getString(offset + 14), // objectId
				cursor.isNull(offset + 15) ? null : new java.util.Date(cursor
						.getLong(offset + 15)), // _cacheUpdatedAt
				cursor.isNull(offset + 16) ? null : cursor.getLong(offset + 16) // apCachedRequestId
		);
		return entity;
	}

	/** @inheritdoc */
	@Override
	public void readEntity(Cursor cursor, CorporatePaymentsBeneficiary entity,
			int offset) {
		entity.setId(cursor.isNull(offset + 0) ? null : cursor
				.getLong(offset + 0));
		entity.setAccountStatus(cursor.isNull(offset + 1) ? null : cursor
				.getString(offset + 1));
		entity.setAddress(cursor.isNull(offset + 2) ? null : cursor
				.getString(offset + 2));
		entity.setBankAccountType(cursor.isNull(offset + 3) ? null : cursor
				.getString(offset + 3));
		entity.setBankAddress(cursor.isNull(offset + 4) ? null : cursor
				.getString(offset + 4));
		entity.setBankCountry(cursor.isNull(offset + 5) ? null : cursor
				.getString(offset + 5));
		entity.setBic(cursor.isNull(offset + 6) ? null : cursor
				.getString(offset + 6));
		entity.setCompanyName(cursor.isNull(offset + 7) ? null : cursor
				.getString(offset + 7));
		entity.setCountry(cursor.isNull(offset + 8) ? null : cursor
				.getString(offset + 8));
		entity.setCurrency(cursor.isNull(offset + 9) ? null : cursor
				.getString(offset + 9));
		entity.setEntityType(cursor.isNull(offset + 10) ? null : cursor
				.getString(offset + 10));
		entity.setIban(cursor.isNull(offset + 11) ? null : cursor
				.getString(offset + 11));
		entity.setRoutingCode(cursor.isNull(offset + 12) ? null : cursor
				.getString(offset + 12));
		entity.setScope(cursor.isNull(offset + 13) ? null : cursor
				.getString(offset + 13));
		entity.setObjectId(cursor.isNull(offset + 14) ? null : cursor
				.getString(offset + 14));
		entity.set_cacheUpdatedAt(cursor.isNull(offset + 15)
				? null
				: new java.util.Date(cursor.getLong(offset + 15)));
		entity.setApCachedRequestId(cursor.isNull(offset + 16) ? null : cursor
				.getLong(offset + 16));
	}

	/** @inheritdoc */
	@Override
	protected Long updateKeyAfterInsert(CorporatePaymentsBeneficiary entity,
			long rowId) {
		entity.setId(rowId);
		return rowId;
	}

	/** @inheritdoc */
	@Override
	public Long getKey(CorporatePaymentsBeneficiary entity) {
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
			builder.append(" FROM CORPORATEPAYMENTSBENEFICIARIES T");
			builder.append(" LEFT JOIN APCACHED_REQUEST T0 ON T.'AP_CACHED_REQUEST_ID'=T0.'_id'");
			builder.append(' ');
			selectDeep = builder.toString();
		}
		return selectDeep;
	}

	protected CorporatePaymentsBeneficiary loadCurrentDeep(Cursor cursor,
			boolean lock) {
		CorporatePaymentsBeneficiary entity = loadCurrent(cursor, 0, lock);
		int offset = getAllColumns().length;

		APCachedRequest aPCachedRequest = loadCurrentOther(
				daoSession.getAPCachedRequestDao(), cursor, offset);
		entity.setAPCachedRequest(aPCachedRequest);

		return entity;
	}

	public CorporatePaymentsBeneficiary loadDeep(Long key) {
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
	public List<CorporatePaymentsBeneficiary> loadAllDeepFromCursor(
			Cursor cursor) {
		int count = cursor.getCount();
		List<CorporatePaymentsBeneficiary> list = new ArrayList<CorporatePaymentsBeneficiary>(
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

	protected List<CorporatePaymentsBeneficiary> loadDeepAllAndCloseCursor(
			Cursor cursor) {
		try {
			return loadAllDeepFromCursor(cursor);
		} finally {
			cursor.close();
		}
	}

	/** A raw-style query where you can pass any WHERE clause and arguments. */
	public List<CorporatePaymentsBeneficiary> queryDeep(String where,
			String... selectionArg) {
		Cursor cursor = db.rawQuery(getSelectDeep() + where, selectionArg);
		return loadDeepAllAndCloseCursor(cursor);
	}

}