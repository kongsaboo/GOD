package ch05;

public class _01_Animal {

	//멤버변수
	protected String kind ; 
	protected int legs;
	
	
	//기본생성자
	public _01_Animal() {
	//	System.out.println("기본생성자");
		
		
	}
	//멤버메소드
	public void sleep() {
		System.out.println("잠자다");
		
	}
	public void eat() {
		System.out.println("먹다");
		
	}
	
	public void play() {
		System.out.println("놀다");
	}
	
	public void printinfo() {
		System.out.println("legs:"+legs+"\nkind:"+kind);
	}
}
