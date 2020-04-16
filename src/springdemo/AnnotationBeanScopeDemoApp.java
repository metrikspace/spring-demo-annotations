package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("context/application.xml");
		Coach coachOne = context.getBean("tennisCoach", Coach.class);
		Coach coachTwo = context.getBean("tennisCoach", Coach.class);
		System.out.println("Memory of coachOne"+coachOne);
		System.out.println("Memory of coachTwo"+coachTwo);
		System.out.println(coachOne == coachTwo);
		context.close();
	}
}