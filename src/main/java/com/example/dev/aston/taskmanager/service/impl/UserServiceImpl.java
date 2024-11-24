package com.example.dev.aston.taskmanager.service.impl;

import com.example.dev.aston.taskmanager.entity.User;
import com.example.dev.aston.taskmanager.repository.UserRepository;
import com.example.dev.aston.taskmanager.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(String name, String secondName, String email) {
        User user = mapUser(name, secondName, email);
        return userRepository.save(user);
    }

    @Override
    public User updateUser(Long id, String name, String secondName, String email) {
        User user = mapUser(name, secondName, email);
        user.setId(id);
        return userRepository.save(user);
    }

    @Override
    public User getUserById(long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public void deleteUserById(long id) {
        userRepository.deleteById(id);
    }

    private User mapUser(String name, String secondName, String email){
        User user = new User();
        user.setName(name);
        user.setSecondName(secondName);
        user.setEmail(email);
        return user;
    }
}
