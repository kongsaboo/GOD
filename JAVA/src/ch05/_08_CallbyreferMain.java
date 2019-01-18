package ch05;

public class _08_CallbyreferMain {
	public static void main(String[] args) {

		/*
		 * call by refer (주소값에 의한 호출)..주소값 공유 
		 * 	- 객체를 메소드로 전달하게 되면 객체가 전달되는 것이 아니고 참조변수의 값이 
		 * 	복사되어 전달된다.
		 * 	- 참조변수의 값은 참조값(주소)를 가지고 있다.
		 * 	- 참조값이 매개변수로 전달되면 동일한 객체를 참조하게 된다.
		 * 	  따라서 매개변수를 통하여 객체의 내용을 변경하게 되면 
		 * 	  참조변수가 가리키는 객체의 내용도 변경된다. 
		 */
		_08_Callbyrefer obj = new _08_Callbyrefer();

		System.out.println("obj.value :" + obj.value);
		
		//obj.inc(obj); // obj : 참조변수이며, 주소값을 가짐 예)100
		
		obj.inc(new _08_Callbyrefer());
	}
}