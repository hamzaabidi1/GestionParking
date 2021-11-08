package com.example.gestionparking;

import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.List;

public class UserWithBooking {
    @Embedded
    public User user;
    @Relation(
            parentColumn = "uid",
            entityColumn = "userId"
    )
    public List<Booking> playlists;
}

