package com.example.dev.aston.taskmanager.service;

import com.example.dev.aston.taskmanager.entity.User;

public interface UserService {
    User createUser(String name, String secondName, String email);
    User updateUser(Long id, String name, String secondName, String email);
    User getUserById(long id);
    void deleteUserById(long id);
}
