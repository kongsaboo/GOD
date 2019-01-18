package ch02;

import java.util.Scanner;

public class _08_ForEx01 {
	public static void main(String[] args) {
		/*
		 * 반복문 - 조건이 만족하는 동안 실행
		 * 
		 * 출력할 구구단을 입력(dan) For(초기값;조건식;증감식){ 수행할 문장; } //
		 * 
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("몇단?");
		int dan = input.nextInt();
		for (int i = 1; i < 10; i++) {
			int result = dan* i ;
			System.out.println(dan + "*" + i + "=" + result);
		}
	}
}
