package REVIEW;

public class _06InvalidAgeEx extends Exception{
	//멤버변수
	private int wrongAge;
	
	//기본 생성자
	public _06InvalidAgeEx() {
		
	}
	//매개생성자
	public _06InvalidAgeEx(int wrongAge) {
		this.wrongAge =wrongAge;
	}
	//메소드 - get
	public int getWrongAge() {
		return wrongAge;
	}
	// 메소드 - 잘못된 값 출력
	public void showWrongAge() {
		System.out.println("잘못 입력된 나이 : "+ getWrongAge());
	}
}
