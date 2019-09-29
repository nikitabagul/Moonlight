package com.nikiaish.moonlight;

import android.database.Cursor;

import static com.nikiaish.moonlight.MainActivity.db;
import static com.nikiaish.moonlight.MainActivity.pdb;
import static com.nikiaish.moonlight.MainActivity.sale;
import static com.nikiaish.moonlight.MainActivity.temp;

public class Record {

    String key,key1;

    public Record(Cursor c)
    {
        key = c.getString(0);
        key1 = c.getString(1);
    }

    public Cursor getCursor(int mainDB) {
        if (mainDB==1)
            return db.rawQuery("SELECT * FROM store WHERE id=" + key + " and name=\"" + key1+"\"", null);
        else if(mainDB==0)
            return temp.rawQuery("SELECT * FROM storee WHERE id=" + key + " and name=\"" + key1+"\"", null);
        else if(mainDB==2)
            return sale.rawQuery("SELECT * FROM store1 WHERE id=" + key + " and name=\"" + key1+"\"", null);
        else if(mainDB==3)
            return pdb.rawQuery("SELECT * FROM store2 WHERE id=" + key , null);
        else
            return pdb.rawQuery("SELECT * FROM store3 WHERE id=" + key , null);

    }
}
