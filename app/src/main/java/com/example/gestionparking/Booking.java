package com.example.gestionparking;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Booking {
    @PrimaryKey
    public int bookingId;
    public String carBrand;
    public String model;
    public String plateNumber;
    public String hours;
    public String timeOfBooking;
    public int userId;

}
