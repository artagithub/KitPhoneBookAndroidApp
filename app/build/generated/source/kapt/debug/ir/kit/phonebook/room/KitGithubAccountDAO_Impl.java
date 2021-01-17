package ir.kit.phonebook.room;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class KitGithubAccountDAO_Impl implements KitGithubAccountDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<KitGithubAccount> __insertionAdapterOfKitGithubAccount;

  private final Converters __converters = new Converters();

  private final EntityDeletionOrUpdateAdapter<KitGithubAccount> __deletionAdapterOfKitGithubAccount;

  private final EntityDeletionOrUpdateAdapter<KitGithubAccount> __updateAdapterOfKitGithubAccount;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public KitGithubAccountDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfKitGithubAccount = new EntityInsertionAdapter<KitGithubAccount>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `KitGithubAccount` (`id`,`name`,`phoneNumber`,`email`,`organization`,`github`,`githubRepoNames`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, KitGithubAccount value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getPhoneNumber() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPhoneNumber());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getEmail());
        }
        if (value.getOrganization() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getOrganization());
        }
        if (value.getGithub() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getGithub());
        }
        final String _tmp;
        _tmp = __converters.fromArrayList(value.getGithubRepoNames());
        if (_tmp == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, _tmp);
        }
      }
    };
    this.__deletionAdapterOfKitGithubAccount = new EntityDeletionOrUpdateAdapter<KitGithubAccount>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `KitGithubAccount` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, KitGithubAccount value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
      }
    };
    this.__updateAdapterOfKitGithubAccount = new EntityDeletionOrUpdateAdapter<KitGithubAccount>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `KitGithubAccount` SET `id` = ?,`name` = ?,`phoneNumber` = ?,`email` = ?,`organization` = ?,`github` = ?,`githubRepoNames` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, KitGithubAccount value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getPhoneNumber() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPhoneNumber());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getEmail());
        }
        if (value.getOrganization() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getOrganization());
        }
        if (value.getGithub() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getGithub());
        }
        final String _tmp;
        _tmp = __converters.fromArrayList(value.getGithubRepoNames());
        if (_tmp == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, _tmp);
        }
        if (value.getId() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getId());
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM KitGithubAccount";
        return _query;
      }
    };
  }

  @Override
  public void insertAll(final List<KitGithubAccount> kitAccounts) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfKitGithubAccount.insert(kitAccounts);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insert(final KitGithubAccount kitAccount) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfKitGithubAccount.insert(kitAccount);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final KitGithubAccount kitAccount) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfKitGithubAccount.handle(kitAccount);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final KitGithubAccount kitAccount) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfKitGithubAccount.handle(kitAccount);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAll() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public List<KitGithubAccount> getAll() {
    final String _sql = "SELECT * FROM KitGithubAccount";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfPhoneNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "phoneNumber");
      final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
      final int _cursorIndexOfOrganization = CursorUtil.getColumnIndexOrThrow(_cursor, "organization");
      final int _cursorIndexOfGithub = CursorUtil.getColumnIndexOrThrow(_cursor, "github");
      final int _cursorIndexOfGithubRepoNames = CursorUtil.getColumnIndexOrThrow(_cursor, "githubRepoNames");
      final List<KitGithubAccount> _result = new ArrayList<KitGithubAccount>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final KitGithubAccount _item;
        final String _tmpId;
        _tmpId = _cursor.getString(_cursorIndexOfId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpPhoneNumber;
        _tmpPhoneNumber = _cursor.getString(_cursorIndexOfPhoneNumber);
        final String _tmpEmail;
        _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
        final String _tmpOrganization;
        _tmpOrganization = _cursor.getString(_cursorIndexOfOrganization);
        final String _tmpGithub;
        _tmpGithub = _cursor.getString(_cursorIndexOfGithub);
        final ArrayList<String> _tmpGithubRepoNames;
        final String _tmp;
        _tmp = _cursor.getString(_cursorIndexOfGithubRepoNames);
        _tmpGithubRepoNames = __converters.fromString(_tmp);
        _item = new KitGithubAccount(_tmpId,_tmpName,_tmpPhoneNumber,_tmpEmail,_tmpOrganization,_tmpGithub,_tmpGithubRepoNames);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<KitGithubAccount> loadAllByIds(final int[] kitAccountID) {
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT ");
    _stringBuilder.append("*");
    _stringBuilder.append(" FROM kitgithubaccount WHERE id IN (");
    final int _inputSize = kitAccountID.length;
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (int _item : kitAccountID) {
      _statement.bindLong(_argIndex, _item);
      _argIndex ++;
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfPhoneNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "phoneNumber");
      final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
      final int _cursorIndexOfOrganization = CursorUtil.getColumnIndexOrThrow(_cursor, "organization");
      final int _cursorIndexOfGithub = CursorUtil.getColumnIndexOrThrow(_cursor, "github");
      final int _cursorIndexOfGithubRepoNames = CursorUtil.getColumnIndexOrThrow(_cursor, "githubRepoNames");
      final List<KitGithubAccount> _result = new ArrayList<KitGithubAccount>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final KitGithubAccount _item_1;
        final String _tmpId;
        _tmpId = _cursor.getString(_cursorIndexOfId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpPhoneNumber;
        _tmpPhoneNumber = _cursor.getString(_cursorIndexOfPhoneNumber);
        final String _tmpEmail;
        _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
        final String _tmpOrganization;
        _tmpOrganization = _cursor.getString(_cursorIndexOfOrganization);
        final String _tmpGithub;
        _tmpGithub = _cursor.getString(_cursorIndexOfGithub);
        final ArrayList<String> _tmpGithubRepoNames;
        final String _tmp;
        _tmp = _cursor.getString(_cursorIndexOfGithubRepoNames);
        _tmpGithubRepoNames = __converters.fromString(_tmp);
        _item_1 = new KitGithubAccount(_tmpId,_tmpName,_tmpPhoneNumber,_tmpEmail,_tmpOrganization,_tmpGithub,_tmpGithubRepoNames);
        _result.add(_item_1);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public KitGithubAccount findByName(final String name) {
    final String _sql = "SELECT * FROM KitGithubAccount WHERE name LIKE ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (name == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, name);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfPhoneNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "phoneNumber");
      final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
      final int _cursorIndexOfOrganization = CursorUtil.getColumnIndexOrThrow(_cursor, "organization");
      final int _cursorIndexOfGithub = CursorUtil.getColumnIndexOrThrow(_cursor, "github");
      final int _cursorIndexOfGithubRepoNames = CursorUtil.getColumnIndexOrThrow(_cursor, "githubRepoNames");
      final KitGithubAccount _result;
      if(_cursor.moveToFirst()) {
        final String _tmpId;
        _tmpId = _cursor.getString(_cursorIndexOfId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpPhoneNumber;
        _tmpPhoneNumber = _cursor.getString(_cursorIndexOfPhoneNumber);
        final String _tmpEmail;
        _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
        final String _tmpOrganization;
        _tmpOrganization = _cursor.getString(_cursorIndexOfOrganization);
        final String _tmpGithub;
        _tmpGithub = _cursor.getString(_cursorIndexOfGithub);
        final ArrayList<String> _tmpGithubRepoNames;
        final String _tmp;
        _tmp = _cursor.getString(_cursorIndexOfGithubRepoNames);
        _tmpGithubRepoNames = __converters.fromString(_tmp);
        _result = new KitGithubAccount(_tmpId,_tmpName,_tmpPhoneNumber,_tmpEmail,_tmpOrganization,_tmpGithub,_tmpGithubRepoNames);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
