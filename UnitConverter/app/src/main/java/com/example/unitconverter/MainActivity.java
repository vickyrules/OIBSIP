package com.example.unitconverter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LinearLayout length,area,weight,volume,speed,power,pressure,temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        length = (LinearLayout) findViewById(R.id.lengthIcon);
        area = (LinearLayout) findViewById(R.id.areaIcon);
        volume = (LinearLayout) findViewById(R.id.volumeIcon);
        speed = (LinearLayout) findViewById(R.id.speedIcon);
        power = (LinearLayout) findViewById(R.id.powerIcon);
        pressure = (LinearLayout) findViewById(R.id.pressureIcon);
        temp = (LinearLayout) findViewById(R.id.temperatureIcon);
        weight = (LinearLayout) findViewById(R.id.weightIcon);

        length.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startConversion("Length conversion");
            }
        });


        area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startConversion("Area conversion");
            }
        });


        volume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startConversion("Volume conversion");
            }
        });


        weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startConversion("Weight conversion");
            }
        });


        speed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startConversion("Speed conversion");
            }
        });


        temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startConversion("Temperature conversion");
            }
        });


        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startConversion("Power conversion");
            }
        });


        pressure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startConversion("Pressure conversion");
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.settings, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.About:

                Intent intent = new Intent(getApplicationContext() , AboutActivity.class);
                startActivity(intent);
                return  true;

            case R.id.Version:
                Toast.makeText(this, "Version 1.0.0", Toast.LENGTH_SHORT).show(); return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void  startConversion(String title){
        Intent intent = new Intent(getApplicationContext(),converterActivity.class);
        intent.putExtra("title",title);
        startActivity(intent);

    }
}