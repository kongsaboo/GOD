package ch01;

public class _06_TypeCasting {
	public static void main(String[] args) {
		/* 형 변환 p81.
		 * 1. 자동 형변환(확대 형변환 || 묵시적 형변환)
		 * 		데이터가 손실되지 않거나, 손실이 제한적인 범위 내에서 묵시적으로 형변환
		 * 		자료형이 다른 변수에 값을 할당하는 경우, 형변환을 생략 할 수 있다.
		 * 
		 * 		데이터가 큰 타입으로 작은 타입을 할당 한다.
		 * 		큰데이터 타입= 작은 데이터 타입(예: float f(변수명) =10;)
		 * 		자료형이 다른 값을 연산하는 경우; (예: double d(변수명)= 10.0+20;)
		 * 
		 * 2. 강제 형변환(축소 형변환 || 명시적 형변환)
		 * 		명시적으로 형변환 하는 것을 캐스팅(casting)이라고 한다.
		 * 		casting은 생략 X, 생략시 컴파일 에러 발생 --> 반드시 명시적 형변환 필요
		 * 		강제로 형변환 하므로 데이터 손실 위험이 있음
		 * 
		 * 		데이터 작은 타입 = (작은 타입)데이터 큰타입;
		 *  
		 */
		System.out.println("형변환-1 예제");
		
		int j= (int)10.9; // 강제 형변환(축소 형변환) : 데이터 작은 타입 int j = (작은타입)데이터 큰 타입
		System.out.println("j : "+j);
		
		double d= 10; // 자동(확대)형변환 : 데이터 큰 타입 = 데이터 작은 타입; 
		System.out.println("j : "+d); // 10.0
		
		float f = 20.5f + 10; // 10 이 10.0으로 바뀐다. 20.5+10.0 = 30.5
		System.out.println("f : "+f);
		
		/*형변환 -2
		 * 
		 * 3. int(4byte)보다 크기가 작은 자료형은 int형으로 형변환 한 후 계산
		 * 	예) byte + short -> int + int
		 * 
		 * 4. 두개의 피연산자 중 표현 범위가 큰 쪽에 맞춰서 형변환 한 후 계산
		 * 
		 */
		System.out.println("===형변환 -2 예제");
		
		int ii ; 
		double ff ;
		
		ff= 5/4; // if, ii 였다면 정수인 1만  표현됨 / 작은데이터가 큰데이터로 간 자동 형변환 경우
				// (double = int);
		System.out.println("ff : "+ff);
		
		ff= (double)5/4; //여기서 4가 int형인 이유는 정수이기 때문!! 
						//4번 적용.. double / int -> double/ double--> 5.0/4.0
		System.out.println("ff : " + ff);
		
		System.out.println("----------------");
		
		ii= (int)2.5 +(int)3.1; // ==> ii= (int)(2.5+3.1)= (int)(5.6)
		System.out.println("ii :"+ii);// 괄호안을 먼저 계산하기 때문
		//ii = (int)2.5+3.1; // error... int = (int) double + double 이기 때문
		
		System.out.println("=============");
		
		int gg = 1000000; // int형 출력 범위 초과했다(-21억~21억)--> 이상한 값 출력됨
		int hh = 2000000;
		long ll = 2000000L;
		
		int c1 = gg* hh;
		System.out.println("c1:"+c1);
		
		long c2 = gg*hh;
		System.out.println("c2 : "+c2); //long형에 대입하기 전부터 int형 초과
		
		long c3 = (long)(gg*hh); // 괄호 우선이기 때문에 오류가 난다.(long)(int*int)
		System.out.println("c3 :" +c3);
		
		long c4 = (long) gg*hh;// long *int-> long*long->long
		System.out.println("c4 : "+c4);
		
		long c5 = gg*ll; // ?여기서 ll은 롱변수?int* long -> long*long -> long
		System.out.println("c5 : "+c5);
		
	}
}
