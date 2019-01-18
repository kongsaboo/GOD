package ch02;

import java.util.Scanner;

public class _07_WhileEx04 {
	public static void main(String[] args) {
		/* 시험문제 4번
		 * 2-9단 출력 초기값 --> 조건식 --> 증감식
		 */

		// int dan = 5;
		int k = 2;
		while (k <= 9) {
			// 2

			System.out.print("--------" + k + "단---------");
			System.out.println();
			int i = 1;
			while (i < 10) {
				System.out.println(k + "*" + i + "=" + (k * i));
				i++;
			}
			k++;
		}

	}

}
