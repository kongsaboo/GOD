package REVIEW;

public class _09EnumMain {
	public static void main(String[] args) {
		System.out.println(_09EnumWeek1.SUN);
		System.out.println(_09EnumWeek1.FRI);
		System.out.println(_09EnumWeek1.SAT.ordinal()); //순서값을 얻어옴 
		System.out.println(_09EnumWeek1.MON.ordinal());
		
		String week = " ";
		switch(_09EnumWeek1.WED.ordinal()) { //.ordinal이 순서값을 갖는것이기 때문에
		case 0:								//case 값을 숫자로 준다. 순서값을 찾는 경우가 아닌경우
			week= "일";						//상수의 순서대로 케이스에 그 해당값을 넣어주면 된다. 
			break;
		case 1:
			week= "월";
			break;
		case 2:
			week= "화";
			break;
		case 3:
			week= "수";
			break;
		case 4:
			week= "목";
			break;
		case 5:
			week= "금";
			break;
		case 6:
			week= "토";
			break;
		}
		System.out.println("무슨요일? :" +week);
		}
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
}
