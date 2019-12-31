package com.example.splashdemo;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class ThakurliPoliceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raju_bro_garage);
        ActionBar actionBar=getSupportActionBar();
        assert actionBar != null;
        actionBar.hide();


        TabLayout mTabLayout = findViewById(R.id.tabLayout);
        ViewPager mViewPager = findViewById(R.id.viewPager);

       setmViewPager(mViewPager);
        mTabLayout.setupWithViewPager(mViewPager);
    }


       private void setmViewPager(ViewPager viewPager){
        viewPagerAdapter adapter=new viewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new ThakurliPoliceFragmentAbout() ,"About");
        adapter.addFragment(new ThakurliPoliceFragmentGalllery(),"Gallery");
        adapter.addFragment(new ThakurliPoliceFragmentMap(),"Map");

        viewPager.setAdapter(adapter);


    }
class viewPagerAdapter extends FragmentPagerAdapter{
    private  final List<Fragment> mFragmentList=new ArrayList<>();
    private  final List<String> mFragmentTitleList =new ArrayList<>();
    viewPagerAdapter(FragmentManager fn){
        super(fn);
    }

    @NonNull
    @Override
    public Fragment getItem(int i) {
        return mFragmentList.get(i);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }
    void addFragment(Fragment fragment, String title){
        mFragmentList.add(fragment);
        mFragmentTitleList.add(title);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mFragmentTitleList.get(position);

    }
}
}
