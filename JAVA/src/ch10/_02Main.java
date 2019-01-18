package ch10;

public class _02Main {
	public static void main(String[] args) {
	/*
	 * 1. Thread 생성과 실행
	 * 	(2) Runnable 인터페이스를 구현하는 방법
	 * 	-1. Runnable 인터페이스를 implements 받아서 클래스를 작성
	 * 	 2. run() 메소드를 재정의 한다.
	 *   3. Thread 객체를 생성하고, 이때 implements 받은 클래스 객체를 매개 변수로 전달
	 *   4. start() 메소드를 호출해서 스레드를 실행한다.
	 *   5. run()메소드가 실행된다.
	 *  
	 */
		//호출
		Thread run = new Thread(new _02MyRunnable() ); // 러너블을 호출시 스레드에서 스레드의 매개생성자로 러너블클래스를 가져온다.
				
		//실행
		run.start();
	}
}
