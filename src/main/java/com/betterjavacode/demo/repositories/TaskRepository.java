package com.betterjavacode.demo.repositories;

import com.betterjavacode.demo.models.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Integer>
{

}
