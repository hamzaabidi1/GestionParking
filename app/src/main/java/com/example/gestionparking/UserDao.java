package com.example.gestionparking;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;

import java.util.List;

@Dao
public interface UserDao {
    @Query("SELECT * FROM user")
    List<User> getAll();

    @Query("SELECT * FROM user WHERE uid IN (:userIds)")
    List<User> loadAllByIds(int[] userIds);

    @Query("SELECT * FROM user WHERE email LIKE :email AND " +
            "password LIKE :password LIMIT 1")
    User findUser(String email, String password);
    @Query("Insert into user (user_name,email,password)values (:username ,:email,:password)")
    void insertUser(String username,String email,String password);

    @Insert
    void insertAll(User... users);

    @Delete
    void delete(User user);

    @Transaction
    @Query("INSERT INTO Booking (carBrand,model,plateNumber,hours,timeOfBooking,userId) values (:carBrand,:model,:plateNumber,:hours,:timeOfBooking,:userId)")
    void insertBooking(String carBrand,String model,String plateNumber,String hours,String timeOfBooking,int userId);

}