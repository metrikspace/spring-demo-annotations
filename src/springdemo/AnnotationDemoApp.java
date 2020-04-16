package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("context/application.xml");
		Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
		System.out.println(tennisCoach.getDailyFortune());
		System.out.println(tennisCoach.getDailyWorkout());
		context.close();
	}
}