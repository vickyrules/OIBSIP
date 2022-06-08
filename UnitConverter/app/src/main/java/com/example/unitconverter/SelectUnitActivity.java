package com.example.unitconverter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.content.ContextCompat;

import android.app.Activity;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Handler;
import android.preference.Preference;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class SelectUnitActivity extends AppCompatActivity {
    static RadioGroup radioGroupMetric;
    static RadioGroup radioGroupImperial;
    TextView imperialTxt, metricTxt;
    View endline;


    static ArrayList<String> metricUnitList = new ArrayList<String>();
    static ArrayList<String> imperailUnitList = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_select_unit);
        getSupportActionBar().setTitle("Select Unit");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        radioGroupMetric = (RadioGroup) findViewById(R.id.radioGpMatric);
        radioGroupImperial = (RadioGroup) findViewById(R.id.radioGpImperial);
        imperialTxt = (TextView) findViewById(R.id.imperialTxt);
        metricTxt = (TextView) findViewById(R.id.metricTxt);
        endline = (View) findViewById(R.id.endViewLine);

        metricUnitList.clear();
        imperailUnitList.clear();
        metricUnitList = (ArrayList<String>) getIntent().getSerializableExtra("metricUnits");
        imperailUnitList = (ArrayList<String>) getIntent().getSerializableExtra("imperialUnits");


        if (imperailUnitList.size() == 0) {
            imperialTxt.setVisibility(View.GONE);
            metricTxt.setVisibility(View.GONE);
            endline.setVisibility(View.GONE);
        }

        // for (String unit : metricUnitList)
        for (int i = 0; i < metricUnitList.size(); i++) {

            RadioButton radioButton = new RadioButton(this.radioGroupImperial.getContext());
            radioButton.setText(metricUnitList.get(i));
            radioButton.setTextColor(this.getResources().getColor(R.color.white));
            radioButton.setTextDirection(2);
            radioButton.setTextSize(16);
            radioButton.setPadding(0, 10, 0, 10);
            RadioGroup.LayoutParams childParam1 = new RadioGroup.LayoutParams(RadioGroup.LayoutParams.MATCH_PARENT, RadioGroup.LayoutParams.WRAP_CONTENT);
            childParam1.setMargins(0, 20, 0, 20);

            radioGroupMetric.addView(radioButton, childParam1);


        }


        for (int i = 0; i < imperailUnitList.size(); i++) {

            RadioButton radioButton = new RadioButton(this.radioGroupImperial.getContext());
            radioButton.setText(imperailUnitList.get(i));
            radioButton.setTextColor(this.getResources().getColor(R.color.white));
            radioButton.setTextDirection(2);
            radioButton.setTextSize(16);
            radioButton.setPadding(0, 10, 0, 10);
            RadioGroup.LayoutParams childParam1 = new RadioGroup.LayoutParams(RadioGroup.LayoutParams.MATCH_PARENT, RadioGroup.LayoutParams.WRAP_CONTENT);
            childParam1.setMargins(0, 20, 0, 20);

            radioGroupImperial.addView(radioButton, childParam1);

        }


        radioGroupImperial.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent();
                        int radioButtonID = radioGroupImperial.getCheckedRadioButtonId();
                        View radioButton = radioGroupImperial.findViewById(radioButtonID);
                        int idx = radioGroupImperial.indexOfChild(radioButton);
                        intent.putExtra("metricId",idx+metricUnitList.size());
                        intent.putExtra("unitText",imperailUnitList.get(idx));
                        setResult(Activity.RESULT_OK, intent);
                        finish();
                    }
                }, 1000);
            }
        });

        radioGroupMetric.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        //returning check radio buttons id
                        Intent intent = new Intent();
                        int radioButtonID = radioGroupMetric.getCheckedRadioButtonId();
                        View radioButton = radioGroupMetric.findViewById(radioButtonID);
                        int idx = radioGroupMetric.indexOfChild(radioButton);
                        intent.putExtra("metricId",idx);
                        intent.putExtra("unitText",metricUnitList.get(idx));
                        setResult(Activity.RESULT_OK, intent);
                        finish();
                    }
                }, 1000);
            }


        });




    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

}