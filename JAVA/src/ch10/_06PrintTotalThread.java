package ch10;

public class _06PrintTotalThread extends Thread {

	_06SharedArea sharedArea;

	public _06PrintTotalThread() {

	}

	public _06PrintTotalThread(_06SharedArea sharedArea) {
		this.sharedArea = sharedArea;
	}

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			// 잔액 합계
			int sum = sharedArea.getTotal();
			System.out.println("계좌잔액합계 : " + sum);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}
	}
}
