package kr.co.example.diexam01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Autowired	//자동 주입 setEngine 필요 x
	private Engine v8;
	
	public Car() {
		System.out.println("Car 생성자");
	}
	
//	public void setEngine(Engine e) {
//		this.v8 = e;
//	}
	public void run() {
		System.out.println("엔진을 이용하여 달립니다.");
		v8.exec();
	}
	
}
