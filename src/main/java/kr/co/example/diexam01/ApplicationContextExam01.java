package kr.co.example.diexam01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextExam01 {
	
	public static void main(String[] args) {
		
		//spring에 설정정보(apllication context) 위치 알려주기
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		System.out.println("초기화 완료!");
		//xml파일에서 id가 userBeaan인 갹체 리턴
		UserBean userBean = (UserBean) ac.getBean("userBean");
		userBean.setName("Lee");
		
		System.out.println(userBean.getName());
		
		UserBean userBean2 = (UserBean)ac.getBean("userBean");
		if(userBean == userBean2) {
			System.out.println("같은 인스턴스입니다.");
		}
	}
}
