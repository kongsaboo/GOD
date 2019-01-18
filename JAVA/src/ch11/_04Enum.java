package ch11;
enum animal{CAT, DOG, FISH}
public class _04Enum {
	/*
	 * enum : 열거형
	 * 1. 정의 : 여러개의 상수들을 모아서 만든 객체를 의미
	 * 2. 작성방법 : enum 열거형명{상수1, 상수2, 상수3, ...}
	 * 3. 용도 : 제한된 상수값만을 사용하고자 할때
	 * 4. 접근방법 : 열거형명.상수
	 * 5. 특징 : switch(변수)에서 변수타입으로 enum을 사용할 수 있다.
	 * 			ordinal()메소드를 이용해서 순서값을 얻어 올 수 있다.
	 * 			ordinal()은 0부터 시작한다.
	 */
	//멤버변수
	private animal kind;
	private String name;
	//기본생성
	public _04Enum() {
		// TODO Auto-generated constructor stub
	}
	//매개생성
	public _04Enum(animal kind, String name) {
		this.kind = kind;
		this. name = name;
		
	}
	public animal getKind() {
		return kind;
	}
	public void setKind(animal kind) {
		this.kind = kind;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}