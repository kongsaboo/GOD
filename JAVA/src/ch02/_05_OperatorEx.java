package ch02;

public class _05_OperatorEx {
	
	public static void main(String[] args) {
		/*
		 * 연산
		 * 1. 증감연산자
		 * 1) 전위연산자 : y = ++x; ==> ++x; y=x;
		 *    1. x값을 1증가한 후  2. 증가값을 y에 대입
		 * 2) 후위연산자 : y = x++; ==> x=y; x++
		 *    1. x값을 먼저 y에 대입한후 2. x값을 증가 시킨다.
		 */
		System.out.println("== 증감연산자 ==");
		
		int a = 5;
		int nextA = ++a; //전위연산자
		System.out.println("a : " + a);
		System.out.println("nextA : " + nextA);
		
		int b = 5;
		int nextB = b++; //후위연산자
		System.out.println("nextB : " + nextB); //5
		System.out.println("b : " + b); //6
		
		int c=2, d=3, result=0;
		System.out.println(++c + --d * c--); // 3 + 2 * 3 = 9
		System.out.println("c:" + c); //2
		System.out.println("d:" + d); //2
		
		result = ++c + --d * c--;
		System.out.println("result:" + result); // 3 + 1 * 3 = 6
		System.out.println("c:" + c); // 2
		System.out.println("d" + d); // 1
		
		
	}

}
