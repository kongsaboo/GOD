package ch05;

public class _06_Computer extends  _06_electroMachine{
	
		// 멤버변수
		private int point;
		
		//기본생성자
		public _06_Computer() {
			
			
		}
	
		//매개생성자 .. 전달하는  매개변수가 기초변수인 경우, 변수의 값이 매개변수로 복사됨
		public _06_Computer(String name, String  brand, int price, int point) {
			super(name, brand, price);
			this.point = point;
		}

		
		
		//멤버메소드 getter
		public int getPoint() {
			return point;
		}
		
		
		//출력정보 
		@Override
		public String toString() {
			return "[name=" + getName() + ", brand=" + getBrand() + ", price=" + getPrice() + ", point="+getPoint()+"]";
		}
		}
		
		
		

