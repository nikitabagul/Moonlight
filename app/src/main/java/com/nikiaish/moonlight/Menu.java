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
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13;
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
        b13=lay.findViewById(R.id.fi2);

        b1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {

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



            }

        });


        b2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
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



            }

        });


        b3.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
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



            }

        });


        b4.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {

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



            }

        });

        b5.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
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



            }

        });

        b6.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
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



            }

        });

        b7.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {

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



            }

        });

        b8.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
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



            }

        });

        b9.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
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



            }

        });

        b10.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
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



            }

        });
        b11.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
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



            }

        });

        b12.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
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



            }

        });
   b13.setOnClickListener(new View.OnClickListener() {
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
     builder.setMessage("TOTAL BILL FOR ORDER NO [ "+sno+" ] is : "+sum);
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
}

    /*@Override
    public void onClick(View view) {

        if(view==b1)
        {
            /*AlertDialog.Builder modifier = new AlertDialog.Builder(getContext());
            modifier.setTitle("Change Quantity");
            View lay = LayoutInflater.from(getContext()).inflate(R.layout.quantity_modify, null, false);
            final EditText et1 = lay.findViewById(R.id.modField1);

                String n= String.valueOf(b1.getText());
                int et21;
                price =  n.substring(n.indexOf("[")+1, n.indexOf("]"));
                price1 = Integer.parseInt(price);
                name =  n.substring(0, n.indexOf("[")-1);
                name = name.trim();
                int a=0;
                et21 = (int) Integer.parseInt(String.valueOf(et1.getText()));

                temp.execSQL("INSERT INTO storee VALUES('" + 1 + "','" + "nikita" +
                        "','" + 0 + "','"+ 23+"' );");

                //populateList(adapterM, false);

        }

        if (view == b2) {
            Cursor c = db.rawQuery("SELECT * FROM storee", null);
            if (c.getCount() == 0) {
                showMessage("Error", "No records found");
                return;
            }
            StringBuffer buffer = new StringBuffer();
            while (c.moveToNext()) {
                buffer.append("idno: " + c.getString(0) + "\n");
                buffer.append("Name: " + c.getString(1) + "\n");
                buffer.append("quantity: " + c.getString(2) + "\n");
                buffer.append("price: " + c.getString(3) + "\n\n");

            }
            showMessage("Item Details", buffer.toString());
        }

    }*/

