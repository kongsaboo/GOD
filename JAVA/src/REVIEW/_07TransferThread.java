package REVIEW;

public class _07TransferThread extends Thread{
	//멤버변수
	private _07SharedArea sharedArea;
	//기본생성
	public _07TransferThread() {}
	//매개생성
	public _07TransferThread(_07SharedArea sharedArea) {
		this.sharedArea =sharedArea;
	}
	@Override 
	public void run() {
		for(int i =0; i<12; i++) {
			//계좌이체
			sharedArea.transfer(1000000); //쉐어에어리어의 트랜스퍼 메소드를 불러온다
		}
	}
}
