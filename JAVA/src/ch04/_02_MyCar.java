package ch04;

public class _02_MyCar {
	/*
	 * 클래스 : 객체에 대한 설계도, 디자인, 틀, 청사진
	 * 			- 멤버변수(속성, 필드)+ 멤버메소드(동작, 기능)+ 생성자
	 * 클래스는 설계도이며, 객체는 이 설계도를 바탕으로 만들어진 메모리 공간
	 * 그 결과로 주소값을 가지며, 참조변수에 할당 된다.
	 */
		//멤버변수 -- 멤버변수는 보완을 잘해야함(private)
		//프라이베잇으로 설정해놓으면 메인에서 값을 설정하면 오류남
	
	
	//멤버변수 ==나의 변수
	private String carName;
	private int price ;
	private int cc ;
	private String color;
	private String year;
	
	//생성자(값->멤버변수)
	public _02_MyCar() {
		System.out.println("기본생성자");
	
		 carName = "hyundai"; //int,String 같은 타입을 주면 안됨
		 price = 70000000;
		 cc = 3000;
		 color = "black";
		 year = "2018";
		 
		 
	}
	//new 연산자의 의해서 호출이 된다.
	//매개변수가 있는 생성자(객체생성시점 생성자(값)->매개변수->멤버변수) -- 일회성 로컬변수를 설정 할때는 타입설정 필수
	public _02_MyCar(String carName,int price, int cc, String color,
			String year){ 
			this.carName = carName; //this. 를 붙임으로써 멤버변수가 된다.
			this.price = price; 			
			this.cc = cc;
			this.color = color;
			this.year = year;
		
	}
	
	public _02_MyCar(String carName, int price) {
		this.carName = carName;
	}
	
	//멤버메소드 ==나의 메소드 -->정보 출력
	public void getMyCarInfo() {
		System.out.println("차이름: "+carName+ "\nprice: "
					+price+"\ncc: "+cc
					+"\ncolor: "+color+"\nyear: "+year);
	}
	// 접근제어자 반환형 함수명(매개변수){ }
	public int add(int n1, int n2) {
		int result = n1+n2;
		return result; // return n1+n2;
		
	}
	
	public static void main(String[] args) {
		_02_MyCar c = new _02_MyCar();
		
		int a = c.add(5, 10);
		System.out.println(a);
	}
}
