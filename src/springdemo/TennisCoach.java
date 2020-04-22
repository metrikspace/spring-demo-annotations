 package springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService; 
	@Override
	public String getDailyFortune() {
		return(this.fortuneService.getFortune());
	}
	@Override
	public String getDailyWorkout() {
		return("Practice your backhand volley");
	}
	@PostConstruct
	public void startup() {
		System.out.println("Starting...");
	}
	@PreDestroy
	public void cleanup() {
		System.out.println("Cleaning...");
	}
}