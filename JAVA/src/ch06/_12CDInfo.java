package ch06;

public class _12CDInfo { //부모

	//멤버변수
	private String registerNo;
	private String title;
	
	//기본생성
	public _12CDInfo() {
		
	}
	
	//매개생성
	public _12CDInfo(String registerno, String title) {
		this.registerNo =registerno;
		this.title = title;
	}
	
	//멤버 메소드
	public String getRegisterNo() {
		return registerNo;
	}
	
	public String getTitle() {
		return title;
	}
	
	
	
}
