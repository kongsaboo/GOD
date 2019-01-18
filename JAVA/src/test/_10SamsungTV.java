package test;

public class _10SamsungTV extends _10TV implements _10ProductInfo{

	private int price;
	
	public _10SamsungTV() {}
	
	public _10SamsungTV(int price) {
		this.price=price;
	}
	
	public int getPrice() {
		return price;
	}
	
	@Override
	public void madeYear() {
		// TODO Auto-generated method stub
		System.out.println("제조년도 :"+MADEYEAR);
	}

	@Override
	public void brandInfo() {
		// TODO Auto-generated method stub
		System.out.println("브랜드명 :"+BRAND);
	}

	
}
