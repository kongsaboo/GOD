package ch02;

import java.util.Scanner;

public class _Ex_Switche {

	public static void main(String[]args) {
		/*
		 * 3~5 봄
		 * 6~8 여름
		 * 9~11 가을

		 * 12~2 겨울
		 * 유효 1~12
		 */
		Scanner input  = new Scanner(System.in);
		System.out.print("오늘은 몇월 인가요?");
		int month = 0;
		String season = " ";
		month = input.nextInt();
		
		if(month >12 || month<0) {
			System.out.println ("입력오류");
			
		}else {
			switch(month) {
			case 3 : 
			case 4 :
			case 5 :
				season = "봄";
				break;
			case 6 :
			case 7 :
			case 8 :
				season = "여름";
				break;
			case 9 :
			case 10 :
			case 11 :
				season = "가을";
				break;
			default :
				season = "겨울";
				break;
			} 
			System.out.println("계절:"+season+"\n월:"+month);
		}
	
	}
	
	
	
	
}
