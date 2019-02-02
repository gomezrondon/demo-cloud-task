package com.gomezrondon.democloudtask;

import org.springframework.boot.CommandLineRunner;
import org.springframework.cloud.task.listener.TaskExecutionListener;
import org.springframework.cloud.task.repository.TaskExecution;
import org.springframework.stereotype.Component;

@Component
public class TaskProcess implements CommandLineRunner, TaskExecutionListener {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Saludos a Todos "+args[0]);
    }

    @Override
    public void onTaskStartup(TaskExecution taskExecution) {
        System.out.println(">>>>>>>>>>>>>>>>>>>> Before ");
    }

    @Override
    public void onTaskEnd(TaskExecution taskExecution) {
        System.out.println("<<<<<<<<<<<<<<<<<<<< After ");
    }

    @Override
    public void onTaskFailed(TaskExecution taskExecution, Throwable throwable) {

    }
}
