package com.stopwatch;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.DecimalFormat;
import android.icu.text.NumberFormat;
import android.os.Build;
import android.os.Bundle;
import android.widget.NumberPicker;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    NumberPicker sec ;
    @RequiresApi(api = Build.VERSION_CODES.Q)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sec = (NumberPicker) findViewById(R.id.sec);
        sec.setEnabled(true);
        sec.setClickable(false);
        sec.setMinValue(00);
        sec.setMaxValue(59);
        sec.setTextSize(110);
        sec.setFormatter(new NumberPicker.Formatter() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public String format(int value) {
                NumberFormat numberFormat = new DecimalFormat("00");
                return numberFormat.format(value);
            }
        });

    }

}