package kr.co.example.diexam01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextExam04 {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AnnotationConfig2.class);
		
		Car car = (Car) ac.getBean(Car.class);   //"car"도 가능 class type으로 하는 것이 오류 줄이기 가능
		car.run();
		//car 클래스만 생성 engine은 DI로 주입!
	}
}
