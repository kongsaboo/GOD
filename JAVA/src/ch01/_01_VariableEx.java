package ch01;

public class _01_VariableEx {

	public static void main(String[] args) {
		/*
		 * 메소드명, 변수명은 소문자로 시작한다. (cf. 클래스 명은 대문자 시작한다.)
		 * 변수 : 데이터를 담는 그릇이며, 데이터의 저장과 참조를 위해 메모리 공간을 할당받는다.
		 *       반드시 먼저 선언 : 컴파일러는 변수의 자료형에 맞는 기억공간을 미리 확보
		 *       선언 : 자료형 변수명; 예) int a = 0;
		 *       선언과 동시에 할당 : 자료형 변수형 = 초기화; 예) int a = 8;
		 *       
		 * 1. 기본자료형(Primitive type) : 실제값이 저장
		 *    정수 : byte(1바이트) -> short(2바이트) -> int(4바이트) -> long(8바이트)
		 *    실수형 : float(4바이트) -> double(8바이트)
		 *    문자형 : char(2바이트)
		 *    부울형 : boolean(true / false)
		 *        
		 * 2. 참조형(Reference type) : 실제 객체를 가리키는 주소값 저장
		 *    클래스, 인터페이스, 배열
		 *    
		 * 문자열 : String 클래스
		 */
		int a = 8; // 변수 선언, 초기화
		int b = 4;
		
		System.out.println("=== int형 변수 ===");
		int addR = a + b; // 12
		int subR = a - b; 
		int mulR = a * b;
		int divR = a / b;
		
		System.out.println("a : " + a); // a : 8
		System.out.println("b : " + b); // b : 4
		System.out.println("addR : " + addR); // result : 12 
		System.out.println("subR : " + subR);
		System.out.println("mulR : " + mulR);
		System.out.println("divR : " + divR);
		
		
		System.out.println("=== char형 변수 ===");
		char c = 'k'; // ''빈칸줄것
		System.out.println("c : " + c);
		
		System.out.println("문자열 출력");
		
		String s = "java";
		System.out.println("s : " + s);
		
		System.out.println("=== 실수형 출력 ===");
		double r = 99.9;
		System.out.println("r : " + r);
		
		float f = 3.14f; //float형은 값뒤에 f를 붙여준다.
		System.out.println("f : " + f);
		
		System.out.println("=== 부울형 출력 ===");
		boolean t1 = true;
		boolean f1 = false;
		
		System.out.println("t1 : " + t1);
		System.out.println("f1 : " + f1);
		
	}
}
