package com.nikiaish.moonlight;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import static com.nikiaish.moonlight.MainActivity.adapterQ;
import static com.nikiaish.moonlight.MainActivity.populateList;

public class Quantity extends Fragment {

ListView viewList;
    public Quantity()
    {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View lay = inflater.inflate(R.layout.frag_quantity,container,false);

        viewList = lay.findViewById(R.id.list1);
        viewList.setAdapter(adapterQ);
        populateList(adapterQ,2);
        return lay;
    }
}
