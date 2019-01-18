package ch02;

public class _09_DoWhileEx01 {
public static void main(String[] args) {
	/*
	 * do-while문 : 반드시 1번은 수행해야 하는 경우 사용
	 * 조건이 만족하지 않을 때 블록을 빠져 나간다.
	 * 데이터를 처리하기 전에 사용자로부터 메뉴나 데이터를 입력받아야 하는 경우 많이 사용
	 * do{
	 * 		명령문1;
	 * 		명령문2;...
	 * }while(조건);
	 */
	int i=20;
	do {
		System.out.println("i의 값: "+i);
		i++;
	} while (i<10);

}

}
