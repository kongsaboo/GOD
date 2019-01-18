package ch01;

import java.util.Scanner;

public class _04_InOutEx {
	
	public static void main(String[] args) {
		
	String name = "";
    int age; 
    
    Scanner input = new Scanner(System.in);
	System.out.print("이름을 입력하세요!!");
	name = input.next();
	
	System.out.print("20");
	age = input.nextInt();
	
	input.close();
	
	
					
	}

}
