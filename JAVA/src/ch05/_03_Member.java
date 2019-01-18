package ch05;

public class _03_Member {

	//멤버변수
		private String Sabun;
		private String name;
		private String address;
		private int salary;
		
		public  _03_Member() {
			
		}
		public void setSabun(String Sabun) {
			this.Sabun = Sabun;
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
		
		public String getSabun() {
			return Sabun;
		}
		public String getName() {
			return name;
		}
		public String getAddress() {
			return address;
			
		}
		public int getSalary() {
			return salary;
		}
		public void printmemInfo() {
			System.out.print("사번 : " +getSabun()+
								"\n이름 : "+getName()+
								"\n주소 : "+getAddress()+
								"\n임금 : "+getSalary());
			
		}
		
		
}
