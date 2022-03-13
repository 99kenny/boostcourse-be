package kr.co.example.diexam01;

public class UserBean {
	/*
	 1) 기본 생성자
	 2) 필드는 private으로 선언
	 3) getter, setter 메소드 가진다.
	 */
	private String name;
	private int age;
	private boolean male;
	
	public UserBean() {}
	public UserBean(String name, int age, boolean male) {
		super();
		this.name = name;
		this.age = age;
		this.male = male;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isMale() {
		return male;
	}
	public void setMale(boolean male) {
		this.male = male;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
