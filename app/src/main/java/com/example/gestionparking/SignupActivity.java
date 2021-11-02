package com.example.gestionparking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        Button signup;
        EditText userName,password,email,passwordConfirm;

        signup=findViewById(R.id.Btnsignup);
        userName=findViewById(R.id.TxtUserName);
        password=findViewById(R.id.TxtPassword);
        passwordConfirm=findViewById(R.id.TxtconfirmPassword);
        email=findViewById(R.id.Txtemail);
        signup.setOnClickListener(view -> {
            if (userName.getText().toString().isEmpty() || email.getText().toString().isEmpty() || password.getText().toString().isEmpty()){
                Toast.makeText(getApplicationContext(),"please fill all fields",Toast.LENGTH_SHORT).show();
            }else{
                if (password.getText().toString() != passwordConfirm.getText().toString()){
                    Toast.makeText(getApplicationContext(),"please confirm your password",Toast.LENGTH_SHORT).show();
                }else{
                    AppDatabase db  = AppDatabase.getDbInstance(this.getApplicationContext());
                    UserDao userDao = db.userDao();
                    userDao.insertUser(userName.getText().toString(),email.getText().toString(),password.getText().toString());
                    Toast.makeText(getApplicationContext(),"enregistred successflly",Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(SignupActivity.this,MainActivity.class);
                    startActivity(intent);
                }

            }

        });
    }
}