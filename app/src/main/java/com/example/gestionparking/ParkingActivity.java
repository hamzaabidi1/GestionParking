package com.example.gestionparking;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ParkingActivity extends AppCompatActivity {
        public static Button parkingSelected ;
        Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11,bt12,bt13,bt14,bt15;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_parking);

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

        }
        public void place1_clicked(View view) {
            parkingSelected=bt1;
            Intent i = new Intent(ParkingActivity.this, BookingActivity.class);
            startActivity(i);
        }
        public void place2_clicked(View view) {
            parkingSelected=bt2;
            Intent i = new Intent(ParkingActivity.this, BookingActivity.class);
            startActivity(i);

            }
            //Toast.makeText(this, "color code is "+color, Toast.LENGTH_LONG).show();

        public void place3_clicked(View view) {
                Toast.makeText(getApplicationContext(),"cet endroit est réservé",Toast.LENGTH_LONG).show();
        }
        public void place4_clicked(View view) {
                parkingSelected=bt4;
                Intent i = new Intent(ParkingActivity.this, BookingActivity.class);
                startActivity(i);

        }
        public void place5_clicked(View view) {
                Toast.makeText(getApplicationContext(),"cet endroit est réservé",Toast.LENGTH_LONG).show();
        }
        public void place6_clicked(View view) {
                Toast.makeText(getApplicationContext(),"cet endroit est réservé",Toast.LENGTH_LONG).show();
        }
        public void place7_clicked(View view) {
                Toast.makeText(getApplicationContext(),"cet endroit est réservé",Toast.LENGTH_LONG).show();
        }
        public void place8_clicked(View view) {
            parkingSelected=bt1;
                Intent i = new Intent(ParkingActivity.this, BookingActivity.class);
                startActivity(i);
        }
        public void place9_clicked(View view) {
                Toast.makeText(getApplicationContext(),"cet endroit est réservé",Toast.LENGTH_LONG).show();
        }
        public void place10_clicked(View view) {
            parkingSelected=bt1;
                Intent i = new Intent(ParkingActivity.this, BookingActivity.class);
                startActivity(i);
        }
        public void place11_clicked(View view) {
            parkingSelected=bt1;
                Intent i = new Intent(ParkingActivity.this, BookingActivity.class);
                startActivity(i);
        }
        public void place12_clicked(View view) {
                Toast.makeText(getApplicationContext(),"cet endroit est réservé",Toast.LENGTH_LONG).show();
        }
        public void place13_clicked(View view) {
                Toast.makeText(getApplicationContext(),"cet endroit est réservé",Toast.LENGTH_LONG).show();
        }
        public void place14_clicked(View view) {
            parkingSelected=bt1;
                Intent i = new Intent(ParkingActivity.this, BookingActivity.class);
                startActivity(i);
        }
        public void place15_clicked(View view) {
                Toast.makeText(getApplicationContext(),"cet endroit est réservé",Toast.LENGTH_LONG).show();

        }
}