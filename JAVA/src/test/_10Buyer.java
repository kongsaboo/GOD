package test;

public class _10Buyer {

	private int mymoney ; //1000000;  //소지금
	private double point; //= (int) (mymoney*0.01);
	
	
	public _10Buyer(){

}
	public  _10Buyer(int mymoney) {
		this.mymoney = mymoney;
	}
	
	public void getBalance(){ 
		System.out.println("잔액 :"+mymoney + "\t포인트 :"+point);
}
	
	public void buy(_10SamsungTV sam) { //buy라는 메소드가 삼성티비라는 타입(여기서 클래스)의 sam이라는 매개변수를 가지고 있다.
		if(mymoney <sam.getPrice()) { //마이머니의 초기값은 바이어에 두지만 값은 메인에서 객체생성후 매개변수로 넣는다 --> 전제조건은 바이어클래스에 매개생성자와 마이머니에 대한 타입과 변수 설정이 선행
			this.mymoney-= sam.getPrice(); //여기서 삼성티비의 값은 삼성티비 클래스가 아닌 메인에서 매개변수로 가져온다 --> 삼성티비클래스에 매개성성자(int price라는 타입과 변수를 가진)가 존재한다
			this.point+= sam.getPrice()*0.01;
			System.out.println("제품구매완료");
			sam.madeYear();
			sam.brandInfo();
		}
	}
	
		}
