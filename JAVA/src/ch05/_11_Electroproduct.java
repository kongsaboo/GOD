package ch05;

public class _11_Electroproduct {

	private int price ;
	private int bonuspoint; //보너스 포인트 1프로
	
	
		
	public _11_Electroproduct() {
		
	}
		 
	public _11_Electroproduct(int price) {
		this.price = price;
		this.bonuspoint = (int)(price*0.01);
	}
	public int getPrice() {
		return price;
	}
	public int getBonuspoint() {
		return  bonuspoint;
	}
	
	@Override
	public String toString() {
		return " "; // 암것도 넘기지 않음
	}
	
}

