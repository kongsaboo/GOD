package ch05;

public class _01_AnimalEx {

	public static void main(String[] args) {
		
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
		
		 _01Cat cat = new  _01Cat() ;
		 
		 cat.kind = "고양이과";
		 cat.legs = 4;
		 cat.printinfo();
		 cat.cry();
		 cat.eat();
		 cat.play();
		 cat.sleep();
		 
		 
		 System.out.println();
		 _01_Dog dog = new _01_Dog ();
		 
		 dog.kind ="개과";
		 dog.legs =4;
		 dog.printinfo();
		 dog.bark();
		 dog.eat();
		 dog.play();
		 dog.sleep();
		 
	}
}
