package com.example.dev.aston.taskmanager.dto;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class TaskDto {
    private long id;
    private String title;
    private boolean isCompleted;
//    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date taskDoneDate;
}
