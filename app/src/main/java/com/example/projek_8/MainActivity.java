package com.example.projek_8;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    private ViewPager2 viewPager;
    private TabLayout tabLayout;
    private PagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Setup Toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Setup ViewPager & TabLayout
        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);

        adapter = new PagerAdapter(this);
        viewPager.setAdapter(adapter);

        // Hubungkan TabLayout dengan ViewPager
        new TabLayoutMediator(tabLayout, viewPager,
                (tab, position) -> {
                    switch (position) {
                        case 0:
                            tab.setText("Mobile Legends");
                            break;
                        case 1:
                            tab.setText("PUBG");
                            break;
                        case 2:
                            tab.setText("Valorant");
                            break;
                    }
                }).attach();
    }

    // Inflate menu (Search + titik tiga)
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    // Klik item menu
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.actionmenu1) {
            viewPager.setCurrentItem(0);
            return true;

        } else if (id == R.id.actionmenu2) {
            viewPager.setCurrentItem(1);
            return true;

        } else if (id == R.id.actionmenu3) {
            viewPager.setCurrentItem(2);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}