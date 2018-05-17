package com.example.huyle.lab6;

import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity implements MainCourse.OnFragmentInteractionListener, Favourites.OnFragmentInteractionListener, Desserts.OnFragmentInteractionListener, Beverages.OnFragmentInteractionListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tablayout = (TabLayout)findViewById(R.id.tablayout);
        tablayout.addTab(tablayout.newTab().setText("Main Course"));
        tablayout.addTab(tablayout.newTab().setText("Favourite"));
        tablayout.addTab(tablayout.newTab().setText("Desserts"));
        tablayout.addTab(tablayout.newTab().setText("Beverage"));
        tablayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = (ViewPager)findViewById(R.id.pager);
        final PageAdapter adapter = new PageAdapter(getSupportFragmentManager(), tablayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tablayout));

        tablayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
