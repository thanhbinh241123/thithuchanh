package com.example.thithuchanh.service;

import com.example.thithuchanh.entity.User;

import java.util.List;

public interface UserService {

    // Method to find all users
    List<User> findAll();

    // Method to find a user by their ID
    User findById(int theId);

    // Method to save or update a user
    void save(User theUser);

    // Method to delete a user by their ID
    void deleteById(int theId);

}