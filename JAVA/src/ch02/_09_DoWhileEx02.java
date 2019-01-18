package ch02;

import java.util.Scanner;

public class _09_DoWhileEx02 {
	public static void main(String[] args) {
		// 월을 입력 [1~12] 까지, 입력월은 잘못된 월
		int i; //월

		Scanner input = new Scanner(System.in);
		do {
			System.out.println("월을 입렵하시오.");
			i = input.nextInt();

		} while ((i <=12) && (i>=1)); //1~12월은 조건식이 참이면 ,do문장으로 간다.

		System.out.println( i+"월은 잘못된 월입니다." );
	}

}
