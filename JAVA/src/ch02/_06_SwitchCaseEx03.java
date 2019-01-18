package ch02;

import java.util.Scanner;

public class _06_SwitchCaseEx03 {
	
	public static void main(String[] args) {
		/*
		 * 시험문제2)
		 * 성적에 따라 학점 구하기
		 * 1. 점수를 입력받는다.(score)
		 * 2. 학점을 구한다.(grade)
		 * 	90점 이상 : A
		 * 	80점 이상 : B
		 * 	70점 이상 : C
		 * 	60점 이상 : D
		 * 	60점 미만 : F
		 * 	출력결과 문장은 1번만 출력 ==> 점수:score, 학점:grade
		 * 3. 자원해제
		 * 
		 */
		Scanner input = new Scanner(System.in);
		System.out.print("점수를 주세요 :");
		int score = 0;
		char grade = ' ';
		score = input.nextInt(); 
		
		if(score>100 || score<0) {
			System.out.println("입력오류");
		} else {
			switch(score/10) {
				case 10:
				case 9:
					grade ='A';
					break;
				case 8:
					grade ='B';
					break;
				case 7: 
					grade ='C';
					break;
				case 6: 
					grade ='D';
					break;
				default :
					grade ='F';
					break;
			} //switch77
			System.out.println("점수 :"+score+"\n학점:"+grade);
		}
	}
}
