package ch05;

public class _04_Manager extends _04_Member {

	private  int bonus ;
	
		public void setBonus(int bonus) {
		this.bonus = bonus;
	}
		public int getBonus() {
		return bonus;
	}	
		
		
		public _04_Manager() {
			//부모 기본생성자 호출(메인에서 기본생성자 호출->부모 기본생성자 호출->자식 기본생성자 호출)
			//super(); //부모의 기본생성자 호출
						//생략해도 부모기본생성자는 호출된다.
			
		}
		//매개변수 생성자 : 생성자->매개변수->멤버변수
		public _04_Manager(int sabun, String name, String address, int salary, int bonus) {
			
			super(sabun, name, address, salary); //부모호출은 super(); 생성자는 항상 첫줄
			this.bonus =bonus; //자식은 this.
			
		}
		
		//@override -->부모것을 가져다 수정해 쓰겠다.
		public void printmemInfo() {
			super.printmemInfo();
			/*System.out.print("사번 : " +getSabun()+
								"\n이름 : "+getName()+
								"\n주소 : "+getAddress()+
								"\n임금 : "+getSalary());*/
			System.out.println("\n보너스 :"+ getBonus());
		}
}
