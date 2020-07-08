package com.betterjavacode.demo.managers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ManagerFactory
{
    @Bean
    public TaskManager getTaskManager()
    {
        return new TaskManagerImpl();
    }

}
