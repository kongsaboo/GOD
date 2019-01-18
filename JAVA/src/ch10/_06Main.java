package ch10;

public class _06Main {
	public static void main(String[] args) {
		//객체생성
		_06SharedArea sa = new _06SharedArea();
		sa.account1=new _06Account("010-4547-7874", "김태희", 20000000);
		sa.account2 = new _06Account("010-5412-2562", "비", 10000000);
		_06TransferThread t1 = new _06TransferThread(sa); //계좌이체 스레드
		_06PrintTotalThread t2= new _06PrintTotalThread(sa);// 잔액합계
		
		t1.start();
		t2.start();
	}
}
/*
 *  Thread 생성과 실행
 *  (1) Thread 클래스를 상속하기
 *  -1. Thread 클래스를 상속받아 클래스를 작성한다.
 *   2. run()메소드를 재정의한다.
 *   3. main() 메소드에서 Thread 객체를 생성한다.
 *   4. start() 메소드를 호출해서 스레드를 실행한다.
 *   5. run() 메소드가 실행된다.
 */
/* synchronized : 동기화 p722
* 
* 동기화란 공유된 자원 중에서 동시에 사용하면 안되는 자원을 보호하는 도구
* 임계영역(critical section) : 하나의 사용자가 사용하고 있으면 다른 사용자는 사용이 끝날때까지 기다려야 한다.
* 							이러한 영역을 임계영역이라 한다.
* 
* p726
* 동기화 메소드를 만들기 위해서는 synchronized 키워드를 메소드 선언에 붙이면 된다.
* synchronized 키워드를 사용하면 어떤 한 순간에는 하나의 스레드만이 임계영역 안에서 실행하는 것이 보장된다.
* synchronized 키워드가 붙어 있으면 하나의 스레드가 공유 메서드를 실행하는 동안에
* 다른 스레드는 공유 메소드를 실행할 수 없다.

	wait() 메소드는 어떤 일이 일어나기를 기다릴 때 사용하는 메소드이다.
	notify() 메소드는 반대로 어떤 일이 일어났을 때 이를 알려주는 메소드이다.
	
	<critical section(임계영역)의 동기화>
	critical section이 문제를 일으키지 않으려면 그 부분이 실행되는 동안
	다른 스레드가 공유 데이터를 사용할 수 없도록 만들어야 하는데,
	그렇게 하는 것을 critical section(임계영역)의 동기화라고 한다.
	
	1) 한계좌의 금액을 다른 계좌로 이체하는 일
	2) 공유영역(김태희 계좌(2000만) + 비계좌(1000만)
	3) 두 계좌의 잔액합계를 출력하는 일을 동시에 한다.
*/