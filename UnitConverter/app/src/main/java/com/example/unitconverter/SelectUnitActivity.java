package com.example.unitconverter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.content.ContextCompat;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;

public class SelectUnitActivity extends AppCompatActivity {
    RadioGroup radioGroupMetric;
    RadioGroup radioGroupImperial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_select_unit);
        getSupportActionBar().setTitle("Select Unit");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        radioGroupMetric  = (RadioGroup) findViewById(R.id.radioGpMatric);
        radioGroupImperial  = (RadioGroup) findViewById(R.id.radioGpImperial);

        ArrayList <String> metricUnitList = new ArrayList<String>();
        ArrayList <String> imperailUnitList = new ArrayList<String>();
        metricUnitList = (ArrayList<String>) getIntent().getSerializableExtra("metricUnits");
        imperailUnitList = (ArrayList<String>) getIntent().getSerializableExtra("imperialUnits");

        for(String unit : metricUnitList ) {

            RadioButton radioButton = new RadioButton(this.radioGroupImperial.getContext());
            radioButton.setText(unit);
            radioButton.setTextColor(this.getResources().getColor(R.color.white));
            radioButton.setTextDirection(2);
            radioButton.setTextSize(15);
            RadioGroup.LayoutParams childParam1 = new RadioGroup.LayoutParams(RadioGroup.LayoutParams.MATCH_PARENT, RadioGroup.LayoutParams.WRAP_CONTENT);
            radioGroupMetric.addView(radioButton, childParam1);
        }


        for(String unit : imperailUnitList ) {

            RadioButton radioButton = new RadioButton(this.radioGroupImperial.getContext());
            radioButton.setText(unit);
            radioButton.setTextColor(this.getResources().getColor(R.color.white));
            radioButton.setTextDirection(2);
            radioButton.setTextSize(15);
            RadioGroup.LayoutParams childParam1 = new RadioGroup.LayoutParams(RadioGroup.LayoutParams.MATCH_PARENT, RadioGroup.LayoutParams.WRAP_CONTENT);
            radioGroupImperial.addView(radioButton, childParam1);
        }

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

}