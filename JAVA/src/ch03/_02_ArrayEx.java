package ch03;

public class _02_ArrayEx {

	public static void main(String[] args) {
		/*
		 * 배열(Array) : 같은 타입의 대량의 데이터를 저장 할 수 있는 저장장소이다. 배열의 인덱스는 0부터 시작 방법 0) 선언과 생성을
		 * 따로한다. int [] scores ; //선언 scores = new int [5]; //생성
		 * 
		 * 방법1) 선언과 생성을 동시에 한다. 배열자료형[] 배열명 = new 배열자료형 [배열크기]; 배열명[index] = 값;
		 * 
		 * 방법2) 선언과 할당을 동시에 한다. 배열자료형[] 배열명 = {값1, 값2, 값3 ...}; //제일많이 사용 but, 선언과 할당을
		 */
		
		//방법1. 과일 5개

		String [] fruits = new String[5];
		
			fruits[0] = "수박";
			fruits[1] = "참외";
			fruits[2] = "멜론";
			fruits[3] = "토마토";
			fruits[4] = "포도";
			
		for (int i=0; i< fruits.length; i++) { //for 함수는 수의 증감을 처리 하기 때문에 숫자형  타입을 넣어야함
			
			System.out.printf("%s ", fruits[i]);
			System.out.println();
		}
		System.out.print(" \n"); 
		
		//방법2. food 5개
		String[] foods = {"스테이크 "+"스시 "+"랍스터 "+"핏자 "+"햄버거 "};
		 for (int i=0; i<foods.length; i++) {
			 System.out.printf("%s",foods[i]+"\n");
		 }
	}
}
