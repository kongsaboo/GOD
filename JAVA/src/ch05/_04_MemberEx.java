package ch05;

public class _04_MemberEx {

	public static void main(String[] args) {
		
		
		/*//setter 이용한 값 전달
		_04_Sawon sa = new _04_Sawon();
		
		sa.setSabun(11254874);
		sa.setName("이정섭");
		sa.setAddress("서울시 구로");
		
		sa.setSalary(5000);
		sa.setSundang(200);
		sa.printmemInfo(); //부모출력
	
		
		
		//sa.SaInfo();  // 자식(sawon)출력
		
		System.out.println("===================================");
		_04_Manager mana = new _04_Manager();
		
		mana.setSabun(554787);
		mana.setName("김정남");
		mana.setAddress("서울시 영등포구");
		
		mana.setSalary(4000);
		mana.setBonus(350);
		mana.printmemInfo(); //부모출력
		*/
		
		//mana.MMinfo(); // 자식(manager)출력
		
		//2_1. 기본생성자 호출
		_04_Manager man3 = new _04_Manager();
		
		
		//2. 매개변수를 이용한 값 전달
		_04_Manager man2 = new _04_Manager(1000, "홍길동", "가산디지털단지",250000,25000000);
		
		man2.printmemInfo(); //오버라이딩된 자식메서드가 호출된다.
		
		System.out.println("===========");
		
		//1.기본생성자
		_04_Sawon sa1 = new _04_Sawon();
		
		
		//2. 매개생성
		_04_Sawon ss = new _04_Sawon(5000,"반훈","남구로", 45000, 55870);
		
		ss.printmemInfo();
	}
}

