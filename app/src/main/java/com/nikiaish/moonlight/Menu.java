package com.nikiaish.moonlight;

        import android.app.AlertDialog;
        import android.content.DialogInterface;
        import android.database.Cursor;
        import android.os.Bundle;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.ListView;
        import android.widget.Toast;

        import androidx.annotation.NonNull;
        import androidx.annotation.Nullable;
        import androidx.fragment.app.Fragment;

        import static com.nikiaish.moonlight.MainActivity.adapterM;
        import static com.nikiaish.moonlight.MainActivity.pdb;
        import static com.nikiaish.moonlight.MainActivity.populateList;
        import static com.nikiaish.moonlight.MainActivity.temp;

public class Menu extends Fragment {

    int b;
    ListView addList;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,fi2,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30,b31,b32,b33,b34,b35,b36,b37,b38,b39,b40,b41,b42,b43,b44,b45,b46,b47,b48,b49,b50,b51,b52,b53,b54,b55,b56,b57,b58,b59,b60,b61,b62,b63,b64,b65,b66,b67,b68,b69,b70,b71,b72,b73,b74,b75,b76,b77,b78;
    int sno=1;
    public Menu()
    {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View lay = inflater.inflate(R.layout.frag_menu,container,false);

        addList = lay.findViewById(R.id.list3);
        addList.setAdapter(adapterM);

        fi2=lay.findViewById(R.id.fi2);
        b1=lay.findViewById(R.id.b1);
        b2=lay.findViewById(R.id.b2);
        b3=lay.findViewById(R.id.b3);
        b4 = lay.findViewById(R.id.b4);
        b5=lay.findViewById(R.id.b5);
        b6=lay.findViewById(R.id.b6);
        b7=lay.findViewById(R.id.b7);
        b8=lay.findViewById(R.id.b8);
        b9=lay.findViewById(R.id.b9);
        b10=lay.findViewById(R.id.b10);
        b11=lay.findViewById(R.id.b11);
        b12=lay.findViewById(R.id.b12);

        b13=lay.findViewById(R.id.b13);
        b14=lay.findViewById(R.id.b14);
        b15=lay.findViewById(R.id.b15);
        b16=lay.findViewById(R.id.b16);
        b17=lay.findViewById(R.id.b17);
        b18=lay.findViewById(R.id.b18);
        b19=lay.findViewById(R.id.b19);
        b20=lay.findViewById(R.id.b20);
        b21=lay.findViewById(R.id.b21);
        b22=lay.findViewById(R.id.b22);
        b23=lay.findViewById(R.id.b23);
        b24=lay.findViewById(R.id.b24);
        b25=lay.findViewById(R.id.b25);
        b26=lay.findViewById(R.id.b26);
        b27=lay.findViewById(R.id.b27);
        b28=lay.findViewById(R.id.b28);
        b29=lay.findViewById(R.id.b29);
        b30=lay.findViewById(R.id.b30);
        b31=lay.findViewById(R.id.b31);
        b32=lay.findViewById(R.id.b32);
        b33=lay.findViewById(R.id.b33);
        b34=lay.findViewById(R.id.b34);
        b35=lay.findViewById(R.id.b35);
        b36=lay.findViewById(R.id.b36);
        b37=lay.findViewById(R.id.b37);
        b38=lay.findViewById(R.id.b38);
        b39=lay.findViewById(R.id.b39);
        b40=lay.findViewById(R.id.b40);
        b41=lay.findViewById(R.id.b41);
        b42=lay.findViewById(R.id.b42);
        b43=lay.findViewById(R.id.b43);
        b44=lay.findViewById(R.id.b44);
        b45=lay.findViewById(R.id.b45);
        b46=lay.findViewById(R.id.b46);
        b47=lay.findViewById(R.id.b47);
        b48=lay.findViewById(R.id.b48);
        b49=lay.findViewById(R.id.b49);
        b50=lay.findViewById(R.id.b50);
        b51=lay.findViewById(R.id.b51);
        b52=lay.findViewById(R.id.b52);
        b53=lay.findViewById(R.id.b53);
        b54=lay.findViewById(R.id.b54);
        b55=lay.findViewById(R.id.b55);
       // b56=lay.findViewById(R.id.b56);
        b57=lay.findViewById(R.id.b57);
        b58=lay.findViewById(R.id.b58);
        b59=lay.findViewById(R.id.b59);
        b60=lay.findViewById(R.id.b60);

        b61=lay.findViewById(R.id.b61);
        b62=lay.findViewById(R.id.b62);
        b63=lay.findViewById(R.id.b63);
         b64=lay.findViewById(R.id.b64);
        b65=lay.findViewById(R.id.b65);
        b66=lay.findViewById(R.id.b66);
        b67=lay.findViewById(R.id.b67);
        b68=lay.findViewById(R.id.b68);
        b69=lay.findViewById(R.id.b69);
        b70=lay.findViewById(R.id.b70);
        b71=lay.findViewById(R.id.b71);
        b72=lay.findViewById(R.id.b72);
        b73=lay.findViewById(R.id.b73);
        b74=lay.findViewById(R.id.b74);
        b75=lay.findViewById(R.id.b75);

        b77=lay.findViewById(R.id.b77);
        b78=lay.findViewById(R.id.b78);









/*
        insert_in_table(17,"Caramel Munch",0,0);
        insert_in_table(18,"Carribean Munch",0,0);
        insert_in_table(19,"Oreo Munch",0,0);

*/



        b1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
               /* Cursor c1=temp.rawQuery("SELECT * FROM store ORDER BY id ASC", null);
                Cursor c2=temp.rawQuery("SELECT * FROM storee ORDER BY id ASC", null);
                Cursor c3=temp.rawQuery("SELECT * FROM store2 ORDER BY id ASC", null);

                if(c1.getCount()==0&&c2.getCount()==0&&c3.getCount()==0)
                {
                    sno=1;
                }

                AlertDialog.Builder modifier = new AlertDialog.Builder(getContext());
                modifier.setTitle("Quantity");
                View lay = LayoutInflater.from(getContext()).inflate(R.layout.quantity_modify, null, false);
                final EditText et1 = lay.findViewById(R.id.modField1);
                modifier.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        String newId = et1.getText().toString().trim();
                        if (newId.length() <= 0) {
                            Toast.makeText(getContext(), "Empty fields not allowed!", Toast.LENGTH_SHORT).show();
                            return;
                        }

                        int price1;
                        String price,d;


                        String n= String.valueOf(b1.getText());
                        int b;
                        price =  n.substring(n.indexOf("[")+1, n.indexOf("]"));
                        price1 = Integer.parseInt(price);
                        d =  n.substring(0, n.indexOf("[")-1);
                        d = d.trim();

                        b = (int) Integer.parseInt(String.valueOf(et1.getText()));
                        int c=b*price1;


                        Cursor ty=temp.rawQuery("SELECT * FROM store1 WHERE name=\"" + d + "\"", null);
                        if (!ty.moveToFirst()) return;


                        String hg=ty.getString(2);
                        int qq= Integer.parseInt(hg);

                        String ba=ty.getString(3);
                        int ru=Integer.parseInt(ba);

                        int oo=qq+b;
                        int df=ru+c;




                        Cursor cd=temp.rawQuery("SELECT * FROM store WHERE id=" + sno + " and name=\"" + d+"\"", null);
                        if(cd.getCount()==0) {

                            temp.execSQL("UPDATE store1 SET stock=" + oo + " WHERE name=\"" + d + "\"");
                            temp.execSQL("UPDATE store1 SET price=" + df + " WHERE name=\"" + d + "\"");
                            if (b != 0) {
                                try {
                                    temp.execSQL("INSERT INTO storee VALUES('" + sno + "','" + d +
                                            "','" + b + "','" + c + "');");
                                } catch (Exception e) {
                                    Toast.makeText(getActivity(), "Item alredy exists in same order", Toast.LENGTH_SHORT).show();
                                }
                            }
                            if (b == 0) {
                                Toast.makeText(getActivity(), "Quantity Should not be 0", Toast.LENGTH_SHORT).show();
                            }
                        }
                        else {
                            Toast.makeText(getActivity(), "Item alredy exists in same order", Toast.LENGTH_SHORT).show();
                        }



                        populateList(adapterM,0);


                    }
                });

                modifier.setView(lay);
                modifier.setCancelable(true);
                modifier.show();



*/


                put(b1);
            }

        });


        b2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
         /*       Cursor c1=temp.rawQuery("SELECT * FROM store ORDER BY id ASC", null);
                Cursor c2=temp.rawQuery("SELECT * FROM storee ORDER BY id ASC", null);
                Cursor c3=temp.rawQuery("SELECT * FROM store2 ORDER BY id ASC", null);

                if(c1.getCount()==0&&c2.getCount()==0&&c3.getCount()==0)
                {
                    sno=1;
                }

                AlertDialog.Builder modifier = new AlertDialog.Builder(getContext());
                modifier.setTitle("Quantity");
                View lay = LayoutInflater.from(getContext()).inflate(R.layout.quantity_modify, null, false);
                final EditText et1 = lay.findViewById(R.id.modField1);
                modifier.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        String newId = et1.getText().toString().trim();
                        if (newId.length() <= 0) {
                            Toast.makeText(getContext(), "Empty fields not allowed!", Toast.LENGTH_SHORT).show();
                            return;
                        }

                        int price1;
                        String price,d;


                        String n= String.valueOf(b2.getText());
                        int b;
                        price =  n.substring(n.indexOf("[")+1, n.indexOf("]"));
                        price1 = Integer.parseInt(price);
                        d =  n.substring(0, n.indexOf("[")-1);
                        d = d.trim();

                        b = (int) Integer.parseInt(String.valueOf(et1.getText()));
                        int c=b*price1;


                        Cursor ty=temp.rawQuery("SELECT * FROM store1 WHERE name=\"" + d + "\"", null);
                        if (!ty.moveToFirst()) return;


                        String hg=ty.getString(2);
                        int qq= Integer.parseInt(hg);

                        String ba=ty.getString(3);
                        int ru=Integer.parseInt(ba);

                        int oo=qq+b;
                        int df=ru+c;




                        Cursor cd=temp.rawQuery("SELECT * FROM store WHERE id=" + sno + " and name=\"" + d+"\"", null);
                        if(cd.getCount()==0) {
                            temp.execSQL("UPDATE store1 SET stock=" + oo + " WHERE name=\"" + d + "\"");
                            temp.execSQL("UPDATE store1 SET price=" + df + " WHERE name=\"" + d + "\"");

                            if (b != 0) {
                                try {
                                    temp.execSQL("INSERT INTO storee VALUES('" + sno + "','" + d +
                                            "','" + b + "','" + c + "');");
                                } catch (Exception e) {
                                    Toast.makeText(getActivity(), "Item alredy exists in same order", Toast.LENGTH_SHORT).show();
                                }
                            }
                            if (b == 0) {
                                Toast.makeText(getActivity(), "Quantity Should not be 0", Toast.LENGTH_SHORT).show();
                            }
                        }

                        else {
                            Toast.makeText(getActivity(), "Item alredy exists in same order", Toast.LENGTH_SHORT).show();
                        }





                        populateList(adapterM,0);


                    }
                });

                modifier.setView(lay);
                modifier.setCancelable(true);
                modifier.show();


*/
                put(b2);
            }

        });


        b3.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
               /* Cursor c1=temp.rawQuery("SELECT * FROM store ORDER BY id ASC", null);
                Cursor c2=temp.rawQuery("SELECT * FROM storee ORDER BY id ASC", null);
                Cursor c3=temp.rawQuery("SELECT * FROM store2 ORDER BY id ASC", null);

                if(c1.getCount()==0&&c2.getCount()==0&&c3.getCount()==0)
                {
                    sno=1;
                }

                AlertDialog.Builder modifier = new AlertDialog.Builder(getContext());
                modifier.setTitle("Quantity");
                View lay = LayoutInflater.from(getContext()).inflate(R.layout.quantity_modify, null, false);
                final EditText et1 = lay.findViewById(R.id.modField1);
                modifier.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        String newId = et1.getText().toString().trim();
                        if (newId.length() <= 0) {
                            Toast.makeText(getContext(), "Empty fields not allowed!", Toast.LENGTH_SHORT).show();
                            return;
                        }

                        int price1;
                        String price,d;


                        String n= String.valueOf(b3.getText());

                        price =  n.substring(n.indexOf("[")+1, n.indexOf("]"));
                        price1 = Integer.parseInt(price);
                        d =  n.substring(0, n.indexOf("[")-1);
                        d = d.trim();

                        b = (int) Integer.parseInt(String.valueOf(et1.getText()));
                        int c=b*price1;


                        Cursor ty=temp.rawQuery("SELECT * FROM store1 WHERE name=\"" + d + "\"", null);
                        if (!ty.moveToFirst()) return;


                        String hg=ty.getString(2);
                        int qq= Integer.parseInt(hg);

                        String ba=ty.getString(3);
                        int ru=Integer.parseInt(ba);

                        int oo=qq+b;
                        int df=ru+c;




                        Cursor cd=temp.rawQuery("SELECT * FROM store WHERE id=" + sno + " and name=\"" + d+"\"", null);
                        if(cd.getCount()==0) {
                            temp.execSQL("UPDATE store1 SET stock=" + oo + " WHERE name=\"" + d + "\"");
                            temp.execSQL("UPDATE store1 SET price=" + df + " WHERE name=\"" + d + "\"");
                            if (b != 0) {
                                try {
                                    temp.execSQL("INSERT INTO storee VALUES('" + sno + "','" + d +
                                            "','" + b + "','" + c + "');");
                                } catch (Exception e) {
                                    Toast.makeText(getActivity(), "Item alredy exists in same order", Toast.LENGTH_SHORT).show();
                                }
                            }
                            if (b == 0) {
                                Toast.makeText(getActivity(), "Quantity Should not be 0", Toast.LENGTH_SHORT).show();
                            }

                        }
                        else {
                            Toast.makeText(getActivity(), "Item alredy exists in same order", Toast.LENGTH_SHORT).show();
                        }




                        populateList(adapterM,0);


                    }
                });


                modifier.setView(lay);
                modifier.setCancelable(true);
                modifier.show();
*/
                put(b3);


            }

        });


        b4.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {

          /*      Cursor c1=temp.rawQuery("SELECT * FROM store ORDER BY id ASC", null);
                Cursor c2=temp.rawQuery("SELECT * FROM storee ORDER BY id ASC", null);
                Cursor c3=temp.rawQuery("SELECT * FROM store2 ORDER BY id ASC", null);

                if(c1.getCount()==0&&c2.getCount()==0&&c3.getCount()==0)
                {
                    sno=1;
                }
                AlertDialog.Builder modifier = new AlertDialog.Builder(getContext());
                modifier.setTitle("Quantity");
                View lay = LayoutInflater.from(getContext()).inflate(R.layout.quantity_modify, null, false);
                final EditText et1 = lay.findViewById(R.id.modField1);
                modifier.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        String newId = et1.getText().toString().trim();
                        if (newId.length() <= 0) {
                            Toast.makeText(getContext(), "Empty fields not allowed!", Toast.LENGTH_SHORT).show();
                            return;
                        }

                        int price1;
                        String price,d;


                        String n= String.valueOf(b4.getText());

                        price =  n.substring(n.indexOf("[")+1, n.indexOf("]"));
                        price1 = Integer.parseInt(price);
                        d =  n.substring(0, n.indexOf("[")-1);
                        d = d.trim();

                        b = (int) Integer.parseInt(String.valueOf(et1.getText()));
                        int c=b*price1;


                        Cursor ty=temp.rawQuery("SELECT * FROM store1 WHERE name=\"" + d + "\"", null);
                        if (!ty.moveToFirst()) return;


                        String hg=ty.getString(2);
                        int qq= Integer.parseInt(hg);

                        String ba=ty.getString(3);
                        int ru=Integer.parseInt(ba);

                        int oo=qq+b;
                        int df=ru+c;




                        Cursor cd=temp.rawQuery("SELECT * FROM store WHERE id=" + sno + " and name=\"" + d+"\"", null);
                        if(cd.getCount()==0) {
                            temp.execSQL("UPDATE store1 SET stock=" + oo + " WHERE name=\"" + d + "\"");
                            temp.execSQL("UPDATE store1 SET price=" + df + " WHERE name=\"" + d + "\"");
                            if (b != 0) {
                                try {
                                    temp.execSQL("INSERT INTO storee VALUES('" + sno + "','" + d +
                                            "','" + b + "','" + c + "');");
                                } catch (Exception e) {
                                    Toast.makeText(getActivity(), "Item alredy exists in same order", Toast.LENGTH_SHORT).show();
                                }
                            }
                            if (b == 0) {
                                Toast.makeText(getActivity(), "Quantity Should not be 0", Toast.LENGTH_SHORT).show();
                            }

                        }

                        else {
                            Toast.makeText(getActivity(), "Item alredy exists in same order", Toast.LENGTH_SHORT).show();
                        }



                        populateList(adapterM,0);


                    }
                });


                modifier.setView(lay);
                modifier.setCancelable(true);
                modifier.show();
*/
                put(b4);


            }

        });

        b5.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
            /*    Cursor c1=temp.rawQuery("SELECT * FROM store ORDER BY id ASC", null);
                Cursor c2=temp.rawQuery("SELECT * FROM storee ORDER BY id ASC", null);
                Cursor c3=temp.rawQuery("SELECT * FROM store2 ORDER BY id ASC", null);

                if(c1.getCount()==0&&c2.getCount()==0&&c3.getCount()==0)
                {
                    sno=1;
                }

                AlertDialog.Builder modifier = new AlertDialog.Builder(getContext());
                modifier.setTitle("Quantity");
                View lay = LayoutInflater.from(getContext()).inflate(R.layout.quantity_modify, null, false);
                final EditText et1 = lay.findViewById(R.id.modField1);
                modifier.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        String newId = et1.getText().toString().trim();
                        if (newId.length() <= 0) {
                            Toast.makeText(getContext(), "Empty fields not allowed!", Toast.LENGTH_SHORT).show();
                            return;
                        }

                        int price1;
                        String price,d;


                        String n= String.valueOf(b5.getText());

                        price =  n.substring(n.indexOf("[")+1, n.indexOf("]"));
                        price1 = Integer.parseInt(price);
                        d =  n.substring(0, n.indexOf("[")-1);
                        d = d.trim();

                        b = (int) Integer.parseInt(String.valueOf(et1.getText()));
                        int c=b*price1;


                        Cursor ty=temp.rawQuery("SELECT * FROM store1 WHERE name=\"" + d + "\"", null);
                        if (!ty.moveToFirst()) return;


                        String hg=ty.getString(2);
                        int qq= Integer.parseInt(hg);

                        String ba=ty.getString(3);
                        int ru=Integer.parseInt(ba);

                        int oo=qq+b;
                        int df=ru+c;




                        Cursor cd=temp.rawQuery("SELECT * FROM store WHERE id=" + sno + " and name=\"" + d+"\"", null);
                        if(cd.getCount()==0) {
                            temp.execSQL("UPDATE store1 SET stock=" + oo + " WHERE name=\"" + d + "\"");
                            temp.execSQL("UPDATE store1 SET price=" + df + " WHERE name=\"" + d + "\"");
                            if (b != 0) {
                                try {
                                    temp.execSQL("INSERT INTO storee VALUES('" + sno + "','" + d +
                                            "','" + b + "','" + c + "');");
                                } catch (Exception e) {
                                    Toast.makeText(getActivity(), "Item alredy exists in same order", Toast.LENGTH_SHORT).show();
                                }
                            }
                            if (b == 0) {
                                Toast.makeText(getActivity(), "Quantity Should not be 0", Toast.LENGTH_SHORT).show();
                            }

                        }

                        else {
                            Toast.makeText(getActivity(), "Item alredy exists in same order", Toast.LENGTH_SHORT).show();
                        }



                        populateList(adapterM,0);


                    }
                });


                modifier.setView(lay);
                modifier.setCancelable(true);
                modifier.show();
*/
                put(b5);


            }

        });

        b6.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
          /*      Cursor c1=temp.rawQuery("SELECT * FROM store ORDER BY id ASC", null);
                Cursor c2=temp.rawQuery("SELECT * FROM storee ORDER BY id ASC", null);
                Cursor c3=temp.rawQuery("SELECT * FROM store2 ORDER BY id ASC", null);

                if(c1.getCount()==0&&c2.getCount()==0&&c3.getCount()==0)
                {
                    sno=1;
                }

                AlertDialog.Builder modifier = new AlertDialog.Builder(getContext());
                modifier.setTitle("Quantity");
                View lay = LayoutInflater.from(getContext()).inflate(R.layout.quantity_modify, null, false);
                final EditText et1 = lay.findViewById(R.id.modField1);
                modifier.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        String newId = et1.getText().toString().trim();
                        if (newId.length() <= 0) {
                            Toast.makeText(getContext(), "Empty fields not allowed!", Toast.LENGTH_SHORT).show();
                            return;
                        }

                        int price1;
                        String price,d;


                        String n= String.valueOf(b6.getText());

                        price =  n.substring(n.indexOf("[")+1, n.indexOf("]"));
                        price1 = Integer.parseInt(price);
                        d =  n.substring(0, n.indexOf("[")-1);
                        d = d.trim();

                        b = (int) Integer.parseInt(String.valueOf(et1.getText()));
                        int c=b*price1;


                        Cursor ty=temp.rawQuery("SELECT * FROM store1 WHERE name=\"" + d + "\"", null);
                        if (!ty.moveToFirst()) return;


                        String hg=ty.getString(2);
                        int qq= Integer.parseInt(hg);

                        String ba=ty.getString(3);
                        int ru=Integer.parseInt(ba);

                        int oo=qq+b;
                        int df=ru+c;




                        Cursor cd=temp.rawQuery("SELECT * FROM store WHERE id=" + sno + " and name=\"" + d+"\"", null);
                        if(cd.getCount()==0) {
                            temp.execSQL("UPDATE store1 SET stock=" + oo + " WHERE name=\"" + d + "\"");
                            temp.execSQL("UPDATE store1 SET price=" + df + " WHERE name=\"" + d + "\"");
                            if (b != 0) {
                                try {
                                    temp.execSQL("INSERT INTO storee VALUES('" + sno + "','" + d +
                                            "','" + b + "','" + c + "');");
                                } catch (Exception e) {
                                    Toast.makeText(getActivity(), "Item alredy exists in same order", Toast.LENGTH_SHORT).show();
                                }
                            }
                            if (b == 0) {
                                Toast.makeText(getActivity(), "Quantity Should not be 0", Toast.LENGTH_SHORT).show();
                            }
                        }

                        else {
                            Toast.makeText(getActivity(), "Item alredy exists in same order", Toast.LENGTH_SHORT).show();
                        }




                        populateList(adapterM,0);


                    }
                });


                modifier.setView(lay);
                modifier.setCancelable(true);
                modifier.show();
*/
                put(b6);


            }

        });

        b7.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {

            /*    Cursor c1=temp.rawQuery("SELECT * FROM store ORDER BY id ASC", null);
                Cursor c2=temp.rawQuery("SELECT * FROM storee ORDER BY id ASC", null);
                Cursor c3=temp.rawQuery("SELECT * FROM store2 ORDER BY id ASC", null);

                if(c1.getCount()==0&&c2.getCount()==0&&c3.getCount()==0)
                {
                    sno=1;
                }

                AlertDialog.Builder modifier = new AlertDialog.Builder(getContext());
                modifier.setTitle("Quantity");
                View lay = LayoutInflater.from(getContext()).inflate(R.layout.quantity_modify, null, false);
                final EditText et1 = lay.findViewById(R.id.modField1);
                modifier.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        String newId = et1.getText().toString().trim();
                        if (newId.length() <= 0) {
                            Toast.makeText(getContext(), "Empty fields not allowed!", Toast.LENGTH_SHORT).show();
                            return;
                        }

                        int price1;
                        String price,d;


                        String n= String.valueOf(b7.getText());

                        price =  n.substring(n.indexOf("[")+1, n.indexOf("]"));
                        price1 = Integer.parseInt(price);
                        d =  n.substring(0, n.indexOf("[")-1);
                        d = d.trim();

                        b = (int) Integer.parseInt(String.valueOf(et1.getText()));
                        int c=b*price1;


                        Cursor ty=temp.rawQuery("SELECT * FROM store1 WHERE name=\"" + d + "\"", null);
                        if (!ty.moveToFirst()) return;


                        String hg=ty.getString(2);
                        int qq= Integer.parseInt(hg);

                        String ba=ty.getString(3);
                        int ru=Integer.parseInt(ba);

                        int oo=qq+b;
                        int df=ru+c;




                        Cursor cd=temp.rawQuery("SELECT * FROM store WHERE id=" + sno + " and name=\"" + d+"\"", null);
                        if(cd.getCount()==0) {

                            temp.execSQL("UPDATE store1 SET stock=" + oo + " WHERE name=\"" + d + "\"");
                            temp.execSQL("UPDATE store1 SET price=" + df + " WHERE name=\"" + d + "\"");
                            if (b != 0) {
                                try {
                                    temp.execSQL("INSERT INTO storee VALUES('" + sno + "','" + d +
                                            "','" + b + "','" + c + "');");
                                } catch (Exception e) {
                                    Toast.makeText(getActivity(), "Item alredy exists in same order", Toast.LENGTH_SHORT).show();
                                }
                            }
                            if (b == 0) {
                                Toast.makeText(getActivity(), "Quantity Should not be 0", Toast.LENGTH_SHORT).show();
                            }

                        }
                        else {
                            Toast.makeText(getActivity(), "Item alredy exists in same order", Toast.LENGTH_SHORT).show();
                        }




                        populateList(adapterM,0);


                    }
                });


                modifier.setView(lay);
                modifier.setCancelable(true);
                modifier.show();
*/
                put(b7);


            }

        });

        b8.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
             /*   Cursor c1=temp.rawQuery("SELECT * FROM store ORDER BY id ASC", null);
                Cursor c2=temp.rawQuery("SELECT * FROM storee ORDER BY id ASC", null);
                Cursor c3=temp.rawQuery("SELECT * FROM store2 ORDER BY id ASC", null);

                if(c1.getCount()==0&&c2.getCount()==0&&c3.getCount()==0)
                {
                    sno=1;
                }
                AlertDialog.Builder modifier = new AlertDialog.Builder(getContext());
                modifier.setTitle("Quantity");
                View lay = LayoutInflater.from(getContext()).inflate(R.layout.quantity_modify, null, false);
                final EditText et1 = lay.findViewById(R.id.modField1);
                modifier.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        String newId = et1.getText().toString().trim();
                        if (newId.length() <= 0) {
                            Toast.makeText(getContext(), "Empty fields not allowed!", Toast.LENGTH_SHORT).show();
                            return;
                        }

                        int price1;
                        String price,d;


                        String n= String.valueOf(b8.getText());

                        price =  n.substring(n.indexOf("[")+1, n.indexOf("]"));
                        price1 = Integer.parseInt(price);
                        d =  n.substring(0, n.indexOf("[")-1);
                        d = d.trim();

                        b = (int) Integer.parseInt(String.valueOf(et1.getText()));
                        int c=b*price1;


                        Cursor ty=temp.rawQuery("SELECT * FROM store1 WHERE name=\"" + d + "\"", null);
                        if (!ty.moveToFirst()) return;


                        String hg=ty.getString(2);
                        int qq= Integer.parseInt(hg);

                        String ba=ty.getString(3);
                        int ru=Integer.parseInt(ba);

                        int oo=qq+b;
                        int df=ru+c;




                        Cursor cd=temp.rawQuery("SELECT * FROM store WHERE id=" + sno + " and name=\"" + d+"\"", null);
                        if(cd.getCount()==0) {

                            temp.execSQL("UPDATE store1 SET stock=" + oo + " WHERE name=\"" + d + "\"");
                            temp.execSQL("UPDATE store1 SET price=" + df + " WHERE name=\"" + d + "\"");
                            if (b != 0) {
                                try {
                                    temp.execSQL("INSERT INTO storee VALUES('" + sno + "','" + d +
                                            "','" + b + "','" + c + "');");
                                } catch (Exception e) {
                                    Toast.makeText(getActivity(), "Item alredy exists in same order", Toast.LENGTH_SHORT).show();
                                }
                            }
                            if (b == 0) {
                                Toast.makeText(getActivity(), "Quantity Should not be 0", Toast.LENGTH_SHORT).show();
                            }
                        }

                        else {
                            Toast.makeText(getActivity(), "Item alredy exists in same order", Toast.LENGTH_SHORT).show();
                        }




                        populateList(adapterM,0);


                    }
                });


                modifier.setView(lay);
                modifier.setCancelable(true);
                modifier.show();
*/
                put(b8);


            }

        });

        b9.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
            /*    Cursor c1=temp.rawQuery("SELECT * FROM store ORDER BY id ASC", null);
                Cursor c2=temp.rawQuery("SELECT * FROM storee ORDER BY id ASC", null);
                Cursor c3=temp.rawQuery("SELECT * FROM store2 ORDER BY id ASC", null);

                if(c1.getCount()==0&&c2.getCount()==0&&c3.getCount()==0)
                {
                    sno=1;
                }

                AlertDialog.Builder modifier = new AlertDialog.Builder(getContext());
                modifier.setTitle("Quantity");
                View lay = LayoutInflater.from(getContext()).inflate(R.layout.quantity_modify, null, false);
                final EditText et1 = lay.findViewById(R.id.modField1);
                modifier.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        String newId = et1.getText().toString().trim();
                        if (newId.length() <= 0) {
                            Toast.makeText(getContext(), "Empty fields not allowed!", Toast.LENGTH_SHORT).show();
                            return;
                        }

                        int price1;
                        String price,d;


                        String n= String.valueOf(b9.getText());

                        price =  n.substring(n.indexOf("[")+1, n.indexOf("]"));
                        price1 = Integer.parseInt(price);
                        d =  n.substring(0, n.indexOf("[")-1);
                        d = d.trim();

                        b = (int) Integer.parseInt(String.valueOf(et1.getText()));
                        int c=b*price1;


                        Cursor ty=temp.rawQuery("SELECT * FROM store1 WHERE name=\"" + d + "\"", null);
                        if (!ty.moveToFirst()) return;


                        String hg=ty.getString(2);
                        int qq= Integer.parseInt(hg);

                        String ba=ty.getString(3);
                        int ru=Integer.parseInt(ba);

                        int oo=qq+b;
                        int df=ru+c;



                        Cursor cd=temp.rawQuery("SELECT * FROM store WHERE id=" + sno + " and name=\"" + d+"\"", null);
                        if(cd.getCount()==0) {
                            temp.execSQL("UPDATE store1 SET stock=" + oo + " WHERE name=\"" + d + "\"");
                            temp.execSQL("UPDATE store1 SET price=" + df + " WHERE name=\"" + d + "\"");
                            if (b != 0) {
                                try {
                                    temp.execSQL("INSERT INTO storee VALUES('" + sno + "','" + d +
                                            "','" + b + "','" + c + "');");
                                } catch (Exception e) {
                                    Toast.makeText(getActivity(), "Item alredy exists in same order", Toast.LENGTH_SHORT).show();
                                }
                            }
                            if (b == 0) {
                                Toast.makeText(getActivity(), "Quantity Should not be 0", Toast.LENGTH_SHORT).show();
                            }
                        }
                        else {
                            Toast.makeText(getActivity(), "Item alredy exists in same order", Toast.LENGTH_SHORT).show();
                        }





                        populateList(adapterM,0);


                    }
                });


                modifier.setView(lay);
                modifier.setCancelable(true);
                modifier.show();
*/
                put(b9);


            }

        });

        b10.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
           /*     Cursor c1=temp.rawQuery("SELECT * FROM store ORDER BY id ASC", null);
                Cursor c2=temp.rawQuery("SELECT * FROM storee ORDER BY id ASC", null);
                Cursor c3=temp.rawQuery("SELECT * FROM store2 ORDER BY id ASC", null);

                if(c1.getCount()==0&&c2.getCount()==0&&c3.getCount()==0)
                {
                    sno=1;
                }
                AlertDialog.Builder modifier = new AlertDialog.Builder(getContext());
                modifier.setTitle("Quantity");
                View lay = LayoutInflater.from(getContext()).inflate(R.layout.quantity_modify, null, false);
                final EditText et1 = lay.findViewById(R.id.modField1);
                modifier.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        String newId = et1.getText().toString().trim();
                        if (newId.length() <= 0) {
                            Toast.makeText(getContext(), "Empty fields not allowed!", Toast.LENGTH_SHORT).show();
                            return;
                        }

                        int price1;
                        String price,d;


                        String n= String.valueOf(b10.getText());

                        price =  n.substring(n.indexOf("[")+1, n.indexOf("]"));
                        price1 = Integer.parseInt(price);
                        d =  n.substring(0, n.indexOf("[")-1);
                        d = d.trim();

                        b = (int) Integer.parseInt(String.valueOf(et1.getText()));
                        int c=b*price1;


                        Cursor ty=temp.rawQuery("SELECT * FROM store1 WHERE name=\"" + d + "\"", null);
                        if (!ty.moveToFirst()) return;


                        String hg=ty.getString(2);
                        int qq= Integer.parseInt(hg);

                        String ba=ty.getString(3);
                        int ru=Integer.parseInt(ba);

                        int oo=qq+b;
                        int df=ru+c;



                        Cursor cd=temp.rawQuery("SELECT * FROM store WHERE id=" + sno + " and name=\"" + d+"\"", null);
                        if(cd.getCount()==0) {
                            temp.execSQL("UPDATE store1 SET stock=" + oo + " WHERE name=\"" + d + "\"");
                            temp.execSQL("UPDATE store1 SET price=" + df + " WHERE name=\"" + d + "\"");
                            if (b != 0) {
                                try {
                                    temp.execSQL("INSERT INTO storee VALUES('" + sno + "','" + d +
                                            "','" + b + "','" + c + "');");
                                } catch (Exception e) {
                                    Toast.makeText(getActivity(), "Item alredy exists in same order", Toast.LENGTH_SHORT).show();
                                }
                            }
                            if (b == 0) {
                                Toast.makeText(getActivity(), "Quantity Should not be 0", Toast.LENGTH_SHORT).show();
                            }

                        }
                        else {
                            Toast.makeText(getActivity(), "Item alredy exists in same order", Toast.LENGTH_SHORT).show();
                        }




                        populateList(adapterM,0);


                    }
                });


                modifier.setView(lay);
                modifier.setCancelable(true);
                modifier.show();
*/
                put(b10);


            }

        });
        b11.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
           /*     Cursor c1=temp.rawQuery("SELECT * FROM store ORDER BY id ASC", null);
                Cursor c2=temp.rawQuery("SELECT * FROM storee ORDER BY id ASC", null);
                Cursor c3=temp.rawQuery("SELECT * FROM store2 ORDER BY id ASC", null);

                if(c1.getCount()==0&&c2.getCount()==0&&c3.getCount()==0)
                {
                    sno=1;
                }

                AlertDialog.Builder modifier = new AlertDialog.Builder(getContext());
                modifier.setTitle("Quantity");
                View lay = LayoutInflater.from(getContext()).inflate(R.layout.quantity_modify, null, false);
                final EditText et1 = lay.findViewById(R.id.modField1);
                modifier.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        String newId = et1.getText().toString().trim();
                        if (newId.length() <= 0) {
                            Toast.makeText(getContext(), "Empty fields not allowed!", Toast.LENGTH_SHORT).show();
                            return;
                        }

                        int price1;
                        String price,d;


                        String n= String.valueOf(b11.getText());

                        price =  n.substring(n.indexOf("[")+1, n.indexOf("]"));
                        price1 = Integer.parseInt(price);
                        d =  n.substring(0, n.indexOf("[")-1);
                        d = d.trim();

                        b = (int) Integer.parseInt(String.valueOf(et1.getText()));
                        int c=b*price1;


                        Cursor ty=temp.rawQuery("SELECT * FROM store1 WHERE name=\"" + d + "\"", null);
                        if (!ty.moveToFirst()) return;


                        String hg=ty.getString(2);
                        int qq= Integer.parseInt(hg);

                        String ba=ty.getString(3);
                        int ru=Integer.parseInt(ba);

                        int oo=qq+b;
                        int df=ru+c;



                        Cursor cd=temp.rawQuery("SELECT * FROM store WHERE id=" + sno + " and name=\"" + d+"\"", null);
                        if(cd.getCount()==0) {
                            temp.execSQL("UPDATE store1 SET stock=" + oo + " WHERE name=\"" + d + "\"");
                            temp.execSQL("UPDATE store1 SET price=" + df + " WHERE name=\"" + d + "\"");
                            if (b != 0) {
                                try {
                                    temp.execSQL("INSERT INTO storee VALUES('" + sno + "','" + d +
                                            "','" + b + "','" + c + "');");
                                } catch (Exception e) {
                                    Toast.makeText(getActivity(), "Item alredy exists in same order", Toast.LENGTH_SHORT).show();
                                }
                            }
                            if (b == 0) {
                                Toast.makeText(getActivity(), "Quantity Should not be 0", Toast.LENGTH_SHORT).show();
                            }

                        }

                        else {
                            Toast.makeText(getActivity(), "Item alredy exists in same order", Toast.LENGTH_SHORT).show();
                        }



                        populateList(adapterM,0);


                    }
                });


                modifier.setView(lay);
                modifier.setCancelable(true);
                modifier.show();
*/
                put(b11);


            }

        });

        b12.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
             /*   Cursor c1=temp.rawQuery("SELECT * FROM store ORDER BY id ASC", null);
                Cursor c2=temp.rawQuery("SELECT * FROM storee ORDER BY id ASC", null);
                Cursor c3=temp.rawQuery("SELECT * FROM store2 ORDER BY id ASC", null);

                if(c1.getCount()==0&&c2.getCount()==0&&c3.getCount()==0)
                {
                    sno=1;
                }

                AlertDialog.Builder modifier = new AlertDialog.Builder(getContext());
                modifier.setTitle("Quantity");
                View lay = LayoutInflater.from(getContext()).inflate(R.layout.quantity_modify, null, false);
                final EditText et1 = lay.findViewById(R.id.modField1);
                modifier.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        String newId = et1.getText().toString().trim();
                        if (newId.length() <= 0) {
                            Toast.makeText(getContext(), "Empty fields not allowed!", Toast.LENGTH_SHORT).show();
                            return;
                        }

                        int price1;
                        String price,d;


                        String n= String.valueOf(b12.getText());

                        price =  n.substring(n.indexOf("[")+1, n.indexOf("]"));
                        price1 = Integer.parseInt(price);
                        d =  n.substring(0, n.indexOf("[")-1);
                        d = d.trim();

                        b = (int) Integer.parseInt(String.valueOf(et1.getText()));
                        int c=b*price1;


                        Cursor ty=temp.rawQuery("SELECT * FROM store1 WHERE name=\"" + d + "\"", null);
                        if (!ty.moveToFirst()) return;


                        String hg=ty.getString(2);
                        int qq= Integer.parseInt(hg);

                        String ba=ty.getString(3);
                        int ru=Integer.parseInt(ba);

                        int oo=qq+b;
                        int df=ru+c;




                        Cursor cd=temp.rawQuery("SELECT * FROM store WHERE id=" + sno + " and name=\"" + d+"\"", null);
                        if(cd.getCount()==0) {

                            temp.execSQL("UPDATE store1 SET stock=" + oo + " WHERE name=\"" + d + "\"");
                            temp.execSQL("UPDATE store1 SET price=" + df + " WHERE name=\"" + d + "\"");
                            if (b != 0) {
                                try {
                                    temp.execSQL("INSERT INTO storee VALUES('" + sno + "','" + d +
                                            "','" + b + "','" + c + "');");
                                } catch (Exception e) {
                                    Toast.makeText(getActivity(), "Item alredy exists in same order", Toast.LENGTH_SHORT).show();
                                }
                            }
                            if (b == 0) {
                                Toast.makeText(getActivity(), "Quantity Should not be 0", Toast.LENGTH_SHORT).show();
                            }
                        }
                        else
                        {
                            Toast.makeText(getActivity(), "Item alredy exists in same order", Toast.LENGTH_SHORT).show();
                        }






                        populateList(adapterM,0);


                    }
                });


                modifier.setView(lay);
                modifier.setCancelable(true);
                modifier.show();
*/
                put(b12);


            }

        });

        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b13);
            }
        });

        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b14);
            }
        });






        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b15);
            }
        });

        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b16);
            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b17);
            }
        });
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b18);
            }
        });

        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b19);
            }
        });
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b20);
            }
        });
        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b21);
            }
        });
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b22);
            }
        });
        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b23);
            }
        });
        b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b24);
            }
        });
        b25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b25);
            }
        });
        b26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b26);
            }
        });
        b27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b27);
            }
        });
        b28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b28);
            }
        });
        b29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b29);
            }
        });
        b30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b30);
            }
        });
        b31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b31);
            }
        });
        b32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b32);
            }
        });
        b33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b33);
            }
        });
        b34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b34);
            }
        });
        b35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b35);
            }
        });
        b36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b36);
            }
        });
        b37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b37);
            }
        });
        b38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b38);
            }
        });
        b39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b39);
            }
        });
        b40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b40);
            }
        });
        b41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b41);
            }
        });
        b42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b42);
            }
        });
        b43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b43);
            }
        });
        b44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b44);
            }
        });
        b45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b45);
            }
        });
        b46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b46);
            }
        });
        b47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b47);
            }
        });
        b48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b48);
            }
        });
        b49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b49);
            }
        });
        b50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b50);
            }
        });
        b51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b51);
            }
        });
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b52);
            }
        });
        b53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b53);
            }
        });
        b54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b54);
            }
        });
        b55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b55);
            }
        });
     /*   b56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b56);
            }
        });

        */
        b57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b57);
            }
        });
        b58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b58);
            }
        });
        b59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b59);
            }
        });
        b60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b60);
            }
        });


        b61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b61);
            }
        });
        b62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b62);
            }
        });
        b63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b63);
            }
        });
        b64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b64);
            }
        });
        b65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b65);
            }
        });
        b66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b66);
            }
        });
        b67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b67);
            }
        });
        b68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b68);
            }
        });
        b69.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b69);
            }
        });
        b70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b70);
            }
        });
        b71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b71);
            }
        });
        b72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b72);
            }
        });
        b73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b73);
            }
        });
        b74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b74);
            }
        });
        b75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b75);
            }
        });

        b77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b77);
            }
        });
        b78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b78);
            }
        });
        /*b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b14);
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b14);
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b14);
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b14);
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b14);
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b14);
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b14);
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b14);
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b14);
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b14);
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b14);
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b14);
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                put(b14);
            }
        });

*/

        fi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rt=0,rt1=0,sum=0;
//sno=givesrno();
                String re,re1;




                Cursor fgh = temp.rawQuery("SELECT * FROM store WHERE id=" + sno, null);





                if (fgh.getCount()==0) {

                    Cursor ij=temp.rawQuery("SELECT * FROM storee WHERE id=" + sno, null);
                    if (!ij.moveToFirst()) return;

                    re=ij.getString(3);
                    rt=Integer.parseInt(re);
                    sum=sum+rt;
                    while (ij.moveToNext()) {
                        re = ij.getString(3);
                        rt = Integer.parseInt(re);
                        sum = sum + rt;

                    }

                    Cursor ijj=temp.rawQuery("SELECT * FROM storee WHERE id=" + sno, null);
                    if (!ijj.moveToFirst()) return;

                    pdb.execSQL("INSERT INTO store2 VALUES('" + ijj.getString(0) + "','"
                            + sum + "');");
                }

                else {



                    Cursor ij = temp.rawQuery("SELECT * FROM storee WHERE id=" + sno, null);

                    if (ij.getCount()!= 0) {
                        if (!ij.moveToFirst()) return;

                        re = ij.getString(3);
                        rt = Integer.parseInt(re);
                        sum = sum + rt;
                        while (ij.moveToNext()) {
                            re = ij.getString(3);
                            rt = Integer.parseInt(re);
                            sum = sum + rt;

                        }
                        fgh.moveToFirst();
                        re1 = fgh.getString(3);
                        rt1 = Integer.parseInt(re1);
                        sum = sum + rt1;
                        try {
                            while (fgh.moveToNext()) {
                                re1 = fgh.getString(3);
                                rt1 = Integer.parseInt(re1);
                                sum = sum + rt1;
                            }

                            Cursor ijj = temp.rawQuery("SELECT * FROM storee WHERE id=" + sno, null);
                            if (!ijj.moveToFirst()) return;

                            pdb.execSQL("INSERT INTO store2 VALUES('" + ijj.getString(0) + "','"
                                    + sum + "');");
                        } catch (Exception e) {

                        }

                    }


                    else if(ij.getCount()==0) {

                        ij=null;
                        if(ij==null) {

                            fgh.moveToFirst();
                            re = fgh.getString(3);
                            rt = Integer.parseInt(re);
                            sum = sum + rt;
                            while (fgh.moveToNext()) {
                                re = fgh.getString(3);
                                rt = Integer.parseInt(re);
                                sum = sum + rt;

                            }


                            Cursor ijj = temp.rawQuery("SELECT * FROM store WHERE id=" + sno, null);
                            if (!ijj.moveToFirst()) return;

                            pdb.execSQL("INSERT INTO store2 VALUES('" + ijj.getString(0) + "','"
                                    + sum + "');");
                        }
                    }
                }



                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setCancelable(true);
                builder.setTitle("Bill");
                builder.setMessage("Order No ["+sno+"] Placed");
                sno++;

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });

                builder.show();

            }
        });



        return lay;
    }


    public void put(final Button bjk)
    {
        Cursor c1=temp.rawQuery("SELECT * FROM store ORDER BY id ASC", null);
        Cursor c2=temp.rawQuery("SELECT * FROM storee ORDER BY id ASC", null);
        Cursor c3=temp.rawQuery("SELECT * FROM store2 ORDER BY id ASC", null);

        if(c1.getCount()==0&&c2.getCount()==0&&c3.getCount()==0)
        {
            sno=1;
        }

        AlertDialog.Builder modifier = new AlertDialog.Builder(getContext());
        modifier.setTitle("Quantity");
        View lay = LayoutInflater.from(getContext()).inflate(R.layout.quantity_modify, null, false);
        final EditText et1 = lay.findViewById(R.id.modField1);
        modifier.setPositiveButton("Done", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                String newId = et1.getText().toString().trim();
                if (newId.length() <= 0) {
                    Toast.makeText(getContext(), "Empty fields not allowed!", Toast.LENGTH_SHORT).show();
                    return;
                }

                int price1;
                String price,d;


                String n= String.valueOf(bjk.getText());
                int b;
                price =  n.substring(n.indexOf("[")+1, n.indexOf("]"));
                price1 = Integer.parseInt(price);
                d =  n.substring(0, n.indexOf("[")-1);
                d = d.trim();

                b = (int) Integer.parseInt(String.valueOf(et1.getText()));
                int c=b*price1;


                Cursor ty=temp.rawQuery("SELECT * FROM store1 WHERE name=\"" + d + "\"", null);
                if (!ty.moveToFirst()) return;


                String hg=ty.getString(2);
                int qq= Integer.parseInt(hg);

                String ba=ty.getString(3);
                int ru=Integer.parseInt(ba);

                int oo=qq+b;
                int df=ru+c;




                Cursor cd=temp.rawQuery("SELECT * FROM store WHERE id=" + sno + " and name=\"" + d+"\"", null);
                if(cd.getCount()==0) {


                    if (b != 0) {
                        try {
                            temp.execSQL("INSERT INTO storee VALUES('" + sno + "','" + d +
                                    "','" + b + "','" + c + "');");

                            temp.execSQL("UPDATE store1 SET stock=" + oo + " WHERE name=\"" + d + "\"");
                            temp.execSQL("UPDATE store1 SET price=" + df + " WHERE name=\"" + d + "\"");
                        } catch (Exception e) {
                            Toast.makeText(getActivity(), "Item alredy exists in same order", Toast.LENGTH_SHORT).show();

                        }
                    }
                    if (b == 0) {
                        Toast.makeText(getActivity(), "Quantity Should not be 0", Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(getActivity(), "Item alredy exists in same order", Toast.LENGTH_SHORT).show();
                }



                populateList(adapterM,0);


            }
        });

        modifier.setView(lay);
        modifier.setCancelable(true);
        modifier.show();


    }

}

