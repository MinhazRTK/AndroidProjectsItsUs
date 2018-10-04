package com.batch2.m0nk3y.itsus;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;
import android.app.Fragment;

public class MainActivity extends AppCompatActivity {

    FragmentTransaction ft;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Search fragSearch = new Search();
                    ft = getFragmentManager().beginTransaction();
                    ft.replace(R.id.frame,fragSearch);
                    ft.commit();

                    //mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    BookmarkFragment fragBookmark = new BookmarkFragment();
                    ft = getFragmentManager().beginTransaction();
                    ft.replace(R.id.frame,fragBookmark);
                    ft.commit();

                    return true;
                case R.id.navigation_notifications:
                    //mTextMessage.setText(R.string.title_notifications);
                    AboutFragment fragAbout = new AboutFragment();
                    ft = getFragmentManager().beginTransaction();
                    ft.replace(R.id.frame,fragAbout);
                    ft.commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


        Search fragSearch = new Search();
        ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.frame,fragSearch);
        ft.commit();

        navigation.getMenu().getItem(0).setChecked(true);
    }

}
