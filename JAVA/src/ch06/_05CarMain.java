package ch06;

public class _05CarMain {

	public static void main(String[] args) {
		
		 _05Car ben = new  _05Bentz(); //다형성 적용
		 ben.getInfo();
		 ben.drive();
		 ben.stop();
		 ben.speedUp(50);
		 ben.speedDown(70);
		 
		 System.out.println();
		 
		 
		 _05Car au = new _05Audi();
		 au.getInfo();
	}
}
