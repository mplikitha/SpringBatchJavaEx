package com.springboot.batch.example.SpringBatchJava.tasks;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class TaskTwo implements Tasklet {

	@Override
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {

        System.out.println("MyTaskTwo start..");
 
     System.out.println("task2 executing");
         
        System.out.println("MyTaskTwo done..");
        return RepeatStatus.FINISHED;
	}

}
