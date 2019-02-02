package com.gomezrondon.democloudtask;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;

@SpringBootApplication
@EnableTask
public class DemoCloudTaskApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoCloudTaskApplication.class, args);
	}
}

