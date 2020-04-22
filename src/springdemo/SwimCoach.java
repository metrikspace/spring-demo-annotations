package springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	@Value("${foo.email}")
	private String emailAddress;
	private FortuneService fortuneService;
	@Value("${foo.team}")
	private String team;
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return("Swim 1000 meters as a warm up.");
	}
	@Override
	public String getDailyFortune() {
		return(this.fortuneService.getFortune());
	}
	public String getEmailAddress() {
		return(this.emailAddress);
	}
	public String getTeam() {
		return(this.team);
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}
	public void setTeam(String team) {
		this.team = team;
	}
}