package test;

import java.util.Scanner;

public class sungjuk_Main {
	public static void main(String[] args) {
		Sungjuk sj = new Sungjuk();
		sj.setJava(50);
		sj.setJsp(70);
		sj.setSpring(60);
		sj.getInfo();

		System.out.println();
		
		Sungjuk sj2 = new Sungjuk(50, 20, 99);

		sj2.getInfo();

		System.out.println("===============");
		Scanner input = new Scanner (System.in);
		System.out.println("자바점수 입력하시오: ");
		sj.setJava(input.nextInt());
		sj.setJsp(input.nextInt());
		sj.setSpring(input.nextInt());
		sj.getInfo();
	}
}