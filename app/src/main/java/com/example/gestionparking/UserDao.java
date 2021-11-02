package com.example.gestionparking;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

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
    @Query("Insert into user values (:username ,:email,:password)")
    @Insert
    void insertUser(String username,String email,String password);

    @Insert
    void insertAll(User... users);

    @Delete
    void delete(User user);
}