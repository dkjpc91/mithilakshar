package com.maithilishiksha.mithilakshar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.Random;

public class activity10 extends AppCompatActivity {

    LinearLayout homebackground10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_10);

        homebackground10=findViewById(R.id.homebackground10);
        switchcolor();
    }

    private void switchcolor() {

        switch (new Random().nextInt(13)){
            case 0:
                homebackground10.setBackgroundColor(getResources().getColor(R.color.bg1));
                break;
            case 1:
                homebackground10.setBackgroundColor(getResources().getColor(R.color.bg2));
                break;
            case 2:
                homebackground10.setBackgroundColor(getResources().getColor(R.color.bg3));
                break;
            case 3:
                homebackground10.setBackgroundColor(getResources().getColor(R.color.bg4));
                break;
            case 4:
                homebackground10.setBackgroundColor(getResources().getColor(R.color.bg5));
                break;
            case 5:
                homebackground10.setBackgroundColor(getResources().getColor(R.color.bg6));
                break;

            case 6:
                homebackground10.setBackgroundColor(getResources().getColor(R.color.bg7));
                break;
            case 7:
                homebackground10.setBackgroundColor(getResources().getColor(R.color.bg8));
                break;
            case 8:
                homebackground10.setBackgroundColor(getResources().getColor(R.color.bg9));
                break;
            case 9:
                homebackground10.setBackgroundColor(getResources().getColor(R.color.bg10));
                break;

            case 10:
                homebackground10.setBackgroundColor(getResources().getColor(R.color.bg11));
                break;
            case 11:
                homebackground10.setBackgroundColor(getResources().getColor(R.color.bg12));
                break;
            case 12:
                homebackground10.setBackgroundColor(getResources().getColor(R.color.bg13));
                break;

        }

    }
}