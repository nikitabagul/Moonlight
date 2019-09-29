package com.nikiaish.moonlight;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import static com.nikiaish.moonlight.MainActivity.adapterP;
import static com.nikiaish.moonlight.MainActivity.populateList;

public class Pay extends Fragment {

    ListView viewList;
    public Pay()
    {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View lay = inflater.inflate(R.layout.frag_pay,container,false);

        viewList = lay.findViewById(R.id.list7);
        viewList.setAdapter(adapterP);
        populateList(adapterP,3);
        return lay;
    }
}
