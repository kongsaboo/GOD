package ch01;

import java.util.Scanner;

public class _03_InoutEx {
	
	public static void main(String[] args) {
		/*
		 * 변수
		 * 1. 기초형(primitive type) : 실제값이 저장
		 *  - 데이터타입 변수명 = 값;
		 *    int a = 3;
		 *    
		 * 2. 참조형(Reference type) : 실제 객체를 가리키는 주소 저장
		 *  - 클래스, 인터베이스, 배열
		 *  - 클래스인 경우
		 *    클래스명 참조 변수명 = new 클래스명();
		 *    예) Scanner input = new Scanner(System.in);
		 *    - 참조변수명에는 객체를 가리키는 주소값이 들어있다.
		 */
		Scanner input = new Scanner(System.in);
		
		int x = 0; // 첫번째 숫자 저장
		int y = 0; // 두번째 숫자 저장
		int sum = 0; // 두수의 합
		
		System.out.print("첫번째 숫자를 입력하세요!!");
		x = input.nextInt(); // 콘솔에서 입력받은 첫번째 숫자를 읽어서 x에 저장
		
		System.out.print("두번째 숫자를 입력하세요!!");
		y = input.nextInt(); // 콘솔에서 입력받은 두번째 숫자를 읽어서 y에 저장
		
		sum = x + y;
		System.out.println("합계 : " + sum);
		
		System.out.println(" 프로그램 종료!!");
		input.close(); 
		
	
		
	}

}
