package ch05;

public class _04_Sawon extends _04_Member {

	private int sudang ;
	
	public void setSundang(int sudang) {
		this.sudang = sudang;
		
	}
	public int getSudang() {
		return sudang;
		
	}
	//기본
	public _04_Sawon() {
		
	}
	
	//매개
	public _04_Sawon(int sabun, String name, String address, int salary , int sudang) {
		super(sabun, name, address, salary);
		this.sudang = sudang;
	}
	
	/*
	 * @Override
	 * 오버라이딩 : 자식클래스의 메소드가 부모클래스의 메소드를 
	 * 			오버라이드(재정의)한다.
	 * 		오버라이드 : 부모메소드의 기능을 무시한다는 의미
	 * 		- 상속에서 부모클래스의 메소드를 변경하고자 할때 사용
	 * 		- 메소드의 이름이나, 매개변수, 반환형은 모두 동일해야 한다.
	 * 		- 호출 시 오버라이딩한 자식의 메소드가 호출된다.
	 * 		(부모클래스의 메소드를 변경해서 호출하는 것이 목적이기 때문)
	 */
	
	/*
	 *상속 : 자식클래스 extends 부모클래스{}
	 *- 부모클래스의 변수와 메서드를 마치 자기것 처럼 사용 할수 있다.
	 *- extends : 확장(파생)의 의미
	 *- 공통으로 사용하는 변수와 메소드를 부모클래스에서 정의한다.
	 * 	부모클래스는 추상적이고, 자식클래스는 구체적이다.
	 *- 사용이유 : 부모클래스의 변수와 메소드를 재사용
	 *			중복되는 코드를 줄일 수 있으므로 손쉽게 개발,유지,보수 가능
	 *- 부모클래스의 멤버를 private으로 선언한 경우, 자식클래스에서 접근X
	 *				 protected 의 경우는 자식클래스에서 접근 가능
	 */
	/*
	 * 생성자
	 * 	-생성자는 기본 생성자 + 매개변수 생성자
	 * 	- 기본 생성자는 메모리에 생성시 각각의 변수 type의 기본값으로 초기화 된다.(예 : String:null, int:0, boolean :false)
	 * 	- 매개변수 생성자는 메모리에 객체생성시 넘겨받은 매개변수의 값으로 초기화 된다.
	 * 
	 * 	- 생성자가 정의되어 있지 않으면 컴파일러가 기본생성자를 자동으로 추가한다.
	 * 	- 생성자가 하나라도 정의되어 있을 경우, 기본생성자 자동추가 X
	 * 	  따라서 매개변수가 있는 생성자를 추가시, 기본생성자를 개발자가 생성해야 함.
	 * 
	 * 	- 상속관계일 경우
	 * 	-super()는 부모의 기본생성자를 호출
	 * 	-자식의 기본생성잗에서 반드시 super()를 묵시적으로 호출하므로 부모의 기본생성자는 반드시 존재해야 한다.
	 * 	 자식보다 부모가 먼저 객체생성되어 있어야 상속이 가능하기 때문
	 * 
	 * 	-생성자의 호출순서는 부모클래스의 생성자 -> 자식클래스의 생성자 순이다.
	 * 	 자식클래스의 생성자가 먼저 호출되기는 하지만, 부모클래스의 상속된 부분을 먼저 초기화 하기 위해서 
	 * 	 부모클래스의 생성자가 먼저 실행되어야 한다.
	 * 
	 * 	- 부모클래스의 호출은 반드시 생성자의 첫번째 줄이어야 한다.\
	 * 	- 자식의 매개변수 생성자에서 부모의 매개변수 생성자 호출 시 
	 * 	   부모의 기본생성자 호출을 하면 에러발생
	 * 	- 부모 기본생성자는 자식 기본생성자에서 super()로 호출
	 */	
	
	public void printmemInfo() {
		super.printmemInfo();
		/*System.out.print("사번 : " +getSabun()+
							"\n이름 : "+getName()+
							"\n주소 : "+getAddress()+
							"\n임금 : "+getSalary());*/
		System.out.println("\n수당 : "+ getSudang());
	}
	

}
