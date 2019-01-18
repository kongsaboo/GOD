package ch11;

public class _03Equals {
	public static void main(String[] args) {
		/*
	 * 문자열(String)비교
	 * equals와 ==의 차이점
	 * 
	 * 1) 형태의 차이
	 * 	equals()는 메소드이다. 객체끼리 내용을 비교할 수 있도록 한다.
	 * '=='은 비교연산자이다.
	 * 
	 * 2) 내용비교와 주소비교
	 * 	- equals() : 비교대상의 내용자체를 비교
	 * 	- 	==	   : 비교대상의 주소값 비교
	 * 
	 */
		String a = "aaa"; //a = 주소값 : 100
		String b = a;	//b= 주소값 : 100
		String c = new String("aaa"); //c=주소값 : 200 -> new 한순간 새로운 주소값이 만들어지기 때문
		String d = "aaa";// d="aaa" 문자열의 주소값을 int d에 대입?
		System.out.println(a==d); //a의 주소값은 d랑 같다
		System.out.println(c.equals(b));
	}
}
