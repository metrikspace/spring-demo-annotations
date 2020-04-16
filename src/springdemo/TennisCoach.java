 package springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
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
}