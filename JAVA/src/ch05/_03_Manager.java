package ch05;

public class _03_Manager extends _03_Member {

	private  int bonus ;
	
		public void setBonus(int bonus) {
		this.bonus = bonus;
	}
		public int getBonus() {
		return bonus;
	}
		//@override -->부모것을 가져다 수정해 쓰겠다.
		public void printmemInfo() {
			System.out.print("사번 : " +getSabun()+
								"\n이름 : "+getName()+
								"\n주소 : "+getAddress()+
								"\n임금 : "+getSalary());
			System.out.println("\n보너스 :"+ getBonus());
		}
}
