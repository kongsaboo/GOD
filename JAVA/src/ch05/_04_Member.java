package ch05;

public class _04_Member {

	//멤버변수
		private int sabun; //protected일때는 super.변수로 부모의 멤버변수 호출 가능
		private String name;
		private String address;
		private int salary;
		
		
		/*
		 * 기본생성자 -- 매개변수 생성자를 작성시 반드시
		 * 기본생성자를 먼저 만들어야 한다.(컴파일러가 자동생성하지 않으므로)
		 */
						
		public  _04_Member() {
			
		}
		
		//매개변수 생성자(자식값 ->매개변수->멤버변수)
		public _04_Member(int Sabun, String name, String address, int salary) {
			this.sabun = Sabun; 
			this.name = name;
			this.address = address;
			this.salary = salary;
		}
		
		/*public void setSabun(int Sabun) {
			this.sabun = Sabun;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setAddress(String address) {
			this.address = address;
		
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		
		public int getSabun() {
			return sabun;
		}
		public String getName() {
			return name;
		}
		public String getAddress() {
			return address;
			
		}
		public int getSalary() {
			return salary;
		}*/
		public void printmemInfo() {
			/*System.out.print("사번 : " +getSabun()+
								"\n이름 : "+getName()+
								"\n주소 : "+getAddress()+
								"\n임금 : "+getSalary());*/
			System.out.print("사번 : " +this.sabun+
					"\n이름 : "+this.name+
					"\n주소 : "+this.address+
					"\n임금 : "+this.salary);
			
		}
		
		
}
