package ch05;

public class _11_Radio extends _11_Electroproduct{

	private String Rname;
	
	public _11_Radio() {
		
	}
	public _11_Radio(int price, String Rname) {
		super(price);
		this.Rname = Rname;
		
	}
	public String getRname() {
		return Rname;
	}
	@Override
	public String toString() {
		return "제품명 : "+getRname();
	}
	
}
