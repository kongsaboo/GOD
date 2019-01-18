package ch04;

public class _02_MyCarMainEx {
	public static void main(String[] args) {
		/*
		 * 객체생성 : 클래스명 참조변수 명 = new 생성자(클레스명) 접근 : 참조변수명.멤버변수; 참조변수명.멤버메소드; 참조변수명에는 생성한
		 * 객체의 메모리공간 주소값이 들어 있다. 앞의 클래스명은 데이터타입이고, 참조변수로 접근할 때 사용이 된다. 뒤의 클래스명은 메모리에
		 * 객체생성 시 사용되는 생성자다.
		 */

		// 1. 객체생성 : 클래스명 참조변수명 = new 클래스명();

		_02_MyCar mc = new _02_MyCar();// 참조변수명은 임의 설정하면됨

		// 2. 참조변수명.멤버메소드

		mc.getMyCarInfo(); // 멤버메소드를 불러온다

		// 1_1. 객체생성 : 클래스명 참조변수명 = new 클래스명(매개변수);
		_02_MyCar mc2 = new _02_MyCar("소나타 ", 500000000, 2000, "green", "2018");
		mc2.getMyCarInfo();

		
		_02_MyCar mc3 = new _02_MyCar("ㅇㅇㅇ", 3000);
		
		mc3.getMyCarInfo();
	}
}
