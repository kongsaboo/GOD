package ch02;

import java.util.Scanner;

public class _05_IfEx01 {
	
	public static void main(String[] args) {
		/*
		 * 시험문제1)
		 * 성적에 따라 학점구하기
		 * 1. 점수를 입력받는다.(score)
		 * 2. 학점을 구한다. (grade)
		 * 	  90점이상 : A
		 * 	  80점이상 : B
		 *    70점이상 : C
		 *    60점이상 : D
		 *    60점미만 : F
		 *    출력결과 문장은 1번만 출력 ==> 점수 : score, 학점 : grade
		 * 3. 자원해제
		 */
     Scanner input = new Scanner(System.in);
     System.out.println("점수를 입력하세요.==>");
     int score = input.nextInt();
     
     char grade = ' ';
     if(score > 100 || score < 0) {
    	 System.out.print("잘못된 점수입니다.");
     } else {
    	 if(score >= 90) {
    		 grade = 'A';
	     } else if(score >= 80) {
	    	 grade = 'B';
	     } else if(score >= 70) {
	    	 grade = 'C';
	     } else if(score >= 60) {
	    	 grade = 'D';
	     } else {
	    	 grade = 'F';
	     }
    	 
    	 System.out.println("점수 : " + score + "\n학점 : " + grade);
     }
     
     System.out.println("프로그램이 종료되었습니다");
     input.close();
	}//main

}//class
