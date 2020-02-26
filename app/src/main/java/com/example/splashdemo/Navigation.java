package com.example.splashdemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
//import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;

// com.example.splashdemo.News.News;
// com.example.splashdemo.Trafficrules.TrafficrulesActivity;
import com.google.android.material.navigation.NavigationView;

public class
Navigation extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);

        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
        Dashboard_fragment dashboard_fragment=new Dashboard_fragment();
        FragmentManager manager=getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.homelayout,dashboard_fragment).commit();
        /*CardView mechanicCard = findViewById(R.id.mechnanic);
        CardView garageCard = findViewById(R.id.garage);
        CardView policeCard = findViewById(R.id.police);
        CardView hospitalCard = findViewById(R.id.hospitall);
        CardView hotelCard = findViewById(R.id.hotell);
        CardView gasstationCard = findViewById(R.id.gasstation);
        CardView sparepartcard = findViewById(R.id.sparepart);
        CardView buyrentcard = findViewById(R.id.buyrent);
        CardView newscard = findViewById(R.id.news);
        CardView paymentcard = findViewById(R.id.pay);
        CardView trafficcard = findViewById(R.id.trafficrules);
        CardView tipscard = findViewById(R.id.tips);
        mechanicCard.setOnClickListener(this);
        garageCard.setOnClickListener(this);
        gasstationCard.setOnClickListener(this);
        policeCard.setOnClickListener(this);
        hospitalCard.setOnClickListener(this);
        hotelCard.setOnClickListener(this);
        sparepartcard.setOnClickListener(this);
        buyrentcard.setOnClickListener(this);
        newscard.setOnClickListener(this);
        paymentcard.setOnClickListener(this);
        trafficcard.setOnClickListener(this);
        tipscard.setOnClickListener(this);*/
    }

    @Override
    public void onBackPressed() {

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        }
        else {
            super.onBackPressed();
        }

        }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.Exit_action) {
            finish();
            System.exit(0);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            Dashboard_fragment dashboard_fragment=new Dashboard_fragment();
            FragmentManager manager=getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.homelayout,dashboard_fragment).commit();
        } else if (id == R.id.trouble_shoot) {
            Troubleshoot troubleshoot=new Troubleshoot();
            FragmentManager manager=getSupportFragmentManager();
           manager.beginTransaction().replace(R.id.homelayout ,troubleshoot).commit();

        } else if (id == R.id.newser) {
            News_Fragment newsfragment=new News_Fragment();
            FragmentManager manager=getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.homelayout ,newsfragment).commit();


        } else if (id == R.id.aboutuss) {

            Aboutus_fragment aboutus_fragment=new Aboutus_fragment();
            FragmentManager manager=getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.homelayout ,aboutus_fragment).commit();



        } else if (id == R.id.nav_share)  {
            Intent shareintent=new Intent();
            shareintent.setAction(Intent.ACTION_SEND);
            shareintent.putExtra(Intent.EXTRA_TEXT,"Download our new app >> " +
                    "https://Rickshawmitra.sa.com");
            shareintent.setType("text/plain");
            startActivity(Intent.createChooser(shareintent,"share via "));

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onClick(View view) {
        /*Intent i;
        switch (view.getId()) {
            case R.id.mechnanic:
                i = new Intent(this, Mechanic.class);
                startActivity(i);
                break;
            case R.id.garage:
                i = new Intent(this, Garage.class);
                startActivity(i);
                break;
            case R.id.gasstation:
                i = new Intent(this, Gasstation.class);
                startActivity(i);
                break;
            case R.id.police:
                i = new Intent(this, Police.class);
                startActivity(i);
                break;
            case R.id.hospitall:
                i = new Intent(this, Hospital.class);
                startActivity(i);
                break;
            case R.id.hotell:
                i = new Intent(this, Hotel.class);
                startActivity(i);
                break;
            case R.id.sparepart:
                i = new Intent(this, Sparepart.class);
                startActivity(i);
                break;
            case R.id.buyrent:
                i = new Intent(this, BuyRent.class);
                startActivity(i);
                break;
            case R.id.news:
                i = new Intent(this, News.class);
                startActivity(i);
                break;
            case R.id.pay:
                i = new Intent(this, Payment.class);
                startActivity(i);
                break;
            case R.id.trafficrules:
                i = new Intent(this, TrafficrulesActivity.class);
                startActivity(i);
                break;
            case R.id.tips:
                i = new Intent(this, TipsActivity.class);
                startActivity(i);
                break;


            default:
                break;

        }*/

    }
}
