package ch04;

public class _03_ProfileMainEX {
	public static void main(String[] args) {
		//1. 객체생성
		//클래스명 참조변수명 = new 클래스명();
		//참조변수명은  객체의 주소값이 들어있다.
		_03_Profile detail = new _03_Profile();
		
		
		//2.출력 메서도 호출
		//참조변수명.멤버메소드
		detail.getInfo();
		
		//1-1. 객체생성 : 매개변수 생성자
		_03_Profile detail1 = new _03_Profile("임꺽정", 43, "한양");
		
		
		//2-1. 메소드 호출 : 출력정보
		detail1.getInfo();
	}
}
