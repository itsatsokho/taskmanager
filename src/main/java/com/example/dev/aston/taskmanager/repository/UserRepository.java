package com.example.dev.aston.taskmanager.repository;

import com.example.dev.aston.taskmanager.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
