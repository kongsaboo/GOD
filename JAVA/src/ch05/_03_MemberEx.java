package ch05;

public class _03_MemberEx {

	public static void main(String[] args) {
		
		_03_Sawon sa = new _03_Sawon();
		
		sa.setSabun(11254874);
		sa.setName("이정섭");
		sa.setAddress("서울시 구로");
		
		sa.setSalary(5000);
		sa.setSundang(200);
		sa.printmemInfo(); //부모출력
	
		
		
		//sa.SaInfo();  // 자식(sawon)출력
		
		System.out.println("===================================");
		_03_Manager mana = new _03_Manager();
		
		mana.setSabun("가01554787");
		mana.setName("김정남");
		mana.setAddress("서울시 영등포구");
		
		mana.setSalary(4000);
		mana.setBonus(350);
		mana.printmemInfo(); //부모출력
		
		
		//mana.MMinfo(); // 자식(manager)출력
	}
}
