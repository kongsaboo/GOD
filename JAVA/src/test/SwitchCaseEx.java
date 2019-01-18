package test;

import java.util.Scanner;

public class SwitchCaseEx {

	public static void main(String[] args) {
		
		int score = 0;
		char grade = ' ';

		Scanner input = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		
		score = input.nextInt();
		
		if (score > 100 || score < 0) {
			System.out.println("입력오류");

		} else {
			switch (score / 10) {

			case 10:
			case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
				break;
			default:
				grade = 'F';
				break;

			}
			System.out.println("점수" + score + "\n학점" + grade);
		}

	}
}