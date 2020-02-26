package com.example.splashdemo;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.splashdemo.Trafficrules.TrafficrulesActivity;


/**
 * A simple {@link Fragment} subclass.
 */
@SuppressLint("Registered")
public class Dashboard_fragment extends Fragment implements View.OnClickListener {


    public Dashboard_fragment() {
        // Required empty public constructor
    }


    //@Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_dashboard_fragment, container, false);
        View view=inflater.inflate(R.layout.fragment_dashboard_fragment,container,false);
        CardView mechanicCard = view.findViewById(R.id.mechnanic);
        CardView garageCard = view.findViewById(R.id.garage);
        CardView policeCard = view.findViewById(R.id.police);
        CardView hospitalCard = view.findViewById(R.id.hospitall);
        CardView hotelCard = view.findViewById(R.id.hotell);
        CardView gasstationCard = view.findViewById(R.id.gasstation);
        CardView sparepartcard = view.findViewById(R.id.sparepart);
        CardView buyrentcard = view.findViewById(R.id.buyrent);
        CardView paymentcard = view.findViewById(R.id.pay);
        CardView trafficcard = view.findViewById(R.id.trafficrules);
        CardView tipscard = view.findViewById(R.id.tips);
        mechanicCard.setOnClickListener(this);
        garageCard.setOnClickListener(this);
        gasstationCard.setOnClickListener(this);
        policeCard.setOnClickListener(this);
        hospitalCard.setOnClickListener(this);
        hotelCard.setOnClickListener(this);
        sparepartcard.setOnClickListener(this);
        buyrentcard.setOnClickListener(this);
        paymentcard.setOnClickListener(this);
        trafficcard.setOnClickListener(this);
        tipscard.setOnClickListener(this);
        return view;
    }


    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.mechnanic:
                i = new Intent(getActivity(), Mechanic.class);
                startActivity(i);
                break;
            case R.id.garage:
                i = new Intent(getActivity(), Garage.class);
                startActivity(i);
                break;
            case R.id.gasstation:
                i = new Intent(getActivity(), Gasstation.class);
                startActivity(i);
                break;
            case R.id.police:
                i = new Intent(getActivity(), Police.class);
                startActivity(i);
                break;
            case R.id.hospitall:
                i = new Intent(getActivity(), Hospital.class);
                startActivity(i);
                break;
            case R.id.hotell:
                i = new Intent(getActivity(), Hotel.class);
                startActivity(i);
                break;
            case R.id.sparepart:
                i = new Intent(getActivity(), Sparepart.class);
                startActivity(i);
                break;
            case R.id.buyrent:
                i = new Intent(getActivity(), BuyRent.class);
                startActivity(i);
                break;
            case R.id.pay:
                i = new Intent(getActivity(), Payment.class);
                startActivity(i);
                break;
            case R.id.trafficrules:
                i = new Intent(getActivity(), TrafficrulesActivity.class);
                startActivity(i);
                break;
            case R.id.tips:
                i = new Intent(getActivity(), TipsActivity.class);
                startActivity(i);
                break;


            default:
                break;

        }
    }
}
