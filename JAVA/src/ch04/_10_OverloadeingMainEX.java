package ch04;

public class _10_OverloadeingMainEX {

	public static void main(String []args) {
		
		_10_Overloading date1 = new _10_Overloading (2015, "8월", 10);
		_10_Overloading date2 = new _10_Overloading (2020);
		_10_Overloading date3 = new _10_Overloading ();
		
		
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);
	}

}
