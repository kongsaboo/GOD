package ch06;
/*
 * 추상이란?
 *  - 여러가지 사물이나 개념으로부터 공통이 되는 특성을 파악하는 것.
 *  
 *  1. 추상클래스
 *    - 하나 이상의 추상메소드를 가지고 있는 클래스를 의미
 *    - abstract 키워드를 이용하여 구현되지 않는 추상메소드를 기술할 수 있다.
 *    - 자식클래스에게 구현을 미루고자 할때 사용되며, 프로그램의 확장성을 위해 많이 사용하는 설계방법.
 *    - 추상클래스에는 일반메소드, 추상메소드 모두 올 수 있다.
 *    - 전제조건은 상속을 해야 한다.
 *    
 *    문법 : public abstract class 클래스명{
 *    			public abstract void 메소드명 ();//추상메소드
 *    }
 *    
 *  2. 추상메소드
 *   - 미완성 되어있는 메소드, 몸체가 없는 메소드로서 항상 세미콜론(;)으로 종료되어야 한다.
 *   
 *  3. 추상클래스의 상속 ..중요
 *   - 추상클래스를 상속받는 자식클래스는 추상메소드를 반드시 재정의(오버라이드)해야한다.
 *   	재정의 하지 않으면 컴파일 오류 발생
 *   - 자식클래스에게 강제성과 통일성을 줄 수 있다.
 *  
 *  4. 추상클래스의 객체생성
 *   - 추상클래스는 객체를 생성할 수 없으며, 상속계층에서 추상적인 개념을 나타내기 위한 용도로 사용
 *   - 상속을 통하여 자식클래스에서 추상메소드를 구현하고, 자식클래스 객체를 생성하여 메소드를 접근 할 수 있다.
 */
public abstract class  _01Animal {

	public abstract void  move() ;
	public abstract void eat();
}
