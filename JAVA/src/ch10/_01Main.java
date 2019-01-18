package ch10;

public class _01Main {
	public static void main(String[] args) {
		/*
		 *  Thread 생성과 실행
		 *  (1) Thread 클래스를 상속하기
		 *  -1. Thread 클래스를 상속받아 클래스를 작성한다.
		 *   2. run()메소드를 재정의한다.
		 *   3. main() 메소드에서 Thread 객체를 생성한다.
		 *   4. start() 메소드를 호출해서 스레드를 실행한다.
		 *   5. run() 메소드가 실행된다.
		 */
		//다형성
		Thread t = new _01MyThread();
		//run ()호출
		t.start();
	}
}
