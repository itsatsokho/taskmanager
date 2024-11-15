package com.example.dev.aston.taskmanager.service;

import com.example.dev.aston.taskmanager.entity.Task;

public interface TaskService {
    Task createTask(String title, boolean isCompleted);

    Task updateTask(Long id, String title, boolean completed);

    Task getTaskById(long id);

    void deleteTaskById(long id);
}
