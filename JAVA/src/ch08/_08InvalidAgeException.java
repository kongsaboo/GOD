package ch08;

//사용자 정의 Exception
public class _08InvalidAgeException extends Exception{
	private int wrongAge;
	
	//기본 생성자
	public _08InvalidAgeException() {
	}
	//매개변수
	public _08InvalidAgeException(int wrongAge) {  //매개생성자로 나이 받는다
		this.wrongAge=wrongAge;
	}
	
	public int getWrongAge() {
		return wrongAge;
	}
	public void showWrongAge() { //나이에 대한 매소드와 출력문
		System.out.println("잘못 입력된 값입니다. :"+getWrongAge());
	}

}
