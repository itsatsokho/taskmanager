package com.example.dev.aston.taskmanager.service;

import com.example.dev.aston.taskmanager.entity.Task;

import java.util.Date;

public interface TaskService {
    Task createTask(String title, boolean isCompleted, Date taskDoneDate);

    Task updateTask(Long id, String title, boolean completed, Date taskDoneDate);

    Task getTaskById(long id);

    void deleteTaskById(long id);
}
