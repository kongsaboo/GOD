package ch11;

public class _05Main {
	
	/*
	 * enum : 열거형
	 * 1. 정의 : 여러개의 상수들을 모아서 만든 객체를 의미
	 * 2. 작성방법 : enum 열거형명{상수1, 상수2, 상수3, ...}
	 * 3. 용도 : 제한된 상수값만을 사용하고자 할때
	 * 4. 접근방법 : 열거형명.상수
	 * 5. 특징 : switch(변수)에서 변수타입으로 enum을 사용할 수 있다.
	 * 			ordinal()메소드를 이용해서 순서값을 얻어 올 수 있다.
	 * 			ordinal()은 0부터 시작한다.
	 */
	public static void main(String[] args) {
		System.out.println(_05Week.SUN);
		System.out.println(_05Week.SUN.ordinal());
		System.out.println(_05Week.MON.ordinal());
		System.out.println("=======================");
		String week = " ";
		switch(_05Week.SAT) {
			case SUN:
				week = "일";
				break;	
			case MON :
				week = "월";
				break;
			case TUES :
				week = "화";
				break;
			case WED :
				week = "수";
				break;
			case THUR :
				week = "목";
				break;
			case FRI :
				week = "금";
				break;
			default :
				week = "토";
				break;
		}
		System.out.println(week);
	}
}
