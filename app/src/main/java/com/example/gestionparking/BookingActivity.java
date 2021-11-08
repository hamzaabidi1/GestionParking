package com.example.gestionparking;

import static com.example.gestionparking.MainActivity.userConnected;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BookingActivity extends AppCompatActivity {
    EditText model,brand,hours,plateNumber;
    Button confirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
        model=findViewById(R.id.Model);
        brand=findViewById(R.id.Brand);
        hours=findViewById(R.id.Time);
        plateNumber=findViewById(R.id.Serie);
        confirm=findViewById(R.id.confirm);
        confirm.setOnClickListener(view -> {
            if (model.getText().toString().isEmpty() || brand.getText().toString().isEmpty()|| hours.getText().toString().isEmpty()|| plateNumber.getText().toString().isEmpty()) {
                Toast.makeText(getApplicationContext(), "please fill all fields", Toast.LENGTH_SHORT).show();
            }else{
                AppDatabase db  = AppDatabase.getDbInstance(this.getApplicationContext());
                UserDao userDao = db.userDao();
                SimpleDateFormat formater =formater = new SimpleDateFormat("h:mm a");
                Date aujourdhui = new Date();
                System.out.println(formater.format(aujourdhui));
                userDao.insertBooking(brand.getText().toString(),model.getText().toString(),plateNumber.getText().toString(),hours.getText().toString(),formater.format(aujourdhui),userConnected.uid);
                Intent intent=new Intent(BookingActivity.this,MapsActivity.class);
                startActivity(intent);
            }
        });

    }
}