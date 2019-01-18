package ch02;

public class _07_WhileEx01 {
 
	public static void main(String[] args) {
		//5회 good day 출력
		/*
		 * 반복문 : 조건식이 참인 동안 반복
		 * 			초기값 -> 조건식 -> 증감식
		 * 초기값
		 * while(조건식){
		 * 		명령문 ;
		 * 		증감 ; }
		 */
		
		int i = 0;
		while (i<5) {
			System.out.println("good-day"+i+1);
			i++;
		}
		System.out.println("반복이 종료되었습니다.");
}
}
