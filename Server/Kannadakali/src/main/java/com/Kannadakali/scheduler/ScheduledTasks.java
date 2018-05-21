package com.Kannadakali.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {
	

	@Scheduled(cron = "0 15 10 ? * *")
	public void everyDayWordScheduler() {
	    
	}
}
