package ch05;

public class _10_SchoolMain {
	public static void main(String[] args) {

		_10_School sc = new _10_Middleschool("강서중학교", "가4545", "이정섭", 2, 80);
		System.out.println(sc);
		
		sc.getTest(sc);
		sc.getTest(new _10_Middleschool());

		
		_10_School sv = new _10_College("울산대", "나4555", "김대근", 4, 'B');
		System.out.println(sv);
		
		sv.getTest(sv);
		sv.getTest(new _10_College()); //new 연산자는 참조변수
		//_10_School = new _10_College();

		/* _10_Middleschool mid = new _10_Middleschool("가산중학교", "12", "ㅇㅇ", 3, 45); */

		// _10_School school = new _10_School(); //다형성

	}

}
