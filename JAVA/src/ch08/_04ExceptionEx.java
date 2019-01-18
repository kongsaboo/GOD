package ch08;

import java.util.Scanner;

public class _04ExceptionEx {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) { //main에도 트라이캐치가 없을경우 throws Exception 하면 JVM(메인의 상위위치)에게 예외처리를 넘긴다.
		
		try {
			readAge();  //사건 발생1
		}catch (ArithmeticException e) {//사건 발생4// ArithmeticException e = new ArithmeticException(); 
			//e.printStackTrace();
			System.out.println(e.getMessage()); //사건발생의 2의 메시지  출력
		}finally {  //사건 발생5
			scan.close();
		}
		System.out.println("정상종료"); //사건 발생6
	}

	//throws 예외 : 예외를 넘긴다. 
	
	
 	static void  readAge() throws ArithmeticException{//사건 발생3 //메소드에서 예외를 던저주는 것은  throws
	 System.out.println("나이를 입력하세요.");
	 
	 int age = scan.nextInt();
	 if (age<0) {
		throw new ArithmeticException("나이는 0살 이상입니다."); //사건 발생2 // 예외 발생(강제적 생성으로 인한) : throw 예외
	 
		
	 }else {
	 System.out.println("나이 : "+ age);
 	}	 
 		}
			}