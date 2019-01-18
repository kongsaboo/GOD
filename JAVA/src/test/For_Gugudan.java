package test;

public class For_Gugudan {
	public static void main(String[] args) {
		int dan;
		int i=0; // 초기화 식 0 넣어야됨 
		System.out.println("****구구단****");
		for (dan = 2; dan < 10; dan++) {
			System.out.println("-------" + dan + "단------");
			for (i = 1; i < 10; i++) {
				System.out.println(dan + "*" + i + "=" + (dan * i));

			}
		}
		//System.out.println(dan + "*" + i + "=" + (dan * i));// 위치오류

	}
}
