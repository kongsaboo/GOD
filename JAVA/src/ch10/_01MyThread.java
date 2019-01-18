package ch10;

public class _01MyThread extends Thread{
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.print(i+ " ");
		}
	}
}
