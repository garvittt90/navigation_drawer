package com.example.navigationdrawer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle drawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home:{
                        Toast.makeText(MainActivity.this, "Home Selected", Toast.LENGTH_SHORT).show();
                    }

                    case R.id.setting:{
                        Toast.makeText(MainActivity.this, "Settings Selected", Toast.LENGTH_SHORT).show();
                    }

                    case R.id.contact:{
                        Toast.makeText(MainActivity.this, "Contact Us Selected", Toast.LENGTH_SHORT).show();
                    }

                    case R.id.account:{
                        Toast.makeText(MainActivity.this, "Account Selected", Toast.LENGTH_SHORT).show();
                    }

                    case R.id.logout:{
                        Toast.makeText(MainActivity.this, "Logout Selected", Toast.LENGTH_SHORT).show();
                    }
                        

                }
        });
    }
}