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

import com.anypresence.anypresence_inc.citi_mobile_challenge.dao.CorporatePaymentsPayment;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table CORPORATEPAYMENTSPAYMENTS.
 */
public class CorporatePaymentsPaymentDao
		extends
			AbstractDao<CorporatePaymentsPayment, Long> {

	public static final String TABLENAME = "CORPORATEPAYMENTSPAYMENTS";

	/**
	 * Properties of entity CorporatePaymentsPayment.<br/>
	 * Can be used for QueryBuilder and for referencing column names.
	 */
	public static class Properties {
		public final static Property Id = new Property(0, Long.class, "id",
				true, "_id");
		public final static Property BeneficiaryId = new Property(1,
				String.class, "beneficiaryId", false, "BENEFICIARY_ID");
		public final static Property BranchName = new Property(2, String.class,
				"branchName", false, "BRANCH_NAME");
		public final static Property CreatedBy = new Property(3, String.class,
				"createdBy", false, "CREATED_BY");
		public final static Property CreatedOn = new Property(4, String.class,
				"createdOn", false, "CREATED_ON");
		public final static Property CustomerReferenceNumber = new Property(5,
				String.class, "customerReferenceNumber", false,
				"CUSTOMER_REFERENCE_NUMBER");
		public final static Property DebitAccountName = new Property(6,
				String.class, "debitAccountName", false, "DEBIT_ACCOUNT_NAME");
		public final static Property DebitAccountNumber = new Property(7,
				String.class, "debitAccountNumber", false,
				"DEBIT_ACCOUNT_NUMBER");
		public final static Property Email = new Property(8, String.class,
				"email", false, "EMAIL");
		public final static Property PaymentAmount = new Property(9,
				String.class, "paymentAmount", false, "PAYMENT_AMOUNT");
		public final static Property PaymentCurrency = new Property(10,
				String.class, "paymentCurrency", false, "PAYMENT_CURRENCY");
		public final static Property PaymentDetails = new Property(11,
				String.class, "paymentDetails", false, "PAYMENT_DETAILS");
		public final static Property PaymentMethod = new Property(12,
				String.class, "paymentMethod", false, "PAYMENT_METHOD");
		public final static Property PaymentType = new Property(13,
				String.class, "paymentType", false, "PAYMENT_TYPE");
		public final static Property Status = new Property(14, String.class,
				"status", false, "STATUS");
		public final static Property TransactionReferenceNumber = new Property(
				15, String.class, "transactionReferenceNumber", false,
				"TRANSACTION_REFERENCE_NUMBER");
		public final static Property ValueDate = new Property(16, String.class,
				"valueDate", false, "VALUE_DATE");
		public final static Property Scope = new Property(17, String.class,
				"scope", false, "SCOPE");
		public final static Property ObjectId = new Property(18, String.class,
				"objectId", false, "OBJECT_ID");
		public final static Property _cacheUpdatedAt = new Property(19,
				java.util.Date.class, "_cacheUpdatedAt", false,
				"_CACHE_UPDATED_AT");
		public final static Property ApCachedRequestId = new Property(20,
				Long.class, "apCachedRequestId", false, "AP_CACHED_REQUEST_ID");
	};

	private DaoSession daoSession;

	public CorporatePaymentsPaymentDao(DaoConfig config) {
		super(config);
	}

	public CorporatePaymentsPaymentDao(DaoConfig config, DaoSession daoSession) {
		super(config, daoSession);
		this.daoSession = daoSession;
	}

	/** Creates the underlying database table. */
	public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
		String constraint = ifNotExists ? "IF NOT EXISTS " : "";
		db.execSQL("CREATE TABLE " + constraint
				+ "'CORPORATEPAYMENTSPAYMENTS' (" + //
				"'_id' INTEGER PRIMARY KEY ," + // 0: id
				"'BENEFICIARY_ID' TEXT," + // 1: beneficiaryId
				"'BRANCH_NAME' TEXT," + // 2: branchName
				"'CREATED_BY' TEXT," + // 3: createdBy
				"'CREATED_ON' TEXT," + // 4: createdOn
				"'CUSTOMER_REFERENCE_NUMBER' TEXT," + // 5: customerReferenceNumber
				"'DEBIT_ACCOUNT_NAME' TEXT," + // 6: debitAccountName
				"'DEBIT_ACCOUNT_NUMBER' TEXT," + // 7: debitAccountNumber
				"'EMAIL' TEXT," + // 8: email
				"'PAYMENT_AMOUNT' TEXT," + // 9: paymentAmount
				"'PAYMENT_CURRENCY' TEXT," + // 10: paymentCurrency
				"'PAYMENT_DETAILS' TEXT," + // 11: paymentDetails
				"'PAYMENT_METHOD' TEXT," + // 12: paymentMethod
				"'PAYMENT_TYPE' TEXT," + // 13: paymentType
				"'STATUS' TEXT," + // 14: status
				"'TRANSACTION_REFERENCE_NUMBER' TEXT," + // 15: transactionReferenceNumber
				"'VALUE_DATE' TEXT," + // 16: valueDate
				"'SCOPE' TEXT," + // 17: scope
				"'OBJECT_ID' TEXT," + // 18: objectId
				"'_CACHE_UPDATED_AT' INTEGER," + // 19: _cacheUpdatedAt
				"'AP_CACHED_REQUEST_ID' INTEGER);"); // 20: apCachedRequestId
		// Add Indexes
		db.execSQL("CREATE UNIQUE INDEX "
				+ constraint
				+ "IDX_CORPORATEPAYMENTSPAYMENTS_OBJECT_ID ON CORPORATEPAYMENTSPAYMENTS"
				+ " (OBJECT_ID);");
	}

	/** Drops the underlying database table. */
	public static void dropTable(SQLiteDatabase db, boolean ifExists) {
		String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "")
				+ "'CORPORATEPAYMENTSPAYMENTS'";
		db.execSQL(sql);
	}

	/** @inheritdoc */
	@Override
	protected void bindValues(SQLiteStatement stmt,
			CorporatePaymentsPayment entity) {
		stmt.clearBindings();

		Long id = entity.getId();
		if (id != null) {
			stmt.bindLong(1, id);
		}

		String beneficiaryId = entity.getBeneficiaryId();
		if (beneficiaryId != null) {
			stmt.bindString(2, beneficiaryId);
		}

		String branchName = entity.getBranchName();
		if (branchName != null) {
			stmt.bindString(3, branchName);
		}

		String createdBy = entity.getCreatedBy();
		if (createdBy != null) {
			stmt.bindString(4, createdBy);
		}

		String createdOn = entity.getCreatedOn();
		if (createdOn != null) {
			stmt.bindString(5, createdOn);
		}

		String customerReferenceNumber = entity.getCustomerReferenceNumber();
		if (customerReferenceNumber != null) {
			stmt.bindString(6, customerReferenceNumber);
		}

		String debitAccountName = entity.getDebitAccountName();
		if (debitAccountName != null) {
			stmt.bindString(7, debitAccountName);
		}

		String debitAccountNumber = entity.getDebitAccountNumber();
		if (debitAccountNumber != null) {
			stmt.bindString(8, debitAccountNumber);
		}

		String email = entity.getEmail();
		if (email != null) {
			stmt.bindString(9, email);
		}

		String paymentAmount = entity.getPaymentAmount();
		if (paymentAmount != null) {
			stmt.bindString(10, paymentAmount);
		}

		String paymentCurrency = entity.getPaymentCurrency();
		if (paymentCurrency != null) {
			stmt.bindString(11, paymentCurrency);
		}

		String paymentDetails = entity.getPaymentDetails();
		if (paymentDetails != null) {
			stmt.bindString(12, paymentDetails);
		}

		String paymentMethod = entity.getPaymentMethod();
		if (paymentMethod != null) {
			stmt.bindString(13, paymentMethod);
		}

		String paymentType = entity.getPaymentType();
		if (paymentType != null) {
			stmt.bindString(14, paymentType);
		}

		String status = entity.getStatus();
		if (status != null) {
			stmt.bindString(15, status);
		}

		String transactionReferenceNumber = entity
				.getTransactionReferenceNumber();
		if (transactionReferenceNumber != null) {
			stmt.bindString(16, transactionReferenceNumber);
		}

		String valueDate = entity.getValueDate();
		if (valueDate != null) {
			stmt.bindString(17, valueDate);
		}

		String scope = entity.getScope();
		if (scope != null) {
			stmt.bindString(18, scope);
		}

		String objectId = entity.getObjectId();
		if (objectId != null) {
			stmt.bindString(19, objectId);
		}

		java.util.Date _cacheUpdatedAt = entity.get_cacheUpdatedAt();
		if (_cacheUpdatedAt != null) {
			stmt.bindLong(20, _cacheUpdatedAt.getTime());
		}

		Long apCachedRequestId = entity.getApCachedRequestId();
		if (apCachedRequestId != null) {
			stmt.bindLong(21, apCachedRequestId);
		}
	}

	@Override
	protected void attachEntity(CorporatePaymentsPayment entity) {
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
	public CorporatePaymentsPayment readEntity(Cursor cursor, int offset) {
		CorporatePaymentsPayment entity = new CorporatePaymentsPayment(
				//
				cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
				cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // beneficiaryId
				cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // branchName
				cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // createdBy
				cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // createdOn
				cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // customerReferenceNumber
				cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // debitAccountName
				cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // debitAccountNumber
				cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // email
				cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // paymentAmount
				cursor.isNull(offset + 10) ? null : cursor
						.getString(offset + 10), // paymentCurrency
				cursor.isNull(offset + 11) ? null : cursor
						.getString(offset + 11), // paymentDetails
				cursor.isNull(offset + 12) ? null : cursor
						.getString(offset + 12), // paymentMethod
				cursor.isNull(offset + 13) ? null : cursor
						.getString(offset + 13), // paymentType
				cursor.isNull(offset + 14) ? null : cursor
						.getString(offset + 14), // status
				cursor.isNull(offset + 15) ? null : cursor
						.getString(offset + 15), // transactionReferenceNumber
				cursor.isNull(offset + 16) ? null : cursor
						.getString(offset + 16), // valueDate
				cursor.isNull(offset + 17) ? null : cursor
						.getString(offset + 17), // scope
				cursor.isNull(offset + 18) ? null : cursor
						.getString(offset + 18), // objectId
				cursor.isNull(offset + 19) ? null : new java.util.Date(cursor
						.getLong(offset + 19)), // _cacheUpdatedAt
				cursor.isNull(offset + 20) ? null : cursor.getLong(offset + 20) // apCachedRequestId
		);
		return entity;
	}

	/** @inheritdoc */
	@Override
	public void readEntity(Cursor cursor, CorporatePaymentsPayment entity,
			int offset) {
		entity.setId(cursor.isNull(offset + 0) ? null : cursor
				.getLong(offset + 0));
		entity.setBeneficiaryId(cursor.isNull(offset + 1) ? null : cursor
				.getString(offset + 1));
		entity.setBranchName(cursor.isNull(offset + 2) ? null : cursor
				.getString(offset + 2));
		entity.setCreatedBy(cursor.isNull(offset + 3) ? null : cursor
				.getString(offset + 3));
		entity.setCreatedOn(cursor.isNull(offset + 4) ? null : cursor
				.getString(offset + 4));
		entity.setCustomerReferenceNumber(cursor.isNull(offset + 5)
				? null
				: cursor.getString(offset + 5));
		entity.setDebitAccountName(cursor.isNull(offset + 6) ? null : cursor
				.getString(offset + 6));
		entity.setDebitAccountNumber(cursor.isNull(offset + 7) ? null : cursor
				.getString(offset + 7));
		entity.setEmail(cursor.isNull(offset + 8) ? null : cursor
				.getString(offset + 8));
		entity.setPaymentAmount(cursor.isNull(offset + 9) ? null : cursor
				.getString(offset + 9));
		entity.setPaymentCurrency(cursor.isNull(offset + 10) ? null : cursor
				.getString(offset + 10));
		entity.setPaymentDetails(cursor.isNull(offset + 11) ? null : cursor
				.getString(offset + 11));
		entity.setPaymentMethod(cursor.isNull(offset + 12) ? null : cursor
				.getString(offset + 12));
		entity.setPaymentType(cursor.isNull(offset + 13) ? null : cursor
				.getString(offset + 13));
		entity.setStatus(cursor.isNull(offset + 14) ? null : cursor
				.getString(offset + 14));
		entity.setTransactionReferenceNumber(cursor.isNull(offset + 15)
				? null
				: cursor.getString(offset + 15));
		entity.setValueDate(cursor.isNull(offset + 16) ? null : cursor
				.getString(offset + 16));
		entity.setScope(cursor.isNull(offset + 17) ? null : cursor
				.getString(offset + 17));
		entity.setObjectId(cursor.isNull(offset + 18) ? null : cursor
				.getString(offset + 18));
		entity.set_cacheUpdatedAt(cursor.isNull(offset + 19)
				? null
				: new java.util.Date(cursor.getLong(offset + 19)));
		entity.setApCachedRequestId(cursor.isNull(offset + 20) ? null : cursor
				.getLong(offset + 20));
	}

	/** @inheritdoc */
	@Override
	protected Long updateKeyAfterInsert(CorporatePaymentsPayment entity,
			long rowId) {
		entity.setId(rowId);
		return rowId;
	}

	/** @inheritdoc */
	@Override
	public Long getKey(CorporatePaymentsPayment entity) {
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
			builder.append(" FROM CORPORATEPAYMENTSPAYMENTS T");
			builder.append(" LEFT JOIN APCACHED_REQUEST T0 ON T.'AP_CACHED_REQUEST_ID'=T0.'_id'");
			builder.append(' ');
			selectDeep = builder.toString();
		}
		return selectDeep;
	}

	protected CorporatePaymentsPayment loadCurrentDeep(Cursor cursor,
			boolean lock) {
		CorporatePaymentsPayment entity = loadCurrent(cursor, 0, lock);
		int offset = getAllColumns().length;

		APCachedRequest aPCachedRequest = loadCurrentOther(
				daoSession.getAPCachedRequestDao(), cursor, offset);
		entity.setAPCachedRequest(aPCachedRequest);

		return entity;
	}

	public CorporatePaymentsPayment loadDeep(Long key) {
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
	public List<CorporatePaymentsPayment> loadAllDeepFromCursor(Cursor cursor) {
		int count = cursor.getCount();
		List<CorporatePaymentsPayment> list = new ArrayList<CorporatePaymentsPayment>(
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

	protected List<CorporatePaymentsPayment> loadDeepAllAndCloseCursor(
			Cursor cursor) {
		try {
			return loadAllDeepFromCursor(cursor);
		} finally {
			cursor.close();
		}
	}

	/** A raw-style query where you can pass any WHERE clause and arguments. */
	public List<CorporatePaymentsPayment> queryDeep(String where,
			String... selectionArg) {
		Cursor cursor = db.rawQuery(getSelectDeep() + where, selectionArg);
		return loadDeepAllAndCloseCursor(cursor);
	}

}