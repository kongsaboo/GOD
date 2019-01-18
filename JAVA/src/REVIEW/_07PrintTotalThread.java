package REVIEW;


public class _07PrintTotalThread extends Thread{
	//멤버변수
	private _07SharedArea sharedArea;
	//기본생성
	public _07PrintTotalThread() {}
	//매개생성
	public _07PrintTotalThread(_07SharedArea sharedArea) {
		this.sharedArea =sharedArea;
	}
	@Override
	public void run() {
		for(int i=0; i<3;i++) {
			//잔액합계
			int sum=sharedArea.getTotal();
			System.out.println("계좌잔액합계 : "+sum);
			
			try {
				Thread.sleep(1000);  //1초 단위로 실행한다.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}
	}
}