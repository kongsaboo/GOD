package test;

public class _CDInfo {
	private String registerNo;
	private String title; 

	
	//생성자 생략
	public _CDInfo() {}
	public _CDInfo(String registerNo, String title) {
		this.registerNo=registerNo;
		this.title = title;
		
	}

	public String getRegisterNo(){
		return registerNo;	
}
	public String getTitle(){
		return title;
} 


}
