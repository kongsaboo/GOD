package REVIEW;

import java.util.Scanner;

public class _02ExceptionEx_Name {
	static Scanner input = new Scanner(System.in);
	
	static String readName() throws Exception{
		String name = " "; // 멤버변수를 와일문 밖에다 줘야 else에 리턴줄에서 반복을 멈춘다.
		
		while(true) {
		System.out.print("당신의 이름은? :" );
		name= input.nextLine();
		if(name.length()<2) {
			throw new Exception ("이름은 외자를 포함 총 2자 이상입니다."); //익셉션이라는 생성자의 매개내용을 넘겨준다 
			
		} else {
			System.out.println(name);
			break;
		}
		}
		return name;
	}
	
	
	public static void main(String[] args) {
		try {
			String name =readName();
			System.out.print("그대의 이름은? :" +name);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			input.close();
		
		}
	}
}
