package com.example.adhikansh.snakes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import java.util.*;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int [] myDices = {
            R.drawable.one,
            R.drawable.two,
            R.drawable.three,
            R.drawable.four,
            R.drawable.five,
            R.drawable.six,
    };

    public void buttonTapped(View view){
        int diceNum = ((int)Math.random()*6)+1;

        Random ran = new Random();
        int randomNumber = ran.nextInt(6);

        ImageView dice = (ImageView) findViewById(R.id.dice);
        dice.setImageResource(myDices[randomNumber]);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
