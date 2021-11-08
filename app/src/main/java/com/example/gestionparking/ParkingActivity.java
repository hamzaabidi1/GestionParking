package com.example.gestionparking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ParkingActivity extends AppCompatActivity {

        Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11,bt12,bt13,bt14,bt15;
        Log log;
        private String message,user_cin,position_parc_map;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_parking);

          /*      Intent intent=getIntent();
         Bundle extras = intent.getExtras();
           message = extras.getString("EXTRA_MESSAGE");
            user_cin=extras.getString("EXTRA_USER_CIN");
            position_parc_map=extras.getString("EXTRA_POSITION_PARC_MAP");
            log.d("message",message);
            log.d("user cin",user_cin);
            log.d("position parc",position_parc_map);
*/

            bt1=(Button)findViewById(R.id.place1);
            bt2=(Button)findViewById(R.id.place2);
            bt3=(Button)findViewById(R.id.place3);
            bt4=(Button)findViewById(R.id.place4);
            bt5=(Button)findViewById(R.id.place5);
            bt6=(Button)findViewById(R.id.place6);
            bt7=(Button)findViewById(R.id.place7);
            bt8=(Button)findViewById(R.id.place8);
            bt9=(Button)findViewById(R.id.place9);
            bt10=(Button)findViewById(R.id.place10);
            bt11=(Button)findViewById(R.id.place11);
            bt12=(Button)findViewById(R.id.place12);
            bt13=(Button)findViewById(R.id.place13);
            bt14=(Button)findViewById(R.id.place14);
            bt15=(Button)findViewById(R.id.place15);
        }
        public void place1_clicked(View view) {
  /*      if (bt1.getBackground().equals("@color/green")) {
            Intent i = new Intent(ParkingActivity.this, BookingActivity.class);
            startActivity(i);
            log.d("test","greenclicked");
        }if (bt1.getBackground().equals("@color/red")){
            Toast.makeText(this,"cet endroit est réservé",Toast.LENGTH_LONG).show();
            log.d("test","redclicked");
        }*/
            Intent i = new Intent(ParkingActivity.this, BookingActivity.class);
     /*       Bundle extras = new Bundle();
            extras.putString("EXTRA_MESSAGE", "those are User information's");
            extras.putString("EXTRA_USER_CIN", user_cin);
            extras.putString("EXTRA_POSITION_PARC_MAP", position_parc_map);
            extras.putString("EXTRA_ID_PLACE", "place1");
            i.putExtras(extras);*/
            startActivity(i);



        }
        public void place2_clicked(View view) {
            int color = Color.TRANSPARENT;
            Drawable background = view.getBackground();
            if (background instanceof ColorDrawable)
                color = ((ColorDrawable) background).getColor();
            if (color== Color.GREEN) {
                Intent i = new Intent(ParkingActivity.this, BookingActivity.class);
                startActivity(i);
            }else{
                Toast.makeText(getApplicationContext(),"cet endroit est réservé",Toast.LENGTH_LONG).show();
            }

            //Toast.makeText(this, "color code is "+color, Toast.LENGTH_LONG).show();
        }
        public void place3_clicked(View view) {
            if (bt3.getBackground().equals("@color/green")) {
                Intent i = new Intent(ParkingActivity.this, BookingActivity.class);
                startActivity(i);
            }else{
                Toast.makeText(getApplicationContext(),"cet endroit est réservé",Toast.LENGTH_LONG).show();
            }
        }
        public void place4_clicked(View view) {
            if (bt4.getBackground().equals("@color/green")) {
                Intent i = new Intent(ParkingActivity.this, BookingActivity.class);
                startActivity(i);
            }else{
                Toast.makeText(getApplicationContext(),"cet endroit est réservé",Toast.LENGTH_LONG).show();
            }
        }
        public void place5_clicked(View view) {
            if (bt5.getBackground().equals("@color/green")) {
                Intent i = new Intent(ParkingActivity.this, BookingActivity.class);
                startActivity(i);
            }else{
                Toast.makeText(getApplicationContext(),"cet endroit est réservé",Toast.LENGTH_LONG).show();
            }
        }
        public void place6_clicked(View view) {
            if (bt6.getBackground().equals("@color/green")) {
                Intent i = new Intent(ParkingActivity.this, BookingActivity.class);
                startActivity(i);
            }else{
                Toast.makeText(getApplicationContext(),"cet endroit est réservé",Toast.LENGTH_LONG).show();
            }
        }
        public void place7_clicked(View view) {
            if (bt7.getBackground().equals("@color/green")) {
                Intent i = new Intent(ParkingActivity.this, BookingActivity.class);
                startActivity(i);
            }else{
                Toast.makeText(getApplicationContext(),"cet endroit est réservé",Toast.LENGTH_LONG).show();
            }
        }
        public void place8_clicked(View view) {
            if (bt8.getBackground().equals("@color/green")) {
                Intent i = new Intent(ParkingActivity.this, BookingActivity.class);
                startActivity(i);
            }else{
                Toast.makeText(getApplicationContext(),"cet endroit est réservé",Toast.LENGTH_LONG).show();
            }
        }
        public void place9_clicked(View view) {
            if (bt9.getBackground().equals("@color/green")) {
                Intent i = new Intent(ParkingActivity.this, BookingActivity.class);
                startActivity(i);
            }else{
                Toast.makeText(getApplicationContext(),"cet endroit est réservé",Toast.LENGTH_LONG).show();
            }
        }
        public void place10_clicked(View view) {
            if (bt10.getBackground().equals("@color/green")) {
                Intent i = new Intent(ParkingActivity.this, BookingActivity.class);
                startActivity(i);
            }
            if (bt15.getBackground().equals("@color/red")){
                Toast.makeText(getApplicationContext(),"cet endroit est réservé",Toast.LENGTH_LONG).show();
            }
        }
        public void place11_clicked(View view) {
            if (bt11.getBackground().equals("@color/green")) {
                Intent i = new Intent(ParkingActivity.this, BookingActivity.class);
                startActivity(i);
            }
            if (bt15.getBackground().equals("@color/red")){
                Toast.makeText(getApplicationContext(),"cet endroit est réservé",Toast.LENGTH_LONG).show();
            }
        }
        public void place12_clicked(View view) {
            if (bt12.getBackground().equals("@color/green")) {
                Intent i = new Intent(ParkingActivity.this, BookingActivity.class);
                startActivity(i);
            }
            if (bt15.getBackground().equals("@color/red")){
                Toast.makeText(getApplicationContext(),"cet endroit est réservé",Toast.LENGTH_LONG).show();
            }
        }
        public void place13_clicked(View view) {
            if (bt13.getBackground().equals("@color/green")) {
                Intent i = new Intent(ParkingActivity.this, BookingActivity.class);
                startActivity(i);
            }
            if (bt15.getBackground().equals("@color/red")){
                Toast.makeText(getApplicationContext(),"cet endroit est réservé",Toast.LENGTH_LONG).show();
            }
        }
        public void place14_clicked(View view) {
            if (bt14.getBackground().equals("@color/green")) {
                Intent i = new Intent(ParkingActivity.this, BookingActivity.class);
                startActivity(i);
            }
            if (bt15.getBackground().equals("@color/red")){
                Toast.makeText(getApplicationContext(),"cet endroit est réservé",Toast.LENGTH_LONG).show();
            }
        }
        public void place15_clicked(View view) {
            if (bt15.getBackground().equals("@color/green")) {
                Intent i = new Intent(ParkingActivity.this, BookingActivity.class);
                startActivity(i);
            }
            if (bt15.getBackground().equals("@color/red")){
                Toast.makeText(getApplicationContext(),"cet endroit est réservé",Toast.LENGTH_LONG).show();
            }
        }
}