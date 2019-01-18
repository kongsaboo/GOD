package ch05;

public class _03_Sawon extends _04_Member {

	private int sudang ;
	
	public void setSundang(int sudang) {
		this.sudang = sudang;
		
	}
	public int getSudang() {
		return sudang;
		
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
	public void printmemInfo() {
		System.out.print("사번 : " +getSabun()+
							"\n이름 : "+getName()+
							"\n주소 : "+getAddress()+
							"\n임금 : "+getSalary());
		System.out.println("\n수당 : "+ getSudang());
	}
}
