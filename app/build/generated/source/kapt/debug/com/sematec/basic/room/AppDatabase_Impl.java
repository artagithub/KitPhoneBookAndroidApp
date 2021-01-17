package com.sematec.basic.room;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import ir.kit.phonebook.room.KitGithubAccountDAO;
import ir.kit.phonebook.room.KitGithubAccountDAO_Impl;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile KitGithubAccountDAO _kitGithubAccountDAO;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(3) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `KitGithubAccount` (`id` TEXT NOT NULL, `name` TEXT, `phoneNumber` TEXT, `email` TEXT, `organization` TEXT, `github` TEXT, `githubRepoNames` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '708fd33bff3de62e15e07c9a090001a6')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `KitGithubAccount`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsKitGithubAccount = new HashMap<String, TableInfo.Column>(7);
        _columnsKitGithubAccount.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsKitGithubAccount.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsKitGithubAccount.put("phoneNumber", new TableInfo.Column("phoneNumber", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsKitGithubAccount.put("email", new TableInfo.Column("email", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsKitGithubAccount.put("organization", new TableInfo.Column("organization", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsKitGithubAccount.put("github", new TableInfo.Column("github", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsKitGithubAccount.put("githubRepoNames", new TableInfo.Column("githubRepoNames", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysKitGithubAccount = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesKitGithubAccount = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoKitGithubAccount = new TableInfo("KitGithubAccount", _columnsKitGithubAccount, _foreignKeysKitGithubAccount, _indicesKitGithubAccount);
        final TableInfo _existingKitGithubAccount = TableInfo.read(_db, "KitGithubAccount");
        if (! _infoKitGithubAccount.equals(_existingKitGithubAccount)) {
          return new RoomOpenHelper.ValidationResult(false, "KitGithubAccount(ir.kit.phonebook.room.KitGithubAccount).\n"
                  + " Expected:\n" + _infoKitGithubAccount + "\n"
                  + " Found:\n" + _existingKitGithubAccount);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "708fd33bff3de62e15e07c9a090001a6", "6d12d80290ba45c94a21e07c1291b276");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "KitGithubAccount");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `KitGithubAccount`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public KitGithubAccountDAO kitGithubAccountDAO() {
    if (_kitGithubAccountDAO != null) {
      return _kitGithubAccountDAO;
    } else {
      synchronized(this) {
        if(_kitGithubAccountDAO == null) {
          _kitGithubAccountDAO = new KitGithubAccountDAO_Impl(this);
        }
        return _kitGithubAccountDAO;
      }
    }
  }
}
