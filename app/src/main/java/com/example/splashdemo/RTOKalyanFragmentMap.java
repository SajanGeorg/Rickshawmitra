package com.example.splashdemo;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


/**
 * A simple {@link Fragment} subclass.
 */
public class RTOKalyanFragmentMap extends Fragment implements OnMapReadyCallback {
GoogleMap map;

    public RTOKalyanFragmentMap() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_rto_kalyan_map,container,false);


        return  v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //adding map activity to map fragment
        SupportMapFragment mapFragment=(SupportMapFragment)
                getChildFragmentManager().findFragmentById(R.id.map1);
        assert mapFragment != null;
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;
        LatLng pp=new LatLng(19.212987, 73.108261);
        MarkerOptions option=new MarkerOptions();
        option.position(pp).title("RTO Kalyan");
        map.addMarker(option);
        map=googleMap;
        LatLng rr=new LatLng(19.223271, 73.107963);
        MarkerOptions pika=new MarkerOptions();
        pika.position(rr).title("You are at here");
        map.addMarker(pika);


        map.moveCamera(CameraUpdateFactory.newLatLngZoom(pp,12F));


    }
}
