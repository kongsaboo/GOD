package ch06;

public class _09Car {
/*
 * static 변수 = 정적변수 = 공유변수 = 클래스변수
 *  - 객체생성하지 않고 바로 클래스명으로 접근가능
 *  - 공유변수 역할을 한다.
 *  - 정적메소드에서 인스턴스 메소드나 변수를 호출할 경우 컴파일 오류
 *  
 *  예) numbers는 static 변수이므로 클래스명.정적변수명으로 호출
 *  	numbers는 공유변수이므로 차가 생성될 때마다 증가해서 최종값을 갖고 있다.
 */
	private String model;
	private String color;
	private int speed;
	private int id;
	static int numbers=0; //생성된 car객체의 개수를 위한 정적변수
	
	public _09Car() {
		
	}
	public _09Car(String model, String color, int speed) {
		this.model=model;
		this.color=color;
		this.speed=speed;
		id= ++numbers; //자동차 개수를 증가하고 
	}
	
	//정적메소드
	public static int getNumerofCars() {
		return numbers;
	}
}
