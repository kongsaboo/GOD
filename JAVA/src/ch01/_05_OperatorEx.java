package ch01;

public class _05_OperatorEx {
	public static void main(String[] args) {
		/*
		 * 
		 */
		System.out.println("===사칙연산자 예제");
		int i = 4;
		int j = 2;

		int sum = i + j;
		int sub = i - j;
		int mul = i + j;
		int div = i / j;
		int mod = i % j;
		System.out.println("sum=" + sum);
		System.out.println("sub=" + sub);
		System.out.println("mul=" + mul);
		System.out.println("div=" + div);
		System.out.println("mod=" + mod);
		/*
		 * 연산 2. 관계연산자: 같다(==), 같지 않다(!=),>,<,>=,<= cf) =: 대입연산자
		 * 
		 */
		System.out.println("관계연산자 예제");
		int c1 = 5;
		int c2 = 10;
		System.out.println("c1==c2 : " + (c1 == c2));// False
		System.out.println("c1 != c2 : " + (c1 != c2));// true
		System.out.println("c1<c2 : " + (c1 < c2));// false
		System.out.println("c1>=c2 : " + (c1 >= c2));// False
		System.out.println("c1<=c2 : " + (c1 <= c2));// true
		/*
		 * 연산 3. 대입연산자
		 */
		System.out.println("대입연산자 예자");

		int x = 5;

		x += 10;// x= x+10
		System.out.println("x=" + x);// 15
		x -= 10; // x=x-10;
		System.out.println("x=" + x);// 5

		x *= 10; // x=x*10;
		System.out.println("x=" + x);// 50

		x /= 10; // x= x/10;
		System.out.println("x=" + x);// 5

		x %= 10; // x=x%10;
		System.out.println("x=" + x);// 5
		/*
		 * 연산 5. 논리연산자 and 연산자(논리곱, &&) : x && y --> x와 y 모두 참이면 참, 그렇지 않으면 거짓 or
		 * 연산자(논리합,||) : x||y--> x나 y중에서 하나만 참이면 참, 모두 거짓이면 거짓
		 */
		System.out.println("논리연산자 예제");
		int x1 = 3, y1 = 4;
		System.out.println((x1 == 3) && (y1 == 4));// T&&T-->T x1이 3이고 Y1이 4 인지 물어봄
		System.out.println((x1 == 3) && (y1 == 7));// T&&F --> F

		System.out.println((x1 == 5) || (y1 == 6));// F||F -->F
		System.out.println((x1 == 3) || (y1 == 7));// T||F -->T
		
		/*
		 *연산
		 *6. 삼항연산자 : 항이 3개인 연산자
		 *				조건? 수식1: 수식2;
		 *				조건이 참이면 -->수식1
		 *					  거짓   -->수식2
		 * 
		 */
		System.out.println("---삼항연산자---");
		
		int x2, y2, z2;
		x2=10 ;
		y2=20;
		
		z2=(x2>y2)? x2: y2;// x2가 y2보다 큰지 물음
		System.out.println("z2="+z2);// 20
		
		System.out.println("===========");
		
		
		//score 가 60 이상이면 "합격" 그렇지 않으면 "불합격" 을 result2 변수에 출력
		int score =20;
		String result2; // 변수선언!!! 변수를 만들어서 값을 넣기전에
		result2= (score>=60)? "합격" : "불합격";
		System.out.println("결과= "+result2);
		
		// 삼항연산자를 if 문으로 
		if(score>=60) {
			result2 = "합격";
			
			
		}else {
			result2="불합격";
		}
		System.out.println("결과= "+result2);
		
		/*
		 * 6-3. 삼항연산자
		 * score가 60점 이상이면 "합격", 60점 미만이면 "불합격", 40점 미만이면"과락"을 result3변수에 출력
		 */
		String result3; // 변수 값이 문자열이기 때문에 String을 이용
		result3 = (score>=60)? "합격" :((score>=40)? "불합격" : "과락"); // 불합격: 과락에 괄호를 주어서 else의 표현을 해준다??
		System.out.println("결과= "+result3);
		//6-4 if문으로 
		
		if (score>=60) {
			result2= "합격";
		} else  if(score>=40) {
			result2="불합격";
			
		} else {
			result2="과락";
		}
		System.out.println("결과 = "+result2);
	}

}
