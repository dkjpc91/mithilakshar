package com.maithilishiksha.mithilakshar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.Random;

public class activity8 extends AppCompatActivity {

    LinearLayout homebackground8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_8);

        homebackground8=findViewById(R.id.homebackground8);
        switchcolor();
    }

    private void switchcolor() {

        switch (new Random().nextInt(13)){
            case 0:
                homebackground8.setBackgroundColor(getResources().getColor(R.color.bg1));
                break;
            case 1:
                homebackground8.setBackgroundColor(getResources().getColor(R.color.bg2));
                break;
            case 2:
                homebackground8.setBackgroundColor(getResources().getColor(R.color.bg3));
                break;
            case 3:
                homebackground8.setBackgroundColor(getResources().getColor(R.color.bg4));
                break;
            case 4:
                homebackground8.setBackgroundColor(getResources().getColor(R.color.bg5));
                break;
            case 5:
                homebackground8.setBackgroundColor(getResources().getColor(R.color.bg6));
                break;

            case 6:
                homebackground8.setBackgroundColor(getResources().getColor(R.color.bg7));
                break;
            case 7:
                homebackground8.setBackgroundColor(getResources().getColor(R.color.bg8));
                break;
            case 8:
                homebackground8.setBackgroundColor(getResources().getColor(R.color.bg9));
                break;
            case 9:
                homebackground8.setBackgroundColor(getResources().getColor(R.color.bg10));
                break;

            case 10:
                homebackground8.setBackgroundColor(getResources().getColor(R.color.bg11));
                break;
            case 11:
                homebackground8.setBackgroundColor(getResources().getColor(R.color.bg12));
                break;
            case 12:
                homebackground8.setBackgroundColor(getResources().getColor(R.color.bg13));
                break;

        }

    }
}