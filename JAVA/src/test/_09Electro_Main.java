package test;

public class _09Electro_Main {
	public static void main(String[]args){
		/*_09Electro el = new _09Audio("삼성라디오", 400000);
		    
		_09Electro ell = new _09Laptop("삼성북", 500000);
*/
		_09Buyer buy= new _09Buyer();
		     buy.buyer(new _09Audio("삼성라디오", 400000)); //다형성 안에 값 넣는거 까먹음
		     buy.buyer(new _09Laptop("삼성북", 500000));

	}
}
