package ch04;

public class _03_Profile {
/*클래스닌 설계도, 디자인, 틀, 청사진
 * 멤버변수 + 기본생성자 + 멤버메소드 
 * 클래스는 설계도이며, 객체는 이 설계도를 바탕으로 만들어진
 * 메모리 공간이다.
 * 
 */
	//멤버변수 -- 직접 값을 준다.
	private String name;
	private int age;
	private String address;
	
	
	
	//생성자
	public _03_Profile() {
		System.out.println("기본생성자");
		name = "홍길동";
		age = 29;
		address = "가산디지털 월드메르디앙";
	
	}
	
	//매개변수 생성자 --매개를 통해 값을 준다. 직접  X
	//this. 는 현재객체 
	public _03_Profile(String name, int age, String address) {//(괄호안에 매개변수 값을 주어야함)
		this.name = name ; // ="name"이면 문자열을 주는 것 / not 변수참조
		this.age = age;
		this.address = address;
		
	}
	
	//멤버메소드
	public void getInfo() {
		System.out.println("이름: "+name+ "\nage"+age+"\naddress"+address);
	}
}
