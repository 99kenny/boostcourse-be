package kr.co.example.diexam01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class applicationContextExam02 {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Car car = (Car) ac.getBean("c");
		car.run();
		//car 클래스만 생성 engine은 DI로 주입!
	}
}
