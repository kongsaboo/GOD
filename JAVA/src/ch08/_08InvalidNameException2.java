package ch08;

//사용자 정의 Exception
public class _08InvalidNameException2 extends Exception{
	private String wrongName;
	
	//기본 생성자
	public _08InvalidNameException2() {
	}
	//매개변수
	public _08InvalidNameException2(String wrongName) {  //매개생성자로 나이 받는다
		this.wrongName=wrongName;
	}
	public String getWrongName() {
		return wrongName;
	}
	public void showWrongName() { //나이에 대한 매소드와 출력문
		System.out.println("잘못 입력된 값입니다. :"+getWrongName());
	}

}
