package test;

public class _04_MemberMain { // 안에 ()넣음
	public void main(String[] args) { // 이하부분 작성 못함

		/*
		 * 객체생성 : 클래스명 참조변수명 = new 생성자(클래스명) 접근 : 참조변수명.멤버변수 ; 참조변수명.멤버메소드; 참조변수명에는 생성한
		 * 객체의 메모리공간 주소값이 들어있다. 앞의 클래스명은 데이터타입이고, 참조변수로 접근할때 사용 뒤의 클래스명은 메모리에 객체생성 시
		 * 사용되는 생성자다.
		 */
		
		//1. 객체생성 : 클래스명 참조변수명 = new 클래스명();
		_04_Member mm = new _04_Member();
		
		//2. 참조변수명.멤버메소드
		mm.getDetail();
		
		//1-1,2 
		_04_Member mm1 = new _04_Member();
		mm1.getDetail();
	}
}
