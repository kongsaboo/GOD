package ch03;

public class _01_ArrayEx {

	/*
	 * 배열(Array) : 같은 타입의 대량의 데이터를 저장 할 수 있는 저장장소이다. 배열의 인덱스는 0부터 시작 방법 0) 선언과 생성을
	 * 따로한다. int [] scores ; //선언 scores = new int [5]; //생성
	 * 
	 * 방법1) 선언과 생성을 동시에 한다. 배열자료형[] 배열명 = new 배열자료형 [배열크기]; 배열명[index] = 값;
	 * 
	 * 방법2) 선언과 할당을 동시에 한다. 배열자료형[] 배열명 = {값1, 값2, 값3 ...}; //제일많이 사용 but, 선언과 할당을
	 * 별도로 분리하면 에러
	 */

	public static void main(String[] args) {

		// 방법1.
		// 배열자료형[] 배열명 = new 배열자료형 [배열크기];
		// 배열명[index] = 값;

		int[] scores = new int[5];
		scores[0] = 100;
		scores[1] = 90;
		scores[2] = 80;
		scores[3] = 70;
		scores[4] = 60;

		for (int i = 0; i < scores.length; i++) { // scores.length =5 //배열의 길이가 5이기 때문

			System.out.print(scores[i] + " \n");

		}
		System.out.println();

		/*
		 * for (int i =0; i<scores.length ; i++) { System.out.println(scores[i] + " ");
		 * 
		 * }
		 */
		// 방법2) 선언과 할당을 동시에 한다. 배열자료형[] 배열명 = {값1, 값2, 값3 ...}; //제일많이 사용
		int[] scores1 = { 90, 80, 70, 60 };

		for (int i = 0; i < scores1.length; i++) {
			System.out.print(scores1[i] + " ");

		}
		System.out.println("\n ");

		int[] s = new int[9];
		s[0] = 10;
		s[1] = 20;
		s[2] = 30;
		s[3] = 40;
		s[4] = 50;
		s[5] = 60;
		s[6] = 70;

		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");

		}
		System.out.println(" \n"); // print는 다음문이 이어서 시작 // println은 앞문장 끝 엔터하나 = print("\n ")

		int[] ss = { 22, 45, 45, 78, 77, 12, 44, 12, 90 };
		for (int i = 0; i < s.length; i++) {
			System.out.println(ss[i] + " ");

		}

	}

}