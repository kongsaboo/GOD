package test;

public class _04_Member { // 클래스에 뛰어쓰기 오류

	// 멤버변수
	private String name;
	private int age;
	private String email;

	// 객체는 속성과 기능으로 구성된다.
	// 멤버변수 + 기본 생성자 + 멤버메서드

	// 기본생성자
	public _04_Member() {
		System.out.println("기본생성자"); // ;빼먹음

		name = "이정섭";
		age = 29;
		email = "guaba0130@gmail.com"; // '잘못 들어감
	}

	// 매개변수
	public _04_Member(String name, int age, String email) {
		this.name = name;
		this.age = age;
		this.email = email;
	}

	public void getDetail() {// 메서드 기본작성법 모름
		System.out.println("이름: " + name + "\nage: " + age + "\nemail" + email);
	}
	
	
} // 중괄호 하나 더 넣음
