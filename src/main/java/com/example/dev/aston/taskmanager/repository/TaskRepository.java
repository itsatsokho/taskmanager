package com.example.dev.aston.taskmanager.repository;

import com.example.dev.aston.taskmanager.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository <Task, Long> {
}
