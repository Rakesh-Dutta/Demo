package com.betterjavacode.demo.managers;

import com.betterjavacode.demo.models.Task;
import com.betterjavacode.demo.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class TaskManagerImpl implements TaskManager
{

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public Task createTask (Task task)
    {
        Task t = taskRepository.save(task);
        return t;
    }

    @Override
    public Task updateTask (Task task)
    {
        Task t = taskRepository.save(task);
        return t;
    }

    @Override
    public Task getTask (int id)
    {
        Optional<Task> task = taskRepository.findById(id);
        return task.get();
    }

    @Override
    public List<Task> getAllTasks ()
    {
        List<Task> tasks = (List<Task>) taskRepository.findAll();
        return tasks;
    }

    @Override
    public void deleteTask (int id)
    {
        taskRepository.deleteById(id);
    }
}
