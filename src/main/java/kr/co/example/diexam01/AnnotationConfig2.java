package kr.co.example.diexam01;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//해당 패키지안의 annotation들 bean으로 자동인식 - controller, service, component 등
@ComponentScan("kr.co.example.diexam01")
public class AnnotationConfig2 {
	//자동인식하기 때문에 여기 작성 할 필요 x
}
