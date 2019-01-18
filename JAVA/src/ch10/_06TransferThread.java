package ch10;

//계좌 이체 Thread
public class _06TransferThread extends Thread{
	private _06SharedArea sharedArea;

	public _06TransferThread() {}

	public _06TransferThread(_06SharedArea sharedArea) {
		this.sharedArea = sharedArea;
	}
	@Override
	public void run() {
		for(int i =0; i<12 ; i++) {
			//계좌를 이체한다.
			sharedArea.transfer(100000);
		}
	}
}
