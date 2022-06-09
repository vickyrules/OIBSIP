package com.example.unitconverter;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.text.TextUtilsCompat;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
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

import java.util.ArrayList;

public class converterActivity extends AppCompatActivity {
    boolean doubleBackToExitPressedOnce = false;

    LinearLayout upperLayout, bottomLayout;
    TextView unitTextUpper;
    TextView unitTextLower;
    EditText resultTextUpper;
    TextView resultTextLower;
    String unitText;
    int unitId;
    int unitIdxUpper = 0, unitIdxLower = 0;
    int textViewSelected = -1;
    float textSize;

    String title;
    ArrayList<String> metricUnitList;
    ArrayList<String> imperialUnitList;

    private static final int REQUEST_CODE = 101;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);

        String title = getIntent().getStringExtra("title");

        metricUnitList = new ArrayList<String>();
        imperialUnitList = new ArrayList<String>();

        metricUnitList.clear();
        imperialUnitList.clear();

        metricUnitList = (ArrayList<String>) getIntent().getSerializableExtra("metricUnits");
        imperialUnitList = (ArrayList<String>) getIntent().getSerializableExtra("imperialUnits");

        getSupportActionBar().setTitle(title);
        //getSupportActionBar().setSubtitle("us");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        upperLayout = (LinearLayout) findViewById(R.id.layoutTextUpper);
        bottomLayout = (LinearLayout) findViewById(R.id.layoutTextLower);
        unitTextUpper = (TextView) findViewById(R.id.unitTextViewUpper);
        unitTextLower = (TextView) findViewById(R.id.unitTextViewLower);
        resultTextUpper = (EditText) findViewById(R.id.resultTextUpper);
        resultTextLower = (TextView) findViewById(R.id.resultTextLower);



        //
        if (imperialUnitList.size() > 0) {
            unitIdxLower = metricUnitList.size();
            unitTextUpper.setText(metricUnitList.get(unitIdxUpper));
            unitTextLower.setText(imperialUnitList.get(0));
        } else {
            unitIdxLower = 1;
            unitTextUpper.setText(metricUnitList.get(unitIdxUpper));
            unitTextLower.setText(metricUnitList.get(unitIdxLower));
        }


        //change color on touch


        try {
            resultTextUpper.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View view, boolean b) {
                    resultTextUpper.setTextColor(getResources().getColor(R.color.teal_200));
                    resultTextLower.setTextColor(getResources().getColor(R.color.white));

                    resultTextUpper.addTextChangedListener(new TextWatcher() {
                        @Override
                        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                        }

                        @Override
                        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                            // auto sizing text according to the length


                            if (i > 7 && i < 11) {
                                resultTextUpper.setTextSize(25);
                            } else if (i >= 11 && i <= 14) {
                                resultTextUpper.setTextSize(18);

                            } else if (i <= 7) {
                                resultTextUpper.setTextSize(32);
                            } else {
                                resultTextUpper.setTextSize(12);
                            }

                            if (charSequence.length() == 15) {
                                Toast.makeText(getApplicationContext(), "Maximum digits (15) reached", Toast.LENGTH_SHORT).show();
                            }

                            if(i<=15) {
                                String result = resultAdapter.getResult(title, unitIdxUpper, unitIdxLower, charSequence.toString()) + "";

                                if (result.length() > 7 && result.length() < 12) {
                                    resultTextLower.setTextSize(28);
                                } else if (result.length() >= 12 && result.length() < 15) {
                                    resultTextLower.setTextSize(21);
                                } else if (result.length() >= 15 && result.length() < 20) {
                                    resultTextLower.setTextSize(15);
                                } else if (result.length() >= 20) {
                                    resultTextLower.setTextSize(13);
                                } else {
                                    resultTextLower.setTextSize(32);
                                }

                                resultTextLower.setText(result + "");
                            }

                        }

                        @Override
                        public void afterTextChanged(Editable editable) {

                        }
                    });

                }
            });
        } catch (Exception e) {

        }


//setting unit on textview

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

        Intent intentUnitSelect = new Intent(this, SelectUnitActivity.class);
        intentUnitSelect.putExtra("metricUnits", metricUnitList);
        intentUnitSelect.putExtra("imperialUnits", imperialUnitList);
        startActivityForResult(intentUnitSelect, REQUEST_CODE);
        resultTextUpper.setText("");
        resultTextLower.setText("");

    }

    //
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }
        return super.onOptionsItemSelected(item);
    }

    // getting response back
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK) {
            if (requestCode == REQUEST_CODE && data != null) {
                unitId = data.getIntExtra("metricId", 0);
                unitText = data.getStringExtra("unitText");

                if (textViewSelected == 0) {
                    unitTextUpper.setText(unitText);
                    unitIdxUpper = unitId;
                } else if (textViewSelected == 1) {
                    unitTextLower.setText(unitText);
                    unitIdxLower = unitId;
                }
            }


        }

    }

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
    }


}