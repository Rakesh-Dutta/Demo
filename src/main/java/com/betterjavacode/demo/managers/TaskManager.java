package com.betterjavacode.demo.managers;

import com.betterjavacode.demo.models.Task;

import java.util.List;

public interface TaskManager
{
    Task createTask(Task task);

    Task updateTask(Task task);

    Task getTask(int id);

    List<Task> getAllTasks();

    void deleteTask(int id);
}
