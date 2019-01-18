package ch02;

public class _08_ForEx03 {
	public static void main(String[] args) {
		// 1~10까지 합을 구하라

		// int sum =0;
		for (int i = 1, sum = 0; i <= 10; i++) {
			sum += i;
			System.out.println("i= "+i +  "일때"   + "\tsum+i= " +(sum));

		}
			//System.out.println("=========");
			//for(;;)System.out.println("hello"); // 무한루프
		
	}
}
