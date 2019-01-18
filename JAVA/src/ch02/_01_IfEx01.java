package ch02;

public class _01_IfEx01 {
	public static void main(String[] args) {
		/*
		 * if(조건식1) {  //조건식1이 참인 경우 수행
		 *      명령문1;
		 *      명령문2;
		 *      명령문3;
		 * } else if(조건식2) { // 조건식2가 참인 경우 수행 
		 *      명령문;
		 * } else if(조건식3) { // 조건식 3이 참인 경우 수행     
		 *      명령문;
		 * } else { // 조건식1 또는 조건식2 또는 조건식3이 거짓인경우 수행
		 * 	    명령문;
		 * }
		 */
		int number = -5;
		// number은 양수입니다. / number은 0입니다./ number은 음수입니다.
		if(number > 0) {
			System.out.println(number + "는 양수입니다.");
		} else if(number == 0) {
			System.out.println(number + "는 0입니다.");
		} else {
			System.out.println(number + "음수입니다.");
		}
	}
}
