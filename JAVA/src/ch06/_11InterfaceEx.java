package ch06;

public class _11InterfaceEx {

	public static void main(String[] args) {
		A11 a11 =new A11();
		a11.methodA(new B11()); // I11 i11 = new B11();
		
		
	}
}

class A11 {
	public void methodA(B11 b) {
		I11 i11 = InstanceManager.getInstance(); //= new B11();인터페이스의 부모 ->자식 호출
		i11.methodB();
		//a11.methodA(new methodB());
	}
	
}

interface I11{
	
	public void methodB();		
}

class B11 implements I11{

	public B11(){
		System.out.println("B11()기본생성자 호출");
	}
	
	@Override
	public void methodB() {
		System.out.println("B11클래스- methodB()");
	}
	
}

class InstanceManager{
	/*
	 * 팩토리 메소드(Factory method)
	 * 	- 공장처럼 객체를 생성하는 정적 메소드
	 * 		이것은 디자인 패턴의 하나로서 객체를 만드는 부분을 자식클래스에게 위임하는 패턴
	 * 		즉 new 연산자를 호출하여서 객체를 생성하는 코드를 자식클래스에게 위임한다는 의미.
	 * 		사용하는 이유는 하나의 클래스가 변경되었을 경우, 다른 클래스의 변경을 최소화하기위해서
	 * 
	 * 		팩토리 메서드 이름으로 많이 사용되는 것은 getInstance()이다.
	 * 		인터페이스에서 팩토리 메소드를 제공할 때 정적메소드를  사용하게 된다
	 * 		static 이므로 클래스명.정적메소드로 접근
	 */
	 public static I11 getInstance() { //부모인 I11(인터페이스)을 타입으로 다형성적용 인터페이스  타입으로 돌려줌
		return new B11();
	}
}