package ch01;

public class Hello {

	public static void main(String[] args) {
		for (int y = 0; y < 5; y++) {
			for (int x = 0; x <= y; x++)
				System.out.print("*");

			System.out.println();
		}
		/*
		 * 출력결과
		 *
		 **
		 ***
		 ****
		 ***** 
		 */
		System.out.println("=================");

		for (int y1 = 0; y1 < 5; y1++) {
			for (int x1 = y1; x1 < 5; x1++)
				System.out.print("*");
			System.out.println();
			/*
			 * 
			 */
		}

		System.out.println("=============");

		for (int y2 = 0; y2 < 5; y2++) {
			for (int x2 = 0; x2 <= y2; x2++)
				System.out.print("*");

			System.out.println();
			
			for (int y3 = 0; y3 < 4; y3++) {
				for (int x2 = y3; x2 < 4; x2++)
					System.out.print("*");
				System.out.println();
		}
	}
}
}
