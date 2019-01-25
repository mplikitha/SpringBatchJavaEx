package com.springboot.batch.example.SpringBatchJava;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



// ex: https://howtodoinjava.com/spring-batch/java-config-multiple-steps/
@SpringBootApplication
public class SpringBatchJavaApplication implements CommandLineRunner{

	 @Autowired
	    JobLauncher jobLauncher;
	     
	    @Autowired
	    Job job;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBatchJavaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		JobParameters params = new JobParametersBuilder()
                .addString("JobID", String.valueOf(System.currentTimeMillis()))
                .toJobParameters();
    jobLauncher.run(job, params);
		
	}

}

