package com.nikiaish.moonlight;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

import static com.nikiaish.moonlight.MainActivity.adapterM;
import static com.nikiaish.moonlight.MainActivity.adapterP;
import static com.nikiaish.moonlight.MainActivity.adapterQ;
import static com.nikiaish.moonlight.MainActivity.adapterV;
import static com.nikiaish.moonlight.MainActivity.db;
import static com.nikiaish.moonlight.MainActivity.populateList;
import static com.nikiaish.moonlight.MainActivity.temp;

public class CustomAdapter extends ArrayAdapter<Record> {
    int main;
    boolean expandableItem;

    public CustomAdapter(Context context, ArrayList<Record> resource, int toAccessMainDB,boolean expItem ) {
        super(context, 0, resource);
        expandableItem=expItem;
        main = toAccessMainDB;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        convertView = LayoutInflater.from(getContext()).inflate(R.layout.order_queue, parent, false);

        convertView.findViewById(R.id.btn_del).setVisibility(View.GONE);
        convertView.findViewById(R.id.btn_mod).setVisibility(View.GONE);
        convertView.findViewById(R.id.btn_ser).setVisibility(View.GONE);


            Cursor item = getItem(position).getCursor(main);
            if (!item.moveToFirst()) return convertView;
            TextView tv;

            final String it_id = item.getString(0);
            final String i_name = item.getString(1);
            tv = convertView.findViewById(R.id.rec_f0);
            tv.setText(it_id);


            if(main!=3) {
                tv = convertView.findViewById(R.id.rec_f1);
                tv.setText(item.getString(1));
                tv = convertView.findViewById(R.id.rec_f2);
                tv.setText(item.getString(2));
                tv = convertView.findViewById(R.id.rec_f3);
                tv.setText(item.getString(3));
            }
            if(main==3)
            {
                tv = convertView.findViewById(R.id.rec_f1);
                tv.setText(null);
                tv = convertView.findViewById(R.id.rec_f2);
                tv.setText(null);
                tv = convertView.findViewById(R.id.rec_f3);
                tv.setText(item.getString(1));
            }
            if(expandableItem) {
                convertView.setOnClickListener(new View.OnClickListener() {

                    @Override

                    public void onClick(View view) {
                        Button mod = view.findViewById(R.id.btn_mod);


                        if (mod.getVisibility() == View.GONE) {
                            mod.setVisibility(View.VISIBLE);
                            view.findViewById(R.id.btn_del).setVisibility(View.VISIBLE);
                            view.findViewById(R.id.btn_ser).setVisibility(View.VISIBLE);
                        } else {
                            mod.setVisibility(View.GONE);
                            view.findViewById(R.id.btn_del).setVisibility(View.GONE);
                            view.findViewById(R.id.btn_ser).setVisibility(View.GONE);
                        }
                    }

                });


                convertView.findViewById(R.id.btn_del).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (main == 1)
                            db.execSQL("DELETE FROM store WHERE id=" + it_id + " and name=\"" + i_name+"\"");
                        else {

                            Cursor jj=temp.rawQuery("SELECT * FROM storee WHERE id=" + it_id + " and name=\"" + i_name+"\"", null);
                            if (!jj.moveToFirst()) return;

                            String w=jj.getString(2);
                            int ww=Integer.parseInt(w);

                            String e=jj.getString(3);
                            int ee=Integer.parseInt(e);
                            int dd=0;
                            if(ww!=0) {
                                 dd = ee / ww;

                            }
                            int pp = dd * ww;
                            temp.execSQL("DELETE FROM storee WHERE id=" + it_id + " and name=\"" + i_name + "\"");

                            adapterM.clear();
                            populateList(adapterM,0);

                            Cursor uu=temp.rawQuery("SELECT * FROM store1 WHERE name=\"" + i_name+"\"", null);
                            if (!uu.moveToFirst()) return;


                            String z=uu.getString(3);
                            int c=Integer.parseInt(z);

                            String y=uu.getString(2);
                            int d=Integer.parseInt(y);

                            int rr=d-ww;
                            int tt=c-pp;

                            temp.execSQL("UPDATE store1 SET stock=" + rr + " WHERE name=\"" + i_name + "\"");
                            temp.execSQL("UPDATE store1 SET price=" + tt + " WHERE name=\"" + i_name + "\"");


                            Cursor f = temp.rawQuery("SELECT * FROM store2 WHERE id=\"" + it_id + "\"", null);
                            if (!f.moveToFirst()) return;

                            String z1 = f.getString(1);
                            int c1 = Integer.parseInt(z1);

                            int jk=c1-ee;
                          if(jk==0)
                          {
                              temp.execSQL("DELETE FROM store2 WHERE id=" + it_id);
                          }
                            else {
                              temp.execSQL("UPDATE store2 SET price=" + jk + " WHERE id=\"" + it_id + "\"");
                          }
                        }
                        populateList(adapterV, 1);
                        populateList(adapterM, 0);
                        populateList(adapterQ, 2);
                        populateList(adapterP,3);

                    }
                });
                convertView.findViewById(R.id.btn_ser).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Cursor i = temp.rawQuery("SELECT * FROM storee WHERE id=" + it_id + " and name=\"" + i_name+"\"", null);
                        if (!i.moveToFirst()) return;
                        db.execSQL("INSERT INTO store VALUES('" + i.getString(0) + "','" + i.getString(1) +
                                "','" + i.getString(2) + "','" + i.getString(3) + "');");

                        adapterM.clear();
                        temp.execSQL("DELETE FROM storee WHERE id=" + it_id + " and name=\"" + i_name+"\"");
                        populateList(adapterM, 0);
                        if (temp.rawQuery("SELECT * FROM storee WHERE id=" + it_id + " and name=\"" + i_name+"\"", null).moveToFirst()) {

                            Cursor i1 = temp.rawQuery("SELECT * FROM storee WHERE id=" + it_id + " and name=\"" + i_name+"\"", null);
                            if (!i1.moveToFirst()) return;
                            db.execSQL("INSERT INTO store VALUES('" + i1.getString(0) + "','" + i1.getString(1) +
                                    "','" + i1.getString(2) + "','" + i1.getString(3) + "');");


                            while (i1.moveToNext()) {
                                db.execSQL("INSERT INTO store VALUES('" + i1.getString(0) + "','" + i1.getString(1) +
                                        "','" + i1.getString(2) + "','" + i1.getString(3) + "');");
                            }

                            temp.execSQL("DELETE FROM storee WHERE id=" + it_id + " and name=\"" + i_name+"\"");
                            adapterM.clear();
                            populateList(adapterM, 0);
                            populateList(adapterV, 1);
                        }
                        populateList(adapterV, 1);

                }
                });


                               convertView.findViewById(R.id.btn_mod).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                AlertDialog.Builder modifier = new AlertDialog.Builder(getContext());
                                modifier.setTitle("Change Quantity");
                                View lay = LayoutInflater.from(getContext()).inflate(R.layout.quantity_modify, null, false);
                                final EditText et1 = lay.findViewById(R.id.modField1);
                                Cursor sel;
                                if (main == 1)
                                    sel = db.rawQuery("SELECT * FROM store WHERE id=" + it_id + " and name=\"" + i_name+"\"", null);
                                else if (main == 0)
                                    sel = temp.rawQuery("SELECT * FROM storee WHERE id=" + it_id + " and name=\"" + i_name+"\"", null);
                                else
                                    sel = temp.rawQuery("SELECT * FROM store1 WHERE id=" + it_id + " and name=" + i_name, null);
                                if (!sel.moveToFirst()) return;
                                et1.setText(sel.getString(2));


                        final String q=sel.getString(2);
                        final int oq=Integer.parseInt(q);


                        final String pp=sel.getString(3);
                        final int pp1=Integer.parseInt(pp);

                        //final int h=pp1/oq;



                        modifier.setPositiveButton("Modify", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                String newId = et1.getText().toString().trim();
                                if (newId.length() <= 0) {
                                    Toast.makeText(getContext(), "Null not allowed!", Toast.LENGTH_SHORT).show();
                                    return;
                                }
                                String nq=et1.getText().toString().trim();
                                int nqq=Integer.parseInt(nq);

                                if(nqq!=0) {
                                    Cursor u = temp.rawQuery("SELECT * FROM store1 WHERE name=\"" + i_name + "\"", null);
                                    if (!u.moveToFirst()) return;

                                    String z = u.getString(3);
                                    int c = Integer.parseInt(z);

                                    String y = u.getString(2);
                                    int d = Integer.parseInt(y);
                                    int pr = 0;

                                    if (d != 0) {
                                        pr = c / d;
                                    }

                                    int s = nqq * pr;
                                    int r;
                                    if (oq > nqq) {

                                        r = oq - nqq;
                                        d = d - r;
                                        int to = pr * d;

                                        int zz=r*pr;

                                        temp.execSQL("UPDATE store1 SET stock=" + d + " WHERE name=\"" + i_name + "\"");
                                        temp.execSQL("UPDATE store1 SET price=" + to + " WHERE name=\"" + i_name + "\"");
                                        temp.execSQL("UPDATE storee SET stock=" + nqq + " WHERE id=" + it_id + " and name=\"" + i_name + "\"");
                                        temp.execSQL("UPDATE storee SET price=" + s + " WHERE id=" + it_id + " and name=\"" + i_name + "\"");
                                        populateList(adapterM,0);
                                        Cursor f = temp.rawQuery("SELECT * FROM store2 WHERE id=\"" + it_id + "\"", null);
                                        if (!f.moveToFirst()) return;

                                        String z1 = f.getString(1);
                                        int c1 = Integer.parseInt(z1);

                                        int jk=c1-zz;
                                        temp.execSQL("UPDATE store2 SET price=" + jk + " WHERE id=\"" + it_id + "\"");

                                    } else {
                                        r = nqq - oq;
                                        d = d + r;
                                        int to = pr * d;

                                        int zz=r*pr;

                                        temp.execSQL("UPDATE store1 SET stock=" + d + " WHERE name=\"" + i_name + "\"");
                                        temp.execSQL("UPDATE store1 SET price=" + to + " WHERE name=\"" + i_name + "\"");
                                        temp.execSQL("UPDATE storee SET stock=" + nqq + " WHERE id=" + it_id + " and name=\"" + i_name + "\"");
                                        temp.execSQL("UPDATE storee SET price=" + s + " WHERE id=" + it_id + " and name=\"" + i_name + "\"");
                                        populateList(adapterM,0);
                                        Cursor f = temp.rawQuery("SELECT * FROM store2 WHERE id=\"" + it_id + "\"", null);
                                        if (!f.moveToFirst()) return;

                                        String z1 = f.getString(1);
                                        int c1 = Integer.parseInt(z1);

                                        int jk=c1+zz;
                                        temp.execSQL("UPDATE store2 SET price=" + jk + " WHERE id=\"" + it_id + "\"");

                                    }

                                    if (main == 1)
                                        db.execSQL("UPDATE store SET Quantity=" + et1.getText() + "' WHERE id=" + it_id + "and name=" + i_name);
                                    else if (main == 0) {
                                        temp.execSQL("UPDATE storee SET stock=" + et1.getText() + " WHERE id=" + it_id + " and name=\"" + i_name + "\"");
                                        temp.execSQL("UPDATE storee SET price=" + s + " WHERE id=" + it_id + " and name=\"" + i_name + "\"");
                                    } else
                                        temp.execSQL("UPDATE store1 SET id=" + et1.getText() + "' WHERE id=" + it_id + "and name=" + i_name);
                                    Toast.makeText(getContext(), "Order Changed", Toast.LENGTH_SHORT).show();
                                }
                                else
                                {
                                    Toast.makeText(getContext(), "Quantity cant be 0", Toast.LENGTH_SHORT).show();
                                }
                                populateList(adapterV, main);
                                populateList(adapterM, main);
                                populateList(adapterQ, main);
                                return;
                            }
                        });
                        modifier.setView(lay);
                        modifier.setCancelable(true);
                        modifier.show();
                    }
                });
            }
          if(main==3)
            {


                convertView.setOnClickListener(new View.OnClickListener() {

                    @Override

                    public void onClick(View view) {
                        Button mod = view.findViewById(R.id.btn_mod);
                        mod.setText("Pay");


                        if (mod.getVisibility() == View.GONE) {
                            mod.setVisibility(View.VISIBLE);
                            view.findViewById(R.id.btn_del).setVisibility(View.GONE);
                            view.findViewById(R.id.btn_ser).setVisibility(View.GONE);
                        } else {
                            mod.setVisibility(View.GONE);
                            view.findViewById(R.id.btn_del).setVisibility(View.GONE);
                            view.findViewById(R.id.btn_ser).setVisibility(View.GONE);

                        }
                    }

                });



                convertView.findViewById(R.id.btn_mod).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {


                        Cursor gh=temp.rawQuery("SELECT * FROM storee WHERE id=\"" + it_id + "\"", null);
                        if(gh.getCount()==0) {
                            adapterP.clear();
                            temp.execSQL("DELETE FROM store2 WHERE id=" + it_id);
                            populateList(adapterP, 3);

                        }
                        else
                        {
                            Toast.makeText(getContext(), "Order Is Not Served Completely", Toast.LENGTH_SHORT).show();
                        }
                        }

                });
                populateList(adapterP, 3);
            }

        return convertView;
    }
}
