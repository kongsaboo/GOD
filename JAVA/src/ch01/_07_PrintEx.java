package ch01;

public class _07_PrintEx {
	public static void main(String[] args) {
		/*
		 * printf(형식지정자, 값 또는 변수)
		 * -  형식지정자
		 * %d : 정수를 출력한다. 예) System.out.printf("%d", 10);
		 * %f : 실수를 출력한다. 예) System.out.printf("%f", 3.14);
		 * %c : 문자를 출력한다. 예) System.out.printf("%c", 'k');
		 * %s : 문자열을 출력한다. 예) System.out.printf("%s", "hello");
		 */
		double value = 1.0 /3.0;
		System.out.println("value : "+value);//0.33333333 -->소수점 아래를 조절하는 법
		System.out.printf("%f",value); //기본이 소수점 6자리 까지 출력함 
		
		System.out.println();
		
		//%6.2f : 소수점 이하는 2자리로  표현.. 전체 6자리 중 2자리로 표현..(앞은 공백으로 처리)
		//자릿수 부족시 공백 --> 숫자는 뒤에서 부터 채워짐
		System.out.printf("%6.2f",value);
		
		System.out.println();
		
		// "900101" <-- 주민번호 앞 6자리
		System.out.printf("%f","900101");
	}
}
