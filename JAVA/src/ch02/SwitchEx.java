package ch02;

import java.util.Scanner;

public class SwitchEx {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("오늘은 몇월 인가요?");
		int month = 0;
		String season = " ";
		month = input.nextInt();

		if (month > 12 || month < 0) {

		} else {
			switch(month) {
			case 3: 
			case 4:
			case 5: 
				season = "봄";
				break;
			case 6:
			case 7:
			case 8:
				season = "여름";
				break;
			case 9:
			case 10:
			case 11:
				season = "가을";
				break;
			default :
				season = "겨울";
				break;
			}
			System.out.println(season+month);
		}

	}
}
