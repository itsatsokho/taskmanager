package com.example.dev.aston.taskmanager.controller;


import com.example.dev.aston.taskmanager.dto.TaskDto;
import com.example.dev.aston.taskmanager.entity.Task;
import com.example.dev.aston.taskmanager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private TaskService taskService;
    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    public ResponseEntity<Task> createTask(@RequestBody TaskDto taskDto) {
        Task task = taskService.createTask(taskDto.getTitle(),
                taskDto.isCompleted());
        return ResponseEntity.status(HttpStatus.CREATED).body(task);
    }

    @PutMapping
    public ResponseEntity<Task> updateTask(@RequestBody Task taskDto) {
        Task task = taskService.updateTask(taskDto.getId(),
                taskDto.getTitle(),
                taskDto.isCompleted());
        return ResponseEntity.ok(task);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable long id) {
        Task task = taskService.getTaskById(id);
        return ResponseEntity.ok(task);
    }

    @DeleteMapping("/{id}")
    public void deleteTaskById(@PathVariable long id) {
        taskService.deleteTaskById(id);
    }
}
