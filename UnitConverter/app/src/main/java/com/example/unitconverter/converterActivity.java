package com.example.unitconverter;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.text.TextUtilsCompat;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.internal.TextWatcherAdapter;

public class converterActivity extends AppCompatActivity {

    LinearLayout upperLayout,bottomLayout;
    TextView unitTextUpper ;
    TextView unitTextLower;
    EditText resultTextUpper,resultTextLower;
    String unitText ;
    int unitId;
    int textViewSelected = -1;
    float textSize;

    private static final int REQUEST_CODE = 101;

    @RequiresApi(api = Build.VERSION_CODES.M)
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
        unitTextUpper = (TextView) findViewById(R.id.unitTextViewUpper);
        unitTextLower = (TextView) findViewById(R.id.unitTextViewLower);
        resultTextUpper = (EditText) findViewById(R.id.resultTextUpper);
        resultTextLower = (EditText) findViewById(R.id.resultTextLower);


        resultTextUpper.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                resultTextUpper.setTextColor(getResources().getColor(R.color.teal_200));
                resultTextLower.setTextColor(getResources().getColor(R.color.white));
                return false;
            }
        });

       resultTextLower.setOnTouchListener(new View.OnTouchListener() {
           @Override
           public boolean onTouch(View view, MotionEvent motionEvent) {
               resultTextLower.setTextColor(getResources().getColor(R.color.teal_200));
               resultTextUpper.setTextColor(getResources().getColor(R.color.white));

               return false;
           }
       });



        resultTextUpper.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                resultTextLower.setText(charSequence);
                if(i>7 && i<=11){
                    resultTextUpper.setTextSize(25);
                }

                else if (i>11 && i<=14){
                    resultTextUpper.setTextSize(22);
                    if(i==14){
                    Toast.makeText(getApplicationContext(), "Maximum digits (15) reached", Toast.LENGTH_SHORT).show();}
                }
                else if (i<=7){
                    resultTextUpper.setTextSize(32);
                }

                else{
                    resultTextUpper.setTextSize(15);
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });


        resultTextLower.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                //resultTextLower.setText(charSequence);
                if(i>7 && i<=11){
                    resultTextLower.setTextSize(25);
                }

                else if (i>11 && i<=14){
                    resultTextLower.setTextSize(22);
                    if(i==14){
                    Toast.makeText(getApplicationContext(), "Maximum digits (15) reached", Toast.LENGTH_SHORT).show();}
                }
                else if (i<=7){
                    resultTextLower.setTextSize(32);
                }

                else{
                    resultTextLower.setTextSize(15);
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });




        upperLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewSelected = 0;
                startUnitSelect();

            }
        });

        bottomLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewSelected = 1;
                startUnitSelect();
            }
        });




    }

    private void startUnitSelect() {
        Intent intentUnitSelect = new Intent(this,SelectUnitActivity.class);;
        intentUnitSelect.putExtra("metricUnits",getIntent().getSerializableExtra("metricUnits"));
        intentUnitSelect.putExtra("imperialUnits",getIntent().getSerializableExtra("imperialUnits"));
        startActivityForResult(intentUnitSelect,REQUEST_CODE);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode == RESULT_OK){
            if(requestCode == REQUEST_CODE && data !=null) {
                unitId = data.getIntExtra("metricId",0);
                unitText = data.getStringExtra("unitText");

                if(textViewSelected == 0){
                    unitTextUpper.setText(unitText);
                }
                else if (textViewSelected == 1){
                    unitTextLower.setText(unitText);
                }
            }


        }

    }
}