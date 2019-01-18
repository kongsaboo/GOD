package ch02;

import java.util.Scanner;

public class _07_WhileEx03 {
	public static void main(String[] args) {
		/*
		 * 출력할 구구단을 입력(dan)
		 */
		Scanner input = new Scanner(System.in);
		System.out.print("단을 입력해 주세요.");

		int dan = input.nextInt();

		int i = 1;

		while (i < 10) {
			int result = dan * i;
			System.out.println(dan + "*" + i + "=" + result);
			i++;

		}

	}
}
