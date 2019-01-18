package ch02;

public class _08_ForEx04 {
	public static void main(String[] args) {
		// 1-20까지의 짝수의 합계
		for (int i = 0, sum = 0; i <= 20; i += 2) {
			sum += i;
			System.out.println("i=" + i + " sum=" + sum);
		}
	}
}
