package REVIEW;

public class _06InvalidNameEx extends Exception{
	//멤버변수
	private String wrongName;
	
	//기본생성
	public _06InvalidNameEx() {
		
	}
	//매개생성
	public _06InvalidNameEx(String wrongName) {
		this.wrongName=wrongName;
		
	}
	//매소드 - get
	public String getWrongName() {
		return wrongName;
	}
	//메소드 - 출력용
	public void showWrongName() {
		System.out.println("잘못된 이름 입력 :" + getWrongName());
	}
}
