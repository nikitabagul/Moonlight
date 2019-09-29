package com.nikiaish.moonlight;



import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ListView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Menu menu;
    ListView addList;
    Quantity quantity;
    ViewAll viewAll;
    Pay pay;
    static int sno=1;

    public static CustomAdapter adapterV, adapterM, adapterQ,adapterP;

    public static SQLiteDatabase db, temp,sale,pdb,pall;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menu = new Menu();
        quantity = new Quantity();
        viewAll = new ViewAll();
        pay = new Pay();

        adapterQ = new CustomAdapter(this, new ArrayList<Record>(), 2,false);
        adapterM = new CustomAdapter(this, new ArrayList<Record>(), 0,true);
        adapterV = new CustomAdapter(this, new ArrayList<Record>(), 1,false);
        adapterP = new CustomAdapter(this, new ArrayList<Record>(), 3,false);




        db = openOrCreateDatabase("CafeDB", Context.MODE_PRIVATE, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS store(id int,name VARCHAR,stock int,price int,primary key(id,name));");
        temp = openOrCreateDatabase("CafeDB", Context.MODE_PRIVATE, null);
        temp.execSQL("CREATE TABLE IF NOT EXISTS storee(id int,name VARCHAR,stock int,price int,primary key(id,name));");
        sale = openOrCreateDatabase("CafeDB", Context.MODE_PRIVATE, null);
        sale.execSQL("CREATE TABLE IF NOT EXISTS store1(id int,name VARCHAR,stock int,price int,primary key(id,name));");
        pdb = openOrCreateDatabase("CafeDB", Context.MODE_PRIVATE, null);
        pdb.execSQL("CREATE TABLE IF NOT EXISTS store2(id int,price int,primary key(id));");
        pall = openOrCreateDatabase("CafeDB", Context.MODE_PRIVATE, null);
        pall.execSQL("CREATE TABLE IF NOT EXISTS store3(id int,price int,primary key(id));");
        temp.execSQL("DELETE FROM storee;");
        temp.execSQL("DELETE FROM store1;");
        temp.execSQL("DELETE FROM store;");
        temp.execSQL("DELETE FROM store2;");
        temp.execSQL("DELETE FROM store3;");
        int a=1,b=0,c=0;
        String d="Burger";
        int w=2;String s="Sandwich";
        int w1=3;String s1="HotCoffee";
        int w2=4;String s2="Maggi";
        int w3=5;String s3="Nuggets";
        int w4=6;String s4="Whitecoffee";
        int w5=7;String s5="Thick Coffee";
        int w6=8;String s6="Nachos";
        int w7=9;String s7="Choco.Sandwich";
        int w8=10;String s8="Fries";
        int w9=11;String s9="Pizza";
        int w10=12;String s10="Rice";
        int w11=13;String s11="Rice1";
        int w12=14;String s12="Rice2";
        int w13=15;String s13="Rice3";
        int w14=16;String s14="Rice4";

        temp.execSQL("INSERT INTO store1 VALUES('" + a + "','" + d +
                "','" + b + "','" + c + "');");

        temp.execSQL("INSERT INTO store1 VALUES('" + w + "','" + s +
                "','" + b + "','" + c + "');");

        temp.execSQL("INSERT INTO store1 VALUES('" + w1 + "','" + s1 +
                "','" + b + "','" + c + "');");

        temp.execSQL("INSERT INTO store1 VALUES('" + w2 + "','" + s2 +
                "','" + b + "','" + c + "');");
        temp.execSQL("INSERT INTO store1 VALUES('" + w3 + "','" + s3 +
                "','" + b + "','" + c + "');");
        temp.execSQL("INSERT INTO store1 VALUES('" + w4 + "','" + s4 +
                "','" + b + "','" + c + "');");
        temp.execSQL("INSERT INTO store1 VALUES('" + w5 + "','" + s5 +
                "','" + b + "','" + c + "');");
        temp.execSQL("INSERT INTO store1 VALUES('" + w6 + "','" + s6 +
                "','" + b + "','" + c + "');");
        temp.execSQL("INSERT INTO store1 VALUES('" + w7 + "','" + s7 +
                "','" + b + "','" + c + "');");
        temp.execSQL("INSERT INTO store1 VALUES('" + w8 + "','" + s8 +
                "','" + b + "','" + c + "');");
        temp.execSQL("INSERT INTO store1 VALUES('" + w9 + "','" + s9 +
                "','" + b + "','" + c + "');");
        temp.execSQL("INSERT INTO store1 VALUES('" + w10 + "','" + s10 +
                "','" + b + "','" + c + "');");

        temp.execSQL("INSERT INTO store1 VALUES('" + w11 + "','" + s11 +
                "','" + b + "','" + c + "');");
        temp.execSQL("INSERT INTO store1 VALUES('" + w12 + "','" + s12 +
                "','" + b + "','" + c + "');");
        temp.execSQL("INSERT INTO store1 VALUES('" + w13 + "','" + s13 +
                "','" + b + "','" + c + "');");
        temp.execSQL("INSERT INTO store1 VALUES('" + w14 + "','" + s14 +
                "','" + b + "','" + c + "');");









        BottomNavigationView navView = findViewById(R.id.bn);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        change_Fragment1(menu);


    }


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()) {
                case R.id.m1:
                    change_Fragment1(menu);
                    return true;
                case R.id.m2:
                    change_Fragment1(quantity);
                    return true;
                case R.id.m3:
                    change_Fragment1(viewAll);
                    return true;
                case R.id.m4:
                    change_Fragment1(pay);

                default:
                    return false;

            }
        }
    };




    private void change_Fragment1(Fragment fragment) { //choose version 4 for fragment

        FragmentTransaction fragmentTransaction3 = getSupportFragmentManager().beginTransaction();//transaction maintains the changes happening in the fragment
        fragmentTransaction3.replace(R.id.fragSpace, fragment);//fragmment same just passing the fragment object which changes again and again
        fragmentTransaction3.commit();
    }


    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        getMenuInflater().inflate(R.menu.upper_menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);

        switch (item.getItemId()) {
            case R.id.h:
                builder.setTitle("Help");

                builder.setMessage("help");

                builder.show();
                break;
            case R.id.cva:
                final int no=0;
                builder.setTitle("Delete All");
                builder.setMessage("\n" +
                        "Complete Database will be deleted!");
                builder.setPositiveButton("Do it!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        db.execSQL("DELETE FROM store");
                        db.execSQL("DELETE FROM store2");
                        db.execSQL("DELETE FROM storee");

                        Cursor ijj=temp.rawQuery("SELECT * FROM store1", null);
                        if (!ijj.moveToFirst()) return;

                        while (ijj.moveToNext()) {

                            temp.execSQL("UPDATE store1 SET stock=" + no + "");
                            temp.execSQL("UPDATE store1 SET price=" + no + "");
                        }

                        sno=1;
                        adapterV.clear();
                        adapterM.clear();
                        adapterP.clear();
                    }
                });

                builder.show();
                break;



        }
        return true;
    }

    public static void populateList(CustomAdapter ad, int toAccessDB) {
        Cursor i;
        if (toAccessDB==1)
            i = db.rawQuery("SELECT * FROM store ORDER BY id ASC", null);
        else if(toAccessDB==0)
            i = temp.rawQuery("SELECT * FROM storee ORDER BY id ASC", null);
        else if(toAccessDB==2)
            i = sale.rawQuery("SELECT * FROM store1 ORDER BY id ASC", null);
        else if(toAccessDB==3)
            i = pdb.rawQuery("SELECT * FROM store2 ORDER BY id ASC", null);
        else
            i = pdb.rawQuery("SELECT * FROM store3 ORDER BY id ASC", null);

        ad.clear();
        if (!i.moveToFirst()) return;
        ad.add(new Record(i));
        while ((i.moveToNext())) {
            ad.add(new Record(i));
        }
    }

    public static int givesrno()
    {
        return sno++;
    }



}

