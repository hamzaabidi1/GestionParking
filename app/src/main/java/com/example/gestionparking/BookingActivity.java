package com.example.gestionparking;



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
    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11,bt12,bt13,bt14,bt15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
        bt1=findViewById(R.id.place1);
        bt2=findViewById(R.id.place2);
        bt3=findViewById(R.id.place3);
        bt4=findViewById(R.id.place4);
        bt5=findViewById(R.id.place5);
        bt6=findViewById(R.id.place6);
        bt7=findViewById(R.id.place7);
        bt8=findViewById(R.id.place8);
        bt9=findViewById(R.id.place9);
        bt10=findViewById(R.id.place10);
        bt11=findViewById(R.id.place11);
        bt12=findViewById(R.id.place12);
        bt13=findViewById(R.id.place13);
        bt14=findViewById(R.id.place14);
        bt15=findViewById(R.id.place15);
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
                userDao.insertBooking(brand.getText().toString(),model.getText().toString(),plateNumber.getText().toString(),hours.getText().toString(),formater.format(aujourdhui), MainActivity.userConnected.uid);
                Toast.makeText(getApplicationContext(), "booking Succeed for "+hours.getText().toString()+" hours", Toast.LENGTH_SHORT).show();
                if (bt1 == ParkingActivity.parkingSelected){
                    bt1.setBackgroundColor(getResources().getColor(R.color.red));
                    bt1.setBackgroundColor(bt1.getContext().getResources().getColor(R.color.red));
                }
                Intent intent=new Intent(BookingActivity.this,MapsActivity.class);
                startActivity(intent);
            }
        });

    }
}