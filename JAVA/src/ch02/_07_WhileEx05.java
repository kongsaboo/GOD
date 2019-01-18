package ch02;

import java.util.Scanner;

public class _07_WhileEx05 {
	public static void main(String[] args) {
		/*
		 * break : 반복루프를 종료시킨다 continue : 현재의 반복을 종료하고 다음 반복을 다시 시작 (continue 아래 문장을
		 * 스킵하고, 반복)
		 */
		// 평균을 구한다.(score 입력값/ total 합계/ count 인원수)
		// 음수를 입력하면 반복 루프를 종료한다.
		int count = 0;
		int score =0;
		int total = 0;

		Scanner input = new Scanner(System.in);
		
		

		while (true) { //while문은 조건이 true인 동안 실행되므로 무한루프를 돈다.
			System.out.println("숫자를 입력하세요.");
			 score = input.nextInt();
			 
			 if(score<0)break;
			 total += score; // total = total+score;
			 count++; // 인원수
		}
			System.out.println("평균:"+ total/count);
	}
}
