package ch05;

public class _05_Student { // extends object가 생략됨.. 모든 클래스의 조상은 object

	//멤버변수
	private int number; 	// 학번
	private String name;	// 이름	
	private int age;		// 나이
	
	//기본생성자
	public _05_Student() {
		number =1000; // 기본은 명시(this.)을 주지 않아도 됨
		this.name = "장동건";
		this.age = 50;
		
		
	}
	
	
	//매개변수생성자
	public _05_Student(int number, String name, int age) {
		this.number = number;
		this.name = name;
		this.age = age;			
	}
	/*public void printInf0() {
		System.out.print("\n번호 : "+number + "\n이름 : "+ name +"\n나이 : "+age);
		
	}
*/

	@Override // object의 toString()을 오버라이드 함 : object의 toString()은 주소값을 출력
	public String toString() { //타입이 스트링인 이유 --> 문자값을 출력해야하기 때문
		return "[number=" + number + ", name=" + name + ", age=" + age + "]";
	}
		
	
	
	//멤버 메소드
		
}
