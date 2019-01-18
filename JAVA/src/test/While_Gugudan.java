package test;

public class While_Gugudan {
	public static void main(String[] args) {
		/*
		 * 
		 * 
		 */

		int dan=2;
		// System.out.println()
		// while(dan<10){
		// i++; while 이중while문의 형식을 까먹음-
		while (dan < 10) {
			System.out.println("-------"+dan+"단------");
			int j=1;
			while(j<10) {
				System.out.println(dan + "*" + j + "=" + (dan*j));
				j++;
			}
			
		
			dan++;
		}
	}
}
