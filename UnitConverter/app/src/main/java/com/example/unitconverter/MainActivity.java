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

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    LinearLayout length,area,weight,volume,speed,power,pressure,temp;
    ArrayList <String> unitsListMetric;
    ArrayList <String> unitsListImperial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);

        length = (LinearLayout) findViewById(R.id.lengthIcon);
        area = (LinearLayout) findViewById(R.id.areaIcon);
        volume = (LinearLayout) findViewById(R.id.volumeIcon);
        speed = (LinearLayout) findViewById(R.id.speedIcon);
        power = (LinearLayout) findViewById(R.id.powerIcon);
        pressure = (LinearLayout) findViewById(R.id.pressureIcon);
        temp = (LinearLayout) findViewById(R.id.temperatureIcon);
        weight = (LinearLayout) findViewById(R.id.weightIcon);

        unitsListMetric = new ArrayList<String>();
        unitsListImperial = new ArrayList<String>();

        length.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                unitsListMetric.clear();
                unitsListImperial.clear();

                unitsListMetric.add("Kilometer (km) ");
                unitsListMetric.add("Meter (m) ");
                unitsListMetric.add("Centimeter (cm) ");
                unitsListMetric.add("Millimeter (mm) ");

                unitsListImperial.add("Inch (in) ");
                unitsListImperial.add("Mile (mi) ");
                unitsListImperial.add("Foot (ft) ");
                unitsListImperial.add("Yard (yd) ");
                startConversion("Length conversion");
            }
        });


        area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                unitsListMetric.clear();
                unitsListImperial.clear();

                unitsListMetric.add("Square kilometer (Km\u00b2) ");
                unitsListMetric.add("Square meter (m\u00b2) ");
                unitsListMetric.add("Square centimeter (cm\u00b2) ");
                unitsListMetric.add("Square millimeter (mm\u00b2) ");

                unitsListImperial.add("Square inch (in\u00b2) ");
                unitsListImperial.add("Square mile (mi\u00b2) ");
                unitsListImperial.add("Square foot (ft\u00b2) ");
                unitsListImperial.add("Square Yard (yd\u00b2) ");
                startConversion("Area conversion");
            }
        });


        volume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                unitsListMetric.clear();
                unitsListImperial.clear();

                unitsListMetric.add("Liter (l) ");
                unitsListMetric.add("milli_liter (ml) ");
                unitsListMetric.add("Cubic meter (m\u00b3) ");
                unitsListMetric.add("Cubic centimeter (cm\u00b3) ");
                unitsListMetric.add("Cubic millimeter (mm\u00b3) ");

                unitsListImperial.add("Cubic inch (in\u00b3) ");
                unitsListImperial.add("Cubic Yard (yd\u00b3) ");
                unitsListImperial.add("Cubic foot (ft\u00b3) ");
                unitsListImperial.add("UK gallon (UK gal) ");
                unitsListImperial.add("US gallon (US gal) ");


                startConversion("Volume conversion");
            }
        });


        weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                unitsListMetric.clear();
                unitsListImperial.clear();

                unitsListMetric.add("Kilogram (kg) ");
                unitsListMetric.add("Gram (g) ");
                unitsListMetric.add("Milligram (mg) ");
                unitsListMetric.add("Ton (t) ");

                unitsListImperial.add("Pound (lb) ");
                unitsListImperial.add("Ounce (oz) ");
                unitsListImperial.add("Grain (gr) ");


                startConversion("Weight conversion");
            }
        });


        speed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                unitsListMetric.clear();
                unitsListImperial.clear();

                unitsListMetric.add("Kilometer/second (km/s) ");
                unitsListMetric.add("Meter/second (m/s) ");
                unitsListMetric.add("Kilometer/hour (km/h) ");
                unitsListMetric.add("Speed of light (c) ");
                unitsListMetric.add("Mile/hour (mph) ");

                startConversion("Speed conversion");
            }
        });


        temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                unitsListMetric.clear();
                unitsListImperial.clear();

                unitsListMetric.add("Degree Celsius (°C) ");
                unitsListMetric.add("Degree Fahrenheit (°F) ");
                unitsListMetric.add("Degree Reaumur(°Re) ");
                unitsListMetric.add("Kelvin (K) ");


                startConversion("Temperature conversion");
            }
        });


        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                unitsListMetric.clear();
                unitsListImperial.clear();

                unitsListMetric.add("Kilowatt (kW) ");
                unitsListMetric.add("Watt (W) ");
                unitsListMetric.add("Joule/second(J/s) ");
                unitsListMetric.add("Horsepower (hp) ");
                unitsListMetric.add("Kilocalorie/second (kcal/s) ");
                unitsListMetric.add("Newton-meter/second (N-m/s) ");


                startConversion("Power conversion");
            }
        });


        pressure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                unitsListMetric.clear();
                unitsListImperial.clear();

                unitsListMetric.add("Standard Atmosphere (atm) ");
                unitsListMetric.add("Hectopascal (hPa) ");
                unitsListMetric.add("Megapascal (MPa) ");
                unitsListMetric.add("Pounds/square foot (psf) ");
                unitsListMetric.add("Pounds/square inch (psi) ");
                unitsListMetric.add("Millimeter of mercury (mmHg) ");
                unitsListMetric.add("Imch of mercury (inHg) ");

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
        intent.putExtra("metricUnits",unitsListMetric);
        intent.putExtra("imperialUnits",unitsListImperial);

        startActivity(intent);

    }
}