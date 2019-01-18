package ch10;

public class _04Thread {
	public static void main(String[] args) {
		System.out.println("현재 수행되고 있는 스레드 이름 : "+Thread.currentThread().getName()); //네임 가져오는 법 
		System.out.println("스레드의 최소 우선순위값 : "+ Thread.MIN_PRIORITY); //최소값
		System.out.println("스래드의 최대 우선순위값 :" + Thread.MAX_PRIORITY); //최대값
		System.out.println("스래드의 중간 우선순위값 : "+ Thread.NORM_PRIORITY); //중간값
		System.out.println("현재 수행되고 있는 스레드 우선순위 : "+ Thread.currentThread().getPriority());
	}

}
