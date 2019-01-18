package ch05;

public class _07_CallbyValueMain {

	public static void main(String[] args) {
		
	/*
	 * 기초변수가 전달되는 경우 : 값에 의한 호출
		- 전달하는 인수가 기초변수인 경우, 인수의 값이 매개변수로 복사된다.
		- 인수의 복사본이 만들어지고, 매개변수를 변경하여도 메소드 외부에 있는 인수에
		   영향이 없다.
	 */
	_07_CallbyValue cal = new _07_CallbyValue();
	
		int b =10;
		//cal.inc(10);
		cal.inc(b);
		System.out.println("b : "+ b); //b : 10
}
}
