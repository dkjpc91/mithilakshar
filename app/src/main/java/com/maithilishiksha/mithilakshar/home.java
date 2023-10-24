package com.maithilishiksha.mithilakshar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;

import java.util.Random;


public class home extends AppCompatActivity implements MaxAdViewAdListener {

    DrawerLayout drawerLayout;
    NavigationView navigationview;
    RelativeLayout homebackground;
    Toolbar toolbar;

    private MaxAdView adView;



    CardView f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11;

    GoogleSignInClient gsc;
    GoogleSignInOptions gso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        adView = findViewById( R.id.ad_view );


        //find Ids
        f1=findViewById(R.id.f1);
        f2=findViewById(R.id.f2);
        f3=findViewById(R.id.f3);
        f4=findViewById(R.id.f4);
        f5=findViewById(R.id.f5);
        f6=findViewById(R.id.f6);
        f7=findViewById(R.id.f7);
        f8=findViewById(R.id.f8);
        f9=findViewById(R.id.f9);
        f10=findViewById(R.id.f10);
        f11=findViewById(R.id.f11);
        homebackground=findViewById(R.id.homebackground);
        switchcolor();


        AppLovinSdk.getInstance( getApplicationContext() ).setMediationProvider( "max" );
        AppLovinSdk.initializeSdk( getApplicationContext(), new AppLovinSdk.SdkInitializationListener() {
            @Override
            public void onSdkInitialized(final AppLovinSdkConfiguration configuration)
            {
                // AppLovin SDK is initialized, start loading ads
            }
        } );

        adView.loadAd();



        //Fragment move
        f1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { activitySwitch(1);
            }
        });
        f2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { activitySwitch(2);
            }
        });
        f3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) { activitySwitch(3);

            }
        });
        f4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { activitySwitch(4);

            }
        });
        f5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {activitySwitch(5);

            }
        });
        f6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {activitySwitch(6);

            }
        });
        f7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {activitySwitch(7);

            }
        });
        f8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {activitySwitch(8);

            }
        });
        f9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {activitySwitch(9);

            }
        });
        f10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {activitySwitch(10);

            }
        });
        f11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {activitySwitch(11);

            }
        });





        //drawer layout
        drawerLayout=findViewById(R.id.drawerLayout);
        navigationview=findViewById(R.id.navigationview);
        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open_drawer,R.string.close_drawer);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        //navigation item selection task
        navigationview.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();
                /*if (id == R.id.logout) {

                    gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestIdToken(getString(R.string.default_web_client_id)).requestEmail().build();
                    gsc = GoogleSignIn.getClient(getApplicationContext(), gso);

                    gsc.signOut().addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            if (task.isSuccessful()) {
                                FirebaseAuth.getInstance().signOut();
                                Intent login_intent = new Intent(getApplicationContext(), login.class);
                                startActivity(login_intent);
                                finish();
                            }
                        };
                    });
                } */
                if (id == R.id.share) {

                    Intent sharingintent=new Intent(Intent.ACTION_SEND);
                    sharingintent.setType("text/plain");
                    sharingintent.putExtra(Intent.EXTRA_SUBJECT,"मिथिलाक्षर ऐप ");
                    sharingintent.putExtra(Intent.EXTRA_TEXT,"ममिथिलाक्षर एप डाउनलोड करबाक लेल एहि लिंक पर क्लिक करू : https://play.google.com/store/apps/details?id="+getPackageName());
                    try {
                        startActivity(sharingintent);
                    } catch (android.content.ActivityNotFoundException ex) {
                        Toast.makeText(home.this, "sharing error", Toast.LENGTH_SHORT).show();}

                }

                drawerLayout.closeDrawer(GravityCompat.START);

                return true;
            }


        });
    }

    private void switchcolor() {

        switch (new Random().nextInt(13)){
            case 0:
                homebackground.setBackgroundColor(getResources().getColor(R.color.bg1));
                break;
            case 1:
                homebackground.setBackgroundColor(getResources().getColor(R.color.bg2));
                break;
            case 2:
                homebackground.setBackgroundColor(getResources().getColor(R.color.bg3));
                break;
            case 3:
                homebackground.setBackgroundColor(getResources().getColor(R.color.bg4));
                break;
            case 4:
                homebackground.setBackgroundColor(getResources().getColor(R.color.bg5));
                break;
            case 5:
                homebackground.setBackgroundColor(getResources().getColor(R.color.bg6));
                break;

            case 6:
                homebackground.setBackgroundColor(getResources().getColor(R.color.bg7));
                break;
            case 7:
                homebackground.setBackgroundColor(getResources().getColor(R.color.bg8));
                break;
            case 8:
                homebackground.setBackgroundColor(getResources().getColor(R.color.bg9));
                break;
            case 9:
                homebackground.setBackgroundColor(getResources().getColor(R.color.bg10));
                break;

            case 10:
                homebackground.setBackgroundColor(getResources().getColor(R.color.bg11));
                break;
            case 11:
                homebackground.setBackgroundColor(getResources().getColor(R.color.bg12));
                break;
            case 12:
                homebackground.setBackgroundColor(getResources().getColor(R.color.bg13));
                break;

        }

    }


    public void activitySwitch(int in){

        switch (in){

            case 1:
                Intent i= new Intent(getApplicationContext(),activity1.class);
                startActivity(i);
                break;
            case 2:
                i= new Intent(getApplicationContext(),activity2.class);
                startActivity(i);
                break;
            case 3:
                i= new Intent(getApplicationContext(),activity3.class);
                startActivity(i);
                break;
            case 4:
                i= new Intent(getApplicationContext(),activity4.class);
                startActivity(i);
                break;
            case 5:
                i= new Intent(getApplicationContext(),activity5.class);
                startActivity(i);
                break;
            case 6:
                i= new Intent(getApplicationContext(),activity6.class);
                startActivity(i);
                break;
            case 7:
                i= new Intent(getApplicationContext(),activity7.class);
                startActivity(i);
                break;
            case 8:
                i= new Intent(getApplicationContext(),activity8.class);
                startActivity(i);
                break;
            case 9:
                i= new Intent(getApplicationContext(),activity9.class);
                startActivity(i);
                break;
            case 10:
                i= new Intent(getApplicationContext(),activity10.class);
                startActivity(i);
                break;
            case 11:
                i= new Intent(getApplicationContext(),activity11.class);
                startActivity(i);
                break;
        }

    }


    @Override
    public void onBackPressed() {

        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }else {
            super.onBackPressed();
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

