package ch05;

public class _11_Electroproduct_Main {

	public static void main(String[] args) {

	/*	_11_Electroproduct note = new _11_Notebook(200000, "삼성노트북");
		System.out.println(note);

		_11_Electroproduct tv = new _11_TV(300000, "삼성티비");
		System.out.println(tv);*/
		
		
		_11_Buyer buy = new _11_Buyer();
			//buy.buy(new _11_Notebook);//buy.buy(new  _11_Notebook);
			buy.buy(new _11_Notebook(200000, "삼성노트북"));
			buy.buy(new _11_TV(300000, "삼성티비"));
			buy.buy(new _11_Radio(150000, "lg라디오"));
	}

	/*
	 * 원금 : 100만원 제품명 : 노트북 가격: 200000 잔액 : 800000 보너스: 2000     잔액은 감소/ 보너스는 누적 
	 * 			   제품명  :  TV  가격: 300000 잔액:  500000 보너스: 5000
	 */
}
