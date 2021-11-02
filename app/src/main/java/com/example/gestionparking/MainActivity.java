package com.example.gestionparking;
import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    public static User userConnected;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        TextView signup;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signup=findViewById(R.id.signintxt);
        EditText email,password;
        password=findViewById(R.id.TxtPasswordSign);
        email=findViewById(R.id.TxtEmailSign);
        Button loginbtn;
        loginbtn=findViewById(R.id.loginbtn);
        signup.setOnClickListener(view -> {
            Intent intent=new Intent(MainActivity.this,SignupActivity.class);
            startActivity(intent);
        });
        loginbtn.setOnClickListener(view -> {
            if (email.getText().toString().isEmpty() || password.getText().toString().isEmpty()) {
                Toast.makeText(getApplicationContext(), "please fill all fields", Toast.LENGTH_SHORT).show();
            }else
            {
                AppDatabase db  = AppDatabase.getDbInstance(this.getApplicationContext());
                UserDao userDao = db.userDao();
                User user=userDao.findUser(email.getText().toString(),password.getText().toString());
                if (user == null) {
                    Toast.makeText(getApplicationContext(), "incorrect informations", Toast.LENGTH_SHORT).show();
            }else{
                    userConnected=user;
                    Intent intent=new Intent(MainActivity.this,MapActivity.class);
                    startActivity(intent);
                }

            }

        });



    }
}