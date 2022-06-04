package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class converterActivity extends AppCompatActivity {

    LinearLayout upperLayout,bottomLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);

        String title  = getIntent().getStringExtra("title");
        getSupportActionBar().setTitle(title);
        //getSupportActionBar().setSubtitle("us");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        upperLayout = (LinearLayout) findViewById(R.id.layoutTextUpper);
        bottomLayout = (LinearLayout) findViewById(R.id.layoutTextLower);

        upperLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startUnitSelect();
            }
        });

        bottomLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startUnitSelect();
            }
        });




    }

    private void startUnitSelect() {
        Intent intentUnitSelect = new Intent(getApplicationContext(),SelectUnitActivity.class);;
        intentUnitSelect.putExtra("metricUnits",getIntent().getSerializableExtra("metricUnits"));
        intentUnitSelect.putExtra("imperialUnits",getIntent().getSerializableExtra("imperialUnits"));
        startActivity(intentUnitSelect);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }

        return super.onOptionsItemSelected(item);
    }
}