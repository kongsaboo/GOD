package ch08;

import java.util.Scanner;

public class _02ExceptionEx {
	
	static Scanner input =new Scanner(System.in);// 두 메소드에 공통으로 스캐너 적용하기 위해 클래스 아래에 넣는다. 이때 메소드들이 스테틱 메소드이기 때문에 스테닉을 앞에 붙여야 함.
	
	public static void main(String[] args) {
	
		try {
			calculate(); 							//실행순서 1
			
			
		}catch (ArithmeticException e) { 			//실행순서 4
			System.out.println(e.getMessage());
			//int result = num%num1 ;
			
		}catch (Exception e) { //부모 익셉션
			System.out.println(e.getMessage());
			
		}finally { 						 			//실행순서 5
			input.close();
		}
		System.out.println("정상종료"); 				//실행순서 6
	}
	
	
		static void calculate() throws ArithmeticException { //실행순서3 ->값을 떠넘긴다 ->메인에 예외처리가 있는 catch 15행으로
		System.out.println("==두개의 정수를 입력 ==");
		
		
		System.out.println("첫번째 값 : ");
		int num = input.nextInt();
		
		System.out.println("두번째 값 : ");
		int num1 = input.nextInt();
		
		System.out.println("몫 : "+ (num/num1)); 	//실행순서 2
		System.out.println("나머지 : "+ (num%num1));
		}
	/*
	 * 예외처리 목적 : 정상종료
	 * 
	 * try{
	 * 		//예외가 발생할 가능성이 있는 코드
	 * }catch(예외종류 참조변수){
	 * 		// 예외를 받아서 처리하는 코드
	 * }finally{
	 * 		//생략가능하며, 예외 발생 유무와 상관없이 무조건 실행한다.
	 * }
	 * 
	 * 예외가 발생안한 경우 : try -> finally -> 정상종료
	 * 예외가 발생한 경우 : try -> catch-> finally-> 정상종료
	 * 
	 * -예외의 종류에 따라서 여러개의 catch 블록이 올 수 있으며,
	 * 이중에서 발생한 예외의 종류와 일치하는 catch 블록만 실행된다.
	 * 단, 일치한 catch 블록이 없고, 부모 Exception catch 블록이 있으면, 다형성에 의해 부모 catch블록이 실행된다.
	 * 
	 * 	같은 try문에 속하는 catch 블록은 위에서 아래로 순서대로 처리된다.
	 * 	따라서 상황에 따른 구체적인 예외클래스를 먼저 작성하고, 일반적인 클래스(=Exception)을 나중에 작성해야 한다.
	 * 	즉, catch 블록을 사용할 때에는 범위가 적은 것부터 큰 순서로 작성한다.
	 */
		
		
		/*System.out.println("목 : "+ (num/num1));
		System.out.println("나머지 : "+ (num%num1));
		*/
		
	}	
	
