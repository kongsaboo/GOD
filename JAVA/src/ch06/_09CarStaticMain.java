package ch06;

public class _09CarStaticMain {

	public static void main(String[] args) {
		_09Car car= new _09Car("삼성", "블랙", 120);
		
		_09Car car1= new _09Car("아우디", "블랙", 140);
		
		// 정적변수 ->클래스명.정적변수
		int num=_09Car.numbers;  // static 변수
		System.out.println("생성된 자동차수 :"+num);
		
		//정적메소드 호출 ->클래스명.정적메소드
		 num=_09Car.getNumerofCars();
		System.out.println("생성된 자동차수 :"+num);		
	}
}
