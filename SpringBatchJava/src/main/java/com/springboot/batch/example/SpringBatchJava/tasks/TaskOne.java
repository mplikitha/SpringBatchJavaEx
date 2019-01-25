package com.springboot.batch.example.SpringBatchJava.tasks;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class TaskOne implements Tasklet {

	@Override
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		 System.out.println("MyTaskOne start..");
		 
	     System.out.println("task1 executing");
	         
	        System.out.println("MyTaskOne done..");
	        return RepeatStatus.FINISHED;
	}

}
