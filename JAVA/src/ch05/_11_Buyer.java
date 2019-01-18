package ch05;

public class _11_Buyer {
	
	//원금
	int mymoney=1000000; //원금 : 소지금
	int bonuspoint =0; // 
	
	
	//_11_Electroproduct gadget = new _11_Notebook(200000, "삼성노트북");
	//_11_Electroproduct gadget = new _11_TV(300000, "삼성티비");
	public void buy(_11_Electroproduct gadget) { //매개변수의 다형성을 적용
		
		if(mymoney<gadget.getPrice()) {
			System.out.println("잔금부족");
		}else {
		//제품정보 : 제품명, 가격
		System.out.print(gadget.toString()+
						"\t 가격 :"+gadget.getPrice());
		//잔액
		mymoney -= gadget.getPrice();
		//보너스포인트 
		bonuspoint += gadget.getBonuspoint();
		System.out.println("\t보너스포인트 :"+bonuspoint);
	}
	}
		}
	
		
	
	
	
		
	/*public _11_Buyer () {
		
	}
	public _11_Buyer (int mymoney, int coins) {
		
		this.mymoney = mymoney;
		this.coins = coins;
		
	}
	
	public int getMymoney() {
		return mymoney;
	
	}
	public int getCoins() {
		return coins;
	}
	// 구매자가 산다 Tv와 노트북을!!
}*/
