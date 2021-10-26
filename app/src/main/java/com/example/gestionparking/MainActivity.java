package com.example.gestionparking;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView signup;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signup=findViewById(R.id.signintxt);
        signup.setOnClickListener(view -> {
            Intent intent=new Intent(MainActivity.this,SignupActivity.class);
            startActivity(intent);
        });



    }
}