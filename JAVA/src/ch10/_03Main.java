package ch10;

public class _03Main {
	public static void main(String[] args) {
		//스레드 객체생성
		Thread t = new Thread(new _03MyRunnable("A")); //이름이 A인 스레드를 생성한다.
		t.start();
		Thread t1 = new Thread(new _03MyRunnable("B"));  //괄호는 매개변수 값을 넣어준다.(new _03MyRunnable("B")) 
		t1.start();										//new Runnable이 매개변수이고 , 그 이름을 B라 명명함 = Thread명
		}
}
