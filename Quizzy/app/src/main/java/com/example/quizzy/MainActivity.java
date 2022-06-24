package com.example.quizzy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CardView play = findViewById(R.id.cardview1);
        TextView playT = findViewById(R.id.play);
        CardView howTo = findViewById(R.id.cardview2);
        TextView howT = findViewById(R.id.how);

        // Set a click listener on that View
        play.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                startPlay();

            }
        });
        // Set a click listener on that View
        playT.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                startPlay();

            }
        });


        // Set a click listener on that View
        howTo.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
           startHow();
            }
        });

        // Set a click listener on that View
        howT.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
           startHow();
            }
        });
    }

    public void startHow(){
        Intent howToIntent = new Intent(MainActivity.this, HowTo.class);
        // Start the new activity
        startActivity(howToIntent);

    }
    public void startPlay(){
        Intent playIntent = new Intent(MainActivity.this, PlayActivity.class);
        // Start the new activity
        startActivity(playIntent);

    }
}