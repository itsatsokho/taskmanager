package com.example.dev.aston.taskmanager.service.impl;

import com.example.dev.aston.taskmanager.entity.Task;
import com.example.dev.aston.taskmanager.repository.TaskRepository;
import com.example.dev.aston.taskmanager.service.TaskService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class TaskServiceImpl implements TaskService {
    private TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task createTask(String title, boolean isCompleted) {
        Task task = mapTask(title, isCompleted);
        return taskRepository.save(task);
    }

    @Override
    public Task updateTask(Long id, String title, boolean isCompleted) {
        Task task = mapTask(title, isCompleted);
        task.setId(id);
        return taskRepository.save(task);
    }

    @Override
    public Task getTaskById(long id) {
        return taskRepository.findById(id).get();
    }

    @Override
    public void deleteTaskById(long id) {
        taskRepository.deleteById(id);
    }

    private Task mapTask(String title, boolean isCompleted) {
        Task task = new Task();
        task.setCompleted(isCompleted);
        task.setTitle(title);
        task.setCreationDate(LocalDate.now());
        return task;
    }
}
