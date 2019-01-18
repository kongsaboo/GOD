package ch04;

public class _01_TvMainEx {
	public static void main(String[] args) {
		/*
		 * 객체생성 : 클래스명 참조변수 명 = new 생성자(클레스명) 접근 : 참조변수명.멤버변수; 참조변수명.멤버메소드;
		 * 
		 * 참조변수명에는 생성한 객체의 메모리공간 주소값이 들어 있다. 앞의 클래스명은 데이터타입이고, 참조변수로 접근할 때 사용이 된다. 뒤의
		 * 클래스명은 메모리에 객체생성 시 사용되는 생성자다.
		 */
		//객체생성 : 클래스명 참조변수 명 = new 생성자(클레스명);
		_01_Tv tv = new _01_Tv(); //new 다음에는 기본 생성자를 호출한다.
		
		
		//참조변수명. 멤버변수
		//tv.channel = 7; 
		//System.out.println("텔레비전의 채널은"+tv.channel);
		
		//참조변수명.멤버메소드
		tv.channelUp();
		tv.channelDown();
		
		//tv.volume = 451;
		tv.volumeUp();
		tv.volumeDown();
	}
}
