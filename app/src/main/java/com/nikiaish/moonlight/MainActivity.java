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
        //db.execSQL("DELETE FROM store1");


        try
        {
            int a=1,bb=0,c=0;
            String d="Paneer Veg Cheese Burger";
            int w=2;String s="Plain Veg Burger";
            int w1=3;String s1="Cheese Veg Burger";
            int w2=4;String s2="Jain Veg Burger";
            int w3=5;String s3="Jain Veg Cheese Burger";
            int w4=6;String s4="Jain Paneer Burger";
            int w5=7;String s5="Thick Cold coffee";
            int w6=8;String s6="Irish Munch(Thunder)";
            int w7=9;String s7="Irish Munch(Crush)";
            int w8=10;String s8="Irish Munch";
            int w9=11;String s9="Moka Munch(Thunder)";
            int w10=12;String s10="Moka Munch(Crush)";
            int w11=13;String s11="Moka Munch";
            int w12=14;String s12="Munch Thunder(Crush)";
            int w13=15;String s13="Munch With Thunder";
            int w14=16;String s14="Munch With Crush";
            int w15=17;String s15="Caramel Munch";
            int w16=18;String s16="Carribean Munch";
            int w17=19;String s17="Oreo Munch";
            temp.execSQL("INSERT INTO store1 VALUES('" + a + "','" + d +
                    "','" + bb + "','" + c + "');");

            temp.execSQL("INSERT INTO store1 VALUES('" + w + "','" + s +
                    "','" + bb + "','" + c + "');");

            temp.execSQL("INSERT INTO store1 VALUES('" + w1 + "','" + s1 +
                    "','" + bb + "','" + c + "');");

            temp.execSQL("INSERT INTO store1 VALUES('" + w2 + "','" + s2 +
                    "','" + bb + "','" + c + "');");
            temp.execSQL("INSERT INTO store1 VALUES('" + w3 + "','" + s3 +
                    "','" + bb + "','" + c + "');");
            temp.execSQL("INSERT INTO store1 VALUES('" + w4 + "','" + s4 +
                    "','" + bb + "','" + c + "');");
            temp.execSQL("INSERT INTO store1 VALUES('" + w5 + "','" + s5 +
                    "','" + bb + "','" + c + "');");
            temp.execSQL("INSERT INTO store1 VALUES('" + w6 + "','" + s6 +
                    "','" + bb + "','" + c + "');");
            temp.execSQL("INSERT INTO store1 VALUES('" + w7 + "','" + s7 +
                    "','" + bb + "','" + c + "');");
            temp.execSQL("INSERT INTO store1 VALUES('" + w8 + "','" + s8 +
                    "','" + bb + "','" + c + "');");
            temp.execSQL("INSERT INTO store1 VALUES('" + w9 + "','" + s9 +
                    "','" + bb + "','" + c + "');");
            temp.execSQL("INSERT INTO store1 VALUES('" + w10 + "','" + s10 +
                    "','" + bb + "','" + c + "');");

            temp.execSQL("INSERT INTO store1 VALUES('" + w11 + "','" + s11 +
                    "','" + bb + "','" + c + "');");
            temp.execSQL("INSERT INTO store1 VALUES('" + w12 + "','" + s12 +
                    "','" + bb + "','" + c + "');");
            temp.execSQL("INSERT INTO store1 VALUES('" + w13 + "','" + s13 +
                    "','" + bb + "','" + c + "');");
            temp.execSQL("INSERT INTO store1 VALUES('" + w14 + "','" + s14 +
                    "','" + bb + "','" + c + "');");

            temp.execSQL("INSERT INTO store1 VALUES('" + w15 + "','" + s15 +
                    "','" + bb + "','" + c + "');");

            temp.execSQL("INSERT INTO store1 VALUES('" + w16 + "','" + s16 +
                    "','" + bb + "','" + c + "');");

            temp.execSQL("INSERT INTO store1 VALUES('" + w17 + "','" + s17 +
                    "','" + bb + "','" + c + "');");


            //  insert_into_sales(17,"Caramel Munch",0,0);
            //insert_into_sales(18,"Carribean Munch",0,0);
            //insert_into_sales(19,"Oreo Munch",0,0);
            insert_into_sales(20,"French Fries",0,0);
            insert_into_sales(21,"Masala French Fries",0,0);
            insert_into_sales(22,"Cheese Ball",0,0);
            insert_into_sales(23,"Nuggets",0,0);

            insert_into_sales(24,"Hot Coffee",0,0);
            insert_into_sales(25,"Black Coffee",0,0);
            insert_into_sales(26,"Veg Maggi",0,0);
            insert_into_sales(27,"Masala Cheese Maggi",0,0);
            insert_into_sales(28,"Plain Maggi",0,0);
            insert_into_sales(29,"Cheese Maggi",0,0);
            insert_into_sales(30,"Mexican Masala Maggi",0,0);


            insert_into_sales(31,"Moonlight Sp.Pizza",0,0);
            insert_into_sales(32,"Veg Cheese Pizza",0,0);
            insert_into_sales(33,"Veg Paneer Cheese Pizza",0,0);
            insert_into_sales(34,"Mushroom Cheese Pizza",0,0);
            insert_into_sales(35,"Sweet Corn Cheese Pizza",0,0);

            insert_into_sales(36,"Chocolate Cheese Pizza",0,0);
            insert_into_sales(37,"Capsicum Cheese Pizza",0,0);
            insert_into_sales(38,"Sweet Corn Pizza",0,0);
            insert_into_sales(39,"Chocolate Pizza",0,0);
            insert_into_sales(40,"Veg Pizza",0,0);
            insert_into_sales(41,"Plain Cheese Pizza",0,0);
            insert_into_sales(42,"Veg Jain Pizza",0,0);
            insert_into_sales(43,"Onion Pizza",0,0);
            insert_into_sales(44,"Capsicum Pizza",0,0);



            insert_into_sales(45,"Mushrom Cheese Sandwich",0,0);
            insert_into_sales(46,"Veg Mushroom Sandwich",0,0);
            insert_into_sales(47,"Cutlet Cheese Sandwich",0,0);
            insert_into_sales(48,"Paneer Cheese Sandwich",0,0);
            insert_into_sales(49,"Chocolate Cheese Sandwich",0,0);
            insert_into_sales(50,"Veg Cheese Sandwich",0,0);
            insert_into_sales(51,"Veg Paneer Sandwich",0,0);
            insert_into_sales(52,"Alu Butter Cheese Sandwich",0,0);
            insert_into_sales(53,"Veg Sandwich",0,0);
            insert_into_sales(54,"Chocolate Sandwich",0,0);
            insert_into_sales(55,"Plain Jam Sandwich",0,0);
           // insert_into_sales(56,"Plain Jam Sandwich",0,0);






            insert_into_sales(57,"Burger+Sandwich+Pepsi",0,0);
            insert_into_sales(58,"Pizza+Burger+ColdCoffee",0,0);
            insert_into_sales(59,"Pizza+Sandwich+Coldcoffee",0,0);
            insert_into_sales(60,"Burger+Sandwich+ColdCoffee",0,0);
            insert_into_sales(61,"Double Decker Cheese Pizza",0,0);
            insert_into_sales(62,"Pasta",0,0);
            insert_into_sales(63,"Moonlight Sp. Rice",0,0);
            insert_into_sales(64,"Misal Pav",0,0);

            insert_into_sales(65,"Mango Mastani",0,0);
            insert_into_sales(66,"Strawberry Mastani",0,0);
            insert_into_sales(67,"DryFruit Mastani",0,0);
            insert_into_sales(68,"ButterScotch Mastani",0,0);

            insert_into_sales(69,"Chocolate",0,0);
            insert_into_sales(70,"Chocolate with Crush",0,0);
            insert_into_sales(71,"Chocolate with Thunder",0,0);


            insert_into_sales(72,"Choco Cream (M)",0,0);
            insert_into_sales(73,"Choco Cream (B)",0,0);
            insert_into_sales(74,"White Choco Cream (M)",0,0);
            insert_into_sales(75,"White Choco Cream (B)",0,0);


            insert_into_sales(76,"Mango Shake",0,0);
            insert_into_sales(77,"Strawberry Shake",0,0);

        }

        catch(Exception e)
        {

        }


        populateList(adapterQ,2);
        populateList(adapterM,0);





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

            case R.id.s:
                builder.setTitle("Help");

                builder.setMessage("The following application shows 4 different screens where \n\n" +
                        "1.First Screen i.e. Menu helps in taking order and queues the order.Next order can be taken after you place 'DONE' button \n\n"+
                        "2.Second screen i.e.Sale gives the amount of each item sold \n\n"+
                        "3.Third screen i.e.View all gives the all the orders served till the time\n\n"+
                        "4.Fourth screen i.e.Unpaid gives the order number and total bill of that order and it can be payed after clicking on the 'Pay' button only after it is served\n\n"+
                        "For any further information click on created by.");
                builder.show();
                break;


            case R.id.c:
                builder.setTitle("Created By");

                builder.setMessage("Nikita Bagul and Aishwarya Patil\n\n"+
                        "For information contact:\n\n"+
                        "aishwaryap062@gmail.com and \n" +"nikitabagul09@gmail.com"
                        );

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
public void insert_into_sales(int a,String d,int bb,int c)
{
    temp.execSQL("INSERT INTO store1 VALUES('" + a + "','" + d +
            "','" + bb + "','" + c + "');");
}


}

