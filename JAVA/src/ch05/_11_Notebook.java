package ch05;

public class _11_Notebook extends _11_Electroproduct {

	private String notename;
	
	public _11_Notebook() {
		
	}
	
	public _11_Notebook(int price, String notename) {
		super(price);
		this.notename = notename;
	}
	public String getNotename() {
		return notename;
	}
	
	@Override
	public String toString() {
		return " 제품명 :" +getNotename();
	}
}
