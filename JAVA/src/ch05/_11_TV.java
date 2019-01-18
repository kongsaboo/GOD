package ch05;

public class _11_TV extends _11_Electroproduct {

	private String tvname ;
	
	public _11_TV () {
		
	}
	public _11_TV (int price, String tvname) {
		super(price);
		this.tvname = tvname;
	
	}
	public String getTvname() {
		return tvname;
	}
	@Override
	public String toString() {
		return " 제품명 :" +getTvname();
	}
}
