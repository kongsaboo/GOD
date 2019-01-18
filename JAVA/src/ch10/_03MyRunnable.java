package ch10;

public class _03MyRunnable implements Runnable{
	//맴버변수
	private String threadName;
	//기본생생성
	public _03MyRunnable() {
		// TODO Auto-generated constructor stub
	}
	public _03MyRunnable(String threadName) {
		this.threadName=threadName;
	}
	@Override
	public void run() {
		for(int i =10 ; i>=0; i--) {
			System.out.print(threadName + i +" ");
		}
	}

}
