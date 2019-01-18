package ch11;

import java.util.Scanner;

public class _02StringEx {
	public static void main(String[] args) {
		
	
	String str = " ";
	Scanner scan = new Scanner(System.in);

	while(true) {
		System.out.print("값을 입력 하세요(quit-종료)");
		str = scan.nextLine();
		//str이 quit일때 종료한다.
		if(str.equals("quit")){
			System.out.println("입력종료");
			break;
		}
	}
	}
}
