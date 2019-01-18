package ch01;

public class _02_constant {
	/*
	 * 상수 : 프로그램이 실행하는 동안, 값이 변하지 않는 수 또는 변경불가능한 수
	 * 		final 키워드는 변수에 값이 대입되고 나면 변수값이 더이상 변경되지 않는다는 의미
	 * 		주로 대문자를 사용
	 */
	public static void main(String[] args) {
		final double PI = 3.14;
		double a = 0.5;
		
		double result = PI * a;
		System.out.println("result : " + result); // 1.57
	}

}
