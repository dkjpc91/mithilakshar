package com.maithilishiksha.mithilakshar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.Random;

public class activity3 extends AppCompatActivity {

    LinearLayout homebackground3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        homebackground3=findViewById(R.id.homebackground3);
        switchcolor();
    }

    private void switchcolor() {

        switch (new Random().nextInt(13)){
            case 0:
                homebackground3.setBackgroundColor(getResources().getColor(R.color.bg1));
                break;
            case 1:
                homebackground3.setBackgroundColor(getResources().getColor(R.color.bg2));
                break;
            case 2:
                homebackground3.setBackgroundColor(getResources().getColor(R.color.bg3));
                break;
            case 3:
                homebackground3.setBackgroundColor(getResources().getColor(R.color.bg4));
                break;
            case 4:
                homebackground3.setBackgroundColor(getResources().getColor(R.color.bg5));
                break;
            case 5:
                homebackground3.setBackgroundColor(getResources().getColor(R.color.bg6));
                break;

            case 6:
                homebackground3.setBackgroundColor(getResources().getColor(R.color.bg7));
                break;
            case 7:
                homebackground3.setBackgroundColor(getResources().getColor(R.color.bg8));
                break;
            case 8:
                homebackground3.setBackgroundColor(getResources().getColor(R.color.bg9));
                break;
            case 9:
                homebackground3.setBackgroundColor(getResources().getColor(R.color.bg10));
                break;

            case 10:
                homebackground3.setBackgroundColor(getResources().getColor(R.color.bg11));
                break;
            case 11:
                homebackground3.setBackgroundColor(getResources().getColor(R.color.bg12));
                break;
            case 12:
                homebackground3.setBackgroundColor(getResources().getColor(R.color.bg13));
                break;

        }

    }
}