package ch02;

public class _08_ForEx02 {
	public static void main(String[] args) {
/*
 * 시험문제3
 */
		for (int dan = 2; dan < 10; dan++) {
			System.out.println("----------------"+dan+"단--------");
			for (int i = 1; i < 10; i++) {// 1~9
				int result = dan * i;
				System.out.println(dan + "*" + i + "=" + result);

			}
			
		}System.out.println();

	}
}
