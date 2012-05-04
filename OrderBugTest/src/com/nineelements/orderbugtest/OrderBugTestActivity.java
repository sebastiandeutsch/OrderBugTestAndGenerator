package com.nineelements.orderbugtest;

import de.greenrobot.daoexample.DaoMaster;
import de.greenrobot.daoexample.DaoMaster.DevOpenHelper;
import de.greenrobot.daoexample.DaoSession;
import de.greenrobot.daoexample.NoteDao;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class OrderBugTestActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        ListView listView = (ListView)findViewById(R.id.listView);
        
        DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "ord-db", null);
        SQLiteDatabase db =helper.getWritableDatabase(); 
        
        DaoMaster daoMaster = new DaoMaster(db);
        DaoMaster.dropAllTables(db, true);
        DaoMaster.createAllTables(db, true);
        
        DaoSession daoSession = daoMaster.newSession();
        NoteDao noteDao = daoSession.getNoteDao();
        
        String textColumn = NoteDao.Properties.Order.columnName;
        String orderBy = textColumn + " ASC";
        Cursor cursor = db.query(noteDao.getTablename(), noteDao.getAllColumns(), null, null, null, null, orderBy);
        String[] from = { NoteDao.Properties.Text.columnName, NoteDao.Properties.Comment.columnName };
        int[] to = { android.R.id.text1, android.R.id.text2 };

        SimpleCursorAdapter adapter = new SimpleCursorAdapter(this, android.R.layout.simple_list_item_2, cursor, from, to);
        
        listView.setAdapter(adapter);

    }
}