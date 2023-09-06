package com.example.tasks.Controller;

import com.example.tasks.Model.Task;
import com.example.tasks.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TaskController {
    @Autowired
    private TaskRepository repository;

    @GetMapping("/tasks")
    public List<Task> allTasks(){
        return repository.findAll();
    }
}
