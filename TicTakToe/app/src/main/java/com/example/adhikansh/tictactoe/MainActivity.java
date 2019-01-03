package com.example.adhikansh.tictactoe;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    int myActivePlayer = 0;
    // O for cross and 1 for circle

    //my Game state
    int [] myGameState = {2,2,2,2,2,2,2,2,2};

    public void imageTapped(View view){

        ImageView myTapped = (ImageView) view;

        int tappedImageTag = Integer.parseInt(myTapped.getTag().toString());
        if(myGameState[tappedImageTag] == 2) {

            myGameState[tappedImageTag] = myActivePlayer;
            if (myActivePlayer == 0) {
                myTapped.setImageResource(R.drawable.cross);
                myTapped.animate().rotation(360).setDuration(1000);
                myActivePlayer = 1;
            } else {
                myTapped.setImageResource(R.drawable.circle);
                myActivePlayer = 0;
            }

        }
    }

    public void buttonTapped(View view){

        myActivePlayer = 0;
        for(int i=0; i<9; i++){
            myGameState[i] = 2;
        }
        LinearLayout linearLayout1 = (LinearLayout) findViewById(R.id.line1);
        for(int i=0; i<linearLayout1.getChildCount();i++){
            ((ImageView) linearLayout1.getChildAt(i)).setImageResource(R.mipmap.ic_launcher_round);
        }

        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.line2);
        for(int i=0; i<linearLayout2.getChildCount();i++){
            ((ImageView) linearLayout2.getChildAt(i)).setImageResource(R.mipmap.ic_launcher_round);
        }

        LinearLayout linearLayout3 = (LinearLayout) findViewById(R.id.line3);
        for(int i=0; i<linearLayout3.getChildCount();i++){
            ((ImageView) linearLayout3.getChildAt(i)).setImageResource(R.mipmap.ic_launcher_round);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
