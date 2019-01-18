package ch06;
/*
 * 면접 : 추상클래스 vs 인터페이스 차이
 * 
 * 인터페이스
 *   - 기능정의서(표준작업명세서)이다 - 강제성과 통일성 *
 *   - 인터페이스는 필요한 메소드의 이름, 매개변수에 대하여 서로 합의하는 것이다.
 *   - 두 대상(객체)간의 '연결, 대화, 소통'을 돕는 중간 역할을 한다.
 *   - 설계(선언)와 구현을 분리시키는 것을 가능하게 한다.(설계: 인터페이스에서, 구현: 자식클래스에서)
 *   - 객체생성 불가하며, 객체 타입으로 사용가능.(다형성 적용)
 *   - 인터페이스의 멤버는 상수, 추상메소드만 올 수 있다.*
 *   - 인터페이스를 implements(구현)한 자식클래스에서 추상메소드를 재정의한다.*
 *   - 단 static 메소드와 디폴트 메소드는 예외다. (JDK1.8부터)
 *   
 * 1. 인터페이스 작성
 * interface 인터페이스명{
 * 	//상수
 * 
 * 	//반환형 추상메소드1()
 * 	public 반환형 메소드명(매개변수 1, 2....)
 * }  
 * 
 * 2. 인터페이스 구현 : 인터페이스에 정의된 추상메소드의 몸체를 정의한다는 의미
 * 	class 클래스명 implements 인터페이스명{
 * 		@Override
 * 		public 반환형 메소드명(매개변수1,2....)
 * }
 * 
 * 3. 인터페이스는 다중상속이 가능 cf)클래스는 단일상속만 가능
 * interface 인터페이스명 extends 인터페이스명1, 인터페이스명2...{
 * 
 * }
 * 
 * 4. 상속과 구현을 동시
 * 	class 클래스명 extends 부모클래스 implements 인터페이스명{
 * 		// 인터페이스에 정의된 추상메소드를 구현해야 한다.
 * }
 */
public interface _05Car {

	//상수 
	public static final String BRAND1= "벤츠";
	public static final String BRAND2= "아우디";
	public static final String DISPLACEMENT1= "3000";
	public static final String DISPLACEMENT2= "2000";
	
	//추상메소드 -->미완성 값을 자식에 넣어줌
	public void getInfo();
	public void drive();
	public void stop();
	public void speedUp(int speed);
	public void speedDown(int speed);
}
