package com.lr;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class SchedulerJob extends QuartzJobBean {

	private SchedulerTask shedulerTask;
	
	public void setShedulerTask(SchedulerTask shedulerTask) {
		this.shedulerTask = shedulerTask;
	}

	@Override
	protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
		
	shedulerTask.printMessage();	
	}

}
