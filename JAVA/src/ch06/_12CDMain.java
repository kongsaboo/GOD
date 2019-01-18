package ch06;

public class _12CDMain {

	public static void main(String[] args) {
		_12AppCDInfo a = new _12AppCDInfo("4455dd", "안시성");

		a.checkOut("홍길동", "2018/7/8");   //대출
		System.out.println("==============");  
		
		a.checkOut("홍길동", "2018/7/8");
		System.out.println("==============");
		
		a.checkIn();  //반납
		a.checkIn();
		a.checkIn();
	}
}
