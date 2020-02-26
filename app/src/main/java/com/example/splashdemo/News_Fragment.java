package com.example.splashdemo;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.splashdemo.News.HealthlineActivity;
import com.example.splashdemo.News.HindustanTimesActivity;
import com.example.splashdemo.News.LokmatActivity;
import com.example.splashdemo.News.MiddayActivity;
import com.example.splashdemo.News.NHSActivity;
import com.example.splashdemo.News.NdtvActivity;
import com.example.splashdemo.News.RaftaarActivity;
import com.example.splashdemo.News.TimesIndiaActivity;
import com.example.splashdemo.Trafficrules.TrafficrulesActivity;


/**
 * A simple {@link Fragment} subclass.
 */
public class News_Fragment extends Fragment {


    public News_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.news_fragment, container, false);
        View view=inflater.inflate(R.layout.news_fragment,container,false);
        ImageButton  hindustan = view.findViewById(R.id.hindustatimes);
        ImageButton midday = view.findViewById(R.id.midday);
        ImageButton times = view.findViewById(R.id.times);
        ImageButton raftar = view.findViewById(R.id.raftar);
        ImageButton lokmat = view.findViewById(R.id.lokmats);
        ImageButton ndtv = view.findViewById(R.id.ndtvs);
        ImageButton nhp = view.findViewById(R.id.nhps);
        ImageButton healthline = view.findViewById(R.id.healthlines);
        hindustan.setOnClickListener(this::onClick);
        midday.setOnClickListener(this::onClick);
        times.setOnClickListener(this::onClick);
        raftar.setOnClickListener(this::onClick);
        lokmat.setOnClickListener(this::onClick);
        ndtv.setOnClickListener(this::onClick);
        nhp.setOnClickListener(this::onClick);
        healthline.setOnClickListener(this::onClick);
        return view;




    }
    //@Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.hindustatimes:
                i = new Intent(getActivity(), HindustanTimesActivity.class);
                startActivity(i);
                break;
            case R.id.midday:
                i = new Intent(getActivity(), MiddayActivity.class);
                startActivity(i);
                break;
            case R.id.times:
                i = new Intent(getActivity(), TimesIndiaActivity.class);
                startActivity(i);
                break;
            case R.id.raftar:
                i = new Intent(getActivity(), RaftaarActivity.class);
                startActivity(i);
                break;
            case R.id.lokmats:
                i = new Intent(getActivity(), LokmatActivity.class);
                startActivity(i);
                break;
            case R.id.ndtvs:
                i = new Intent(getActivity(), NdtvActivity.class);
                startActivity(i);
                break;
            case R.id.nhps:
                i = new Intent(getActivity(), NHSActivity.class);
                startActivity(i);
                break;
            case R.id.healthlines:
                i = new Intent(getActivity(), HealthlineActivity.class);
                startActivity(i);
                break;


            default:
                break;

        }
    }

}
