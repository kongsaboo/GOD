package ch04;

public class _01_Tv {
		/*
		 * 클래스 : 객체에 대한 설계도, 디자인, 틀, 청사진
		 * 			- 멤버변수(속성, 필드)+ 멤버메소드(동작, 기능)+ 생성자
		 * 클래스는 설계도이며, 객체는 이 설계도를 바탕으로 만들어진 메모리 공간
		 * 그 결과로 주소값을 가지며, 참조변수에 할당 된다.
		 */
			//멤버변수 -- 멤버변수는 보완을 잘해야함(private)
			//프라이베잇으로 설정해놓으면 메인에서 값을 설정하면 오류남
			private int channel; 	//채널번호 
			int volume;  	//볼륨
			boolean onOff;	//전원상태
			
			//생성자 : new 연산자에 의해 호출, 초기화역할
			public _01_Tv() {
				System.out.println("기본생성자");
				
				volume=10 ;
				channel=7 ;
				
			}
	
			//멤버메소드
			public void channelUp() {
				channel++;
				System.out.println("channelUp() : "+channel);
				
				
			}
			
			public void channelDown() {
				channel--;
				System.out.println("channelDown()"+channel);
				
			}
			public void volumeUp() {
				volume++;
				System.out.println("volumeUp() : "+volume);
			}
			public void volumeDown() {
				volume--;
				System.out.println("volumeDown"+volume);
				
			}
			
			
}
