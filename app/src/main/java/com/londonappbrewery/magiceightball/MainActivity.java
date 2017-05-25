package com.londonappbrewery.magiceightball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button myButton = (Button) findViewById(R.id.button);
        final ImageView ballDisplay = (ImageView) findViewById(R.id.image_eightBall);
        //create an array to reference each ball
        final int[] ballArray = {   R.drawable.ball1,
                                    R.drawable.ball2,
                                    R.drawable.ball3,
                                    R.drawable.ball4,
                                    R.drawable.ball5};


        //sets onClick method for myButton variable.
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("Magic8Ball", "Button is pressed");
                Random rn = new Random(); //new random object
                int number = rn.nextInt(5); //stored in a new variable called number
                ballDisplay.setImageResource(ballArray[number]);
            }
        });
    }
}
