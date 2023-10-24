package com.maithilishiksha.mithilakshar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;

import java.util.Random;

public class activity1 extends AppCompatActivity implements MaxAdViewAdListener {

    LinearLayout homebackground1;
    private MaxAdView adView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        homebackground1=findViewById(R.id.homebackground1);
        adView1 = findViewById( R.id.ad_view1 );

        switchcolor();
        AppLovinSdk.getInstance( getApplicationContext() ).setMediationProvider( "max" );
        AppLovinSdk.initializeSdk( getApplicationContext(), new AppLovinSdk.SdkInitializationListener() {
            @Override
            public void onSdkInitialized(final AppLovinSdkConfiguration configuration)
            {
                // AppLovin SDK is initialized, start loading ads
            }
        } );

        adView1.loadAd();
    }

    private void switchcolor() {

        switch (new Random().nextInt(13)){
            case 0:
                homebackground1.setBackgroundColor(getResources().getColor(R.color.bg1));
                break;
            case 1:
                homebackground1.setBackgroundColor(getResources().getColor(R.color.bg2));
                break;
            case 2:
                homebackground1.setBackgroundColor(getResources().getColor(R.color.bg3));
                break;
            case 3:
                homebackground1.setBackgroundColor(getResources().getColor(R.color.bg4));
                break;
            case 4:
                homebackground1.setBackgroundColor(getResources().getColor(R.color.bg5));
                break;
            case 5:
                homebackground1.setBackgroundColor(getResources().getColor(R.color.bg6));
                break;

            case 6:
                homebackground1.setBackgroundColor(getResources().getColor(R.color.bg7));
                break;
            case 7:
                homebackground1.setBackgroundColor(getResources().getColor(R.color.bg8));
                break;
            case 8:
                homebackground1.setBackgroundColor(getResources().getColor(R.color.bg9));
                break;
            case 9:
                homebackground1.setBackgroundColor(getResources().getColor(R.color.bg10));
                break;

            case 10:
                homebackground1.setBackgroundColor(getResources().getColor(R.color.bg11));
                break;
            case 11:
                homebackground1.setBackgroundColor(getResources().getColor(R.color.bg12));
                break;
            case 12:
                homebackground1.setBackgroundColor(getResources().getColor(R.color.bg13));
                break;

        }

    }

    @Override
    public void onAdExpanded(MaxAd maxAd) {

    }

    @Override
    public void onAdCollapsed(MaxAd maxAd) {

    }

    @Override
    public void onAdLoaded(MaxAd maxAd) {

    }

    @Override
    public void onAdDisplayed(MaxAd maxAd) {

    }

    @Override
    public void onAdHidden(MaxAd maxAd) {

    }

    @Override
    public void onAdClicked(MaxAd maxAd) {

    }

    @Override
    public void onAdLoadFailed(String s, MaxError maxError) {

    }

    @Override
    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {

    }
}