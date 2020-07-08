package com.betterjavacode.demo.controllers;


import com.betterjavacode.demo.managers.TaskManager;
import com.betterjavacode.demo.models.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:8080")
public class TaskController
{
    @Autowired
    private TaskManager taskManager;

    @GetMapping("/tasks")
    public List<Task> get()
    {
        return taskManager.getAllTasks();
    }

    @PostMapping("/task")
    public Task save(@RequestBody Task task)
    {
        return taskManager.createTask(task);
    }

    @GetMapping("/task/{id}")
    public Task get(@PathVariable int id)
    {
        return taskManager.getTask(id);
    }

    @DeleteMapping("/task/{id}")
    public String delete(@PathVariable int id)
    {
        taskManager.deleteTask(id);
        return "Task with id " + id + " removed";
    }



}
