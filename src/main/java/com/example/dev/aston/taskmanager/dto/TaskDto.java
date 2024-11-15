package com.example.dev.aston.taskmanager.dto;

import lombok.Data;

@Data
public class TaskDto {
    private long id;
    private String title;
    private boolean isCompleted;
}
