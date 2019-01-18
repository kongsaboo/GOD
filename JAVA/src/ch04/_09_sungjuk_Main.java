package ch04;
import java.util.Scanner;

public class _09_sungjuk_Main {
	public static void main(String[] args) {

		// setter 이용
		_09_sungjuk sj = new _09_sungjuk();

		sj.setEng(45);
		sj.setKor(55);
		sj.setMath(44);

		sj.getInfo();
		// 매개 이용
		_09_sungjuk sj2 = new _09_sungjuk(70, 80, 90);
		sj2.getInfo();

		Scanner input = new Scanner(System.in);
	}
}
