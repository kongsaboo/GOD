package test;

public class _12AgeException extends Exception {// Exception을 _12Exception 클래스로 받음
	public _12AgeException() {
		super("나이는 0살 이상입니다."); // 세미콜론 생략
	}
}
