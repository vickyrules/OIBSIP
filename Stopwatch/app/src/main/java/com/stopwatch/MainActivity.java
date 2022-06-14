package com.stopwatch;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.stopwatch.placeholder.PlaceholderContent;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    NumberPicker hrs, min, sec, millisec;
    MaterialButton start, pause, resume, reset, lap;
    LinearLayout reset_resume_lay, lap_pause_lay;
    FrameLayout lapFrame;
    // on the stopwatch
    // Creates a new Handler
    int valhrsLst = 0;
    int valminLst = 0;
    int valsecLst = 0;
    int valmillisecLSt = 0;
    private int seconds = 0;
    // Is the stopwatch running?
    private boolean running;
    private boolean stopped;
    private boolean wasRunning;

    @RequiresApi(api = Build.VERSION_CODES.Q)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PlaceholderContent.ITEMS.clear();

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);


        hrs = (NumberPicker) findViewById(R.id.hrs);
        min = (NumberPicker) findViewById(R.id.min);
        sec = (NumberPicker) findViewById(R.id.sec);
        millisec = (NumberPicker) findViewById(R.id.millisec);

        start = (MaterialButton) findViewById(R.id.start);
        lap = (MaterialButton) findViewById(R.id.lap);
        pause = (MaterialButton) findViewById(R.id.pause);
        reset = (MaterialButton) findViewById(R.id.reset);
        resume = (MaterialButton) findViewById(R.id.resume);
        reset_resume_lay = (LinearLayout) findViewById(R.id.reset_resume_layout);
        lap_pause_lay = (LinearLayout) findViewById(R.id.lap_pause_layout);
        lapFrame = (FrameLayout) findViewById(R.id.lapframe);


        if (savedInstanceState != null) {

            // Get the previous state of the stopwatch
            // if the activity has been
            // destroyed and recreated.
            seconds
                    = savedInstanceState
                    .getInt("seconds");
            running
                    = savedInstanceState
                    .getBoolean("running");
            wasRunning
                    = savedInstanceState
                    .getBoolean("wasRunning");

            stopped
                    = savedInstanceState
                    .getBoolean("stopped");
        }


        setPickerStyle(hrs);
        setPickerStyle(sec);
        setPickerStyle(min);
        setPickerStyle(millisec);
        millisec.setTextSize(65);
        millisec.setMaxValue(99);
        hrs.setMaxValue(23);


        start.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                int action = event.getAction();
                if (action == MotionEvent.ACTION_DOWN) {
                    v.animate().scaleXBy(-0.08f).setDuration(150).start();
                    v.animate().scaleYBy(-0.08f).setDuration(150).start();
                    return true;

                } else if (action == MotionEvent.ACTION_UP) {
                    v.animate().cancel();
                    v.animate().scaleX(1f).setDuration(200).start();
                    v.animate().scaleY(1f).setDuration(200).start();
                    start.setVisibility(View.GONE);
                    lap_pause_lay.setVisibility(View.VISIBLE);
                    running = true;
                    stopped = false;
                    runTimer();
                    return true;
                }
                return false;
            }
        });

        pause.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                int action = event.getAction();
                if (action == MotionEvent.ACTION_DOWN) {
                    v.animate().scaleXBy(-0.08f).setDuration(150).start();
                    v.animate().scaleYBy(-0.08f).setDuration(150).start();
                    return true;

                } else if (action == MotionEvent.ACTION_UP) {
                    v.animate().cancel();
                    v.animate().scaleX(1f).setDuration(200).start();
                    v.animate().scaleY(1f).setDuration(200).start();

                    lap_pause_lay.setVisibility(View.GONE);
                    reset_resume_lay.setVisibility(View.VISIBLE);
                    onPause();
                    return true;
                }
                return false;
            }
        });

        resume.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                int action = event.getAction();
                if (action == MotionEvent.ACTION_DOWN) {
                    v.animate().scaleXBy(-0.08f).setDuration(150).start();
                    v.animate().scaleYBy(-0.08f).setDuration(150).start();
                    return true;

                } else if (action == MotionEvent.ACTION_UP) {
                    v.animate().cancel();
                    v.animate().scaleX(1f).setDuration(200).start();
                    v.animate().scaleY(1f).setDuration(200).start();

                    lap_pause_lay.setVisibility(View.VISIBLE);
                    reset_resume_lay.setVisibility(View.GONE);
                    onResume();
                    return true;
                }
                return false;
            }
        });

        reset.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                int action = event.getAction();
                if (action == MotionEvent.ACTION_DOWN) {
                    v.animate().scaleXBy(-0.08f).setDuration(150).start();
                    v.animate().scaleYBy(-0.08f).setDuration(150).start();
                    return true;

                } else if (action == MotionEvent.ACTION_UP) {
                    v.animate().cancel();
                    v.animate().scaleX(1f).setDuration(200).start();
                    v.animate().scaleY(1f).setDuration(200).start();
                    reset_resume_lay.setVisibility(View.GONE);
                    start.setVisibility(View.VISIBLE);
                    running = false;
                    wasRunning = false;
                    seconds = 0;
                    sec.setValue(0);
                    hrs.setValue(0);
                    min.setValue(0);
                    millisec.setValue(0);

                    valhrsLst = 0;
                    valminLst = 0;
                    valsecLst = 0;
                    valmillisecLSt = 0;

                    PlaceholderContent.ITEMS.clear();
                    beginTransition();
                    stopped = true;
                    onStop();
                    return true;
                }
                return false;
            }
        });


        lap.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                int action = event.getAction();
                if (action == MotionEvent.ACTION_DOWN) {
                    v.animate().scaleXBy(-0.08f).setDuration(150).start();
                    v.animate().scaleYBy(-0.08f).setDuration(150).start();
                    return true;

                } else if (action == MotionEvent.ACTION_UP) {
                    v.animate().cancel();
                    v.animate().scaleX(1f).setDuration(200).start();
                    v.animate().scaleY(1f).setDuration(200).start();
                    beginTransition();
                    NumberFormat mformat = new DecimalFormat("00");


                    int valhrs = hrs.getValue();
                    int valmin = min.getValue();
                    int valsec = sec.getValue();
                    int valmillisec = millisec.getValue();

                    valhrsLst = Math.abs(valhrs - valhrsLst);
                    valminLst = Math.abs(valmin - valminLst);
                    valsecLst = Math.abs(valsec - valsecLst);
                    valmillisecLSt = Math.abs(valmillisec - valmillisecLSt);

                    String time = mformat.format(valhrs) + ":" + mformat.format(valmin)
                            + ":" + mformat.format(valsec) + "." + mformat.format(valmillisec);

                    String timeDiff = "+" + mformat.format(valhrsLst) + ":" + mformat.format(valminLst) +
                            ":" + mformat.format(valsecLst) + "." + mformat.format(valmillisecLSt);

                    PlaceholderContent.ITEMS.add(0, new PlaceholderContent.PlaceholderItem(mformat.format(PlaceholderContent.ITEMS.size()) + "", time + "", timeDiff + ""));
                    beginTransition();

                    return true;
                }
                return false;
            }
        });


    }



    @RequiresApi(api = Build.VERSION_CODES.Q)
    private void setPickerStyle(NumberPicker numberPicker) {
        try {
            numberPicker.setTextSize(170f);
            numberPicker.setMinValue(0);
            numberPicker.setMaxValue(59);
            numberPicker.setMaxValue(59);
            numberPicker.setClickable(false);
            numberPicker.setNestedScrollingEnabled(false);
            numberPicker.setEnabled(false);


            numberPicker.setFormatter(new NumberPicker.Formatter() {
                @Override
                public String format(int value) {
                    NumberFormat numberFormat = new DecimalFormat("00");
                    return numberFormat.format(value);
                }
            });

        }
        catch (Exception e){

        }

    }

    private void beginTransition() {

        FragmentTransaction Profile = getSupportFragmentManager().beginTransaction();
        Profile.replace(R.id.lapframe, new LapFragment());
        Profile.commitAllowingStateLoss();


    }

//  private void  setButtonAnimation(MaterialButton button){
//
//      button.setOnTouchListener(new View.OnTouchListener() {
//          @Override
//          public boolean onTouch(View v, MotionEvent event) {
//
//              int action = event.getAction();
//              if (action == MotionEvent.ACTION_DOWN) {
//                  v.animate().scaleXBy(-0.08f).setDuration(150).start();
//                  v.animate().scaleYBy(-0.08f).setDuration(150).start();
//                  return true;
//
//              }
//
//              else if (action == MotionEvent.ACTION_UP) {
//                  v.animate().cancel();
//                  v.animate().scaleX(1f).setDuration(200).start();
//                  v.animate().scaleY(1f).setDuration(200).start();
//                  return true;
//              }
//
//              return false;
//          }
//      });
//
//  }


    // Save the state of the stopwatch
    // if it's about to be destroyed.
    @Override
    public void onSaveInstanceState(
            Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState
                .putInt("seconds", seconds);
        savedInstanceState
                .putBoolean("running", running);
        savedInstanceState
                .putBoolean("wasRunning", wasRunning);
        savedInstanceState
                .putBoolean("stopped", stopped);
    }

    // If the activity is paused,
    // stop the stopwatch.
    @Override
    protected void onPause() {
        wasRunning = running;
        running = false;
        stopped = false;
        super.onPause();
    }



    // If the activity is resumed,
    // start the stopwatch
    // again if it was running previously.
    @Override
    protected void onResume() {
        super.onResume();
        if (wasRunning) {
            running = true;
        }
    }



    // Sets the NUmber of seconds on the timer.
    // The runTimer() method uses a Handler
    // to increment the seconds and
    // update the text view.
    private void runTimer() {


        // Call the post() method,
        // passing in a new Runnable.
        // The post() method processes
        // code without a delay,
        // so the code in the Runnable
        // will run almost immediately.
        Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override

            public void run() {
                int hours = seconds / 3600;
                int minutes = (seconds % 3600) / 60;
                int secs = seconds % 60;


                // Format the seconds into hours, minutes,
                // and seconds.


                // If running is true, increment the
                // seconds variable.
                if (running) {
                    seconds++;
                    changeValueByOne(sec, true);
                    if (seconds % 60 == 0 && seconds != 0) {
                        changeValueByOne(min, true);
                    }
                    if (seconds % 3600 == 0 && seconds != 0) {
                        changeValueByOne(hrs, true);
                    }

                }


                // Post the code again
                // with a delay of 1 second.
                if (stopped) {
                    handler.removeCallbacks(this);
                } else {
                    handler.postDelayed(this, 1000);
                }


            }
        });

        handler.post(new Runnable() {
            @Override
            public void run() {
                if (running) {
                    changeValueByOne(millisec, true);
                }
                if (stopped) {
                    handler.removeCallbacks(this);
                } else {
                    handler.postDelayed(this, 1);
                }

            }
        });


    }


    //changing numberpicker value auto
    private void changeValueByOne(final NumberPicker higherPicker, final boolean increment) {

        Method method;
        try {
            // refelction call for
            // higherPicker.changeValueByOne(true);
            method = higherPicker.getClass().getDeclaredMethod("changeValueByOne", boolean.class);
            method.setAccessible(true);
            method.invoke(higherPicker, increment);

        } catch (final NoSuchMethodException | IllegalArgumentException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
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


                if(!stopped){
                    Toast.makeText(this, "Sorry! Timer is running", Toast.LENGTH_SHORT).show();
                }
                else{
                Intent intent = new Intent(getApplicationContext(), AboutActivity.class);
                startActivity(intent);}
                return true;
            case R.id.Version:
                Toast.makeText(this, "Version 1.0.0", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


}