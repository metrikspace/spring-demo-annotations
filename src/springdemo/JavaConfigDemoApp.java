package springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);
		System.out.println(swimCoach.getDailyFortune());
		System.out.println(swimCoach.getDailyWorkout());
		System.out.println(swimCoach.getEmailAddress());
		System.out.println(swimCoach.getTeam());
		context.close();
	}
}