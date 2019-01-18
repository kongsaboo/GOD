package REVIEW;

import java.util.Scanner;

public class _03ExceptionEx {
	static Scanner scan = new Scanner(System.in);  // 스테틱- 해당 클래스의 공통으로 사용한다
	
	public static void main(String[] args) {
		try {
			String name = readName();
			System.out.println("당신의 이름은 : "+ name +"입니다.");
		}catch(_03UserNameException e) {
			System.out.println(e.getMessage());
		}finally {
			scan.close();
		}
	
	}

	
	static String readName() throws _03UserNameException{
		System.out.println("이름을 입력하세요");
		
		String name1 = " ";
		name1 = scan.nextLine();
		
		
		if(name1.length()<3) {
			throw new _03UserNameException();
		}else {
			return name1;
		}
	}
	}

