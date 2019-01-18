package ch02;

import java.util.Scanner;

public class _04_IfEx01 {

	public static void main(String[] args) {
		
		int num;
		char h;
		char ox;
		
		Scanner input = new Scanner(System.in);
		System.out.println("합격일까요?");
		num = input.nextInt();
		if(num > 100 || num < 0) {
			System.out.println("범위숫자 초과");
	} else {
		if (num >= 90) {
			h = 'A';
		} else if (num >= 80) {
			h = 'B';
		} else if (num >= 70) {
			h = 'C';
		} else if (num >= 60) {
			h = 'D';
		} else {
			h = 'F';
		} if (num >= 60) {
			ox = '합';
		} else {
			ox = '불';
		} System.out.println("당신은: " + "("+ h +") ("+ ox +") 입니다.");
	
	}
}

}
