package com.maithilishiksha.mithilakshar;


import androidx.annotation.NonNull;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;

public class login extends AppCompatActivity {

    ImageView loginbtn;
    ProgressBar loading;
    private FirebaseAuth auth;


    GoogleSignInClient gsc;
    GoogleSignInOptions gso;

  /*  @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = auth.getCurrentUser();
        if(currentUser!=null){
            Intent ilogin=new Intent(getApplicationContext(),home.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(ilogin);
            finish();
        }
    }
    */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginbtn = findViewById(R.id.loginbtn);
        loading=findViewById(R.id.loading);


       // auth=FirebaseAuth.getInstance();
        //gso=new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestIdToken(getString(R.string.default_web_client_id)).requestEmail().build();
       // gsc= GoogleSignIn.getClient(getApplicationContext(),gso);

        if(getSupportActionBar()!=null){
            getSupportActionBar().hide();
        }


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                loginbtn.setImageResource(R.drawable.enter);
            }
        },1000);


        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                loginbtn.setVisibility(View.INVISIBLE);
                loading.setVisibility(View.VISIBLE);
                Intent ilogin=new Intent(getApplicationContext(),home.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(ilogin);
                finish();
            }
        });

    }


  /*  private void signIn(){

        Intent signInIntent=gsc.getSignInIntent();
        startActivityForResult(signInIntent,1313);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode,Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==1313){
            Task<GoogleSignInAccount> task= GoogleSignIn.getSignedInAccountFromIntent(data);
            try {

                GoogleSignInAccount account=task.getResult(ApiException.class);
                FirebaseAuthWithGoogle(account.getIdToken());

            } catch (ApiException e) {
                Toast.makeText(this, "auth error", Toast.LENGTH_SHORT).show();
            }

        }
    }

    private void FirebaseAuthWithGoogle(String idToken) {
        AuthCredential credential=GoogleAuthProvider.getCredential(idToken,null);
        auth.signInWithCredential(credential).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {

                    Intent ilogin=new Intent(getApplicationContext(),home.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(ilogin);
                    finish();

                } else {
                    Toast.makeText(login.this, "login error", Toast.LENGTH_SHORT).show();
                }
            }
    });
    }


   */



}