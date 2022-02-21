package com.tiraj.jobschedular.service;

import com.tiraj.jobschedular.dao.TaskRepository;
import com.tiraj.jobschedular.model.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class TaskService {

    @Autowired
    private TaskRepository repository;

     Logger log =LoggerFactory.getLogger(TaskService.class);

    @Scheduled(fixedRate = 10000)
    public void addTask(){
        Task task = new Task();
        task.setMessage("--Tiraj"+new Random().nextInt(100));
        repository.save(task);
       log.info("+++++++Task  "+ task.getId()+"---"+task.getMessage() );
    }

    @Scheduled(cron = "0/15 * * * * *")
    public void getTask(){
        List<Task>  tasks = repository.findAll();
       log.info("*---No.of tasks :"+tasks.size());

    }


}
