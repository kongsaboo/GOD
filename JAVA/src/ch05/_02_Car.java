package ch05;

public class _02_Car {

	//변수
	private int speed ;
	private String kind;
	
	//생성자
	public _02_Car() { //기본생성자 생성과 객체생성 헷갈리지 말것!
		
	}
	
	
	//메소드
	public void setSpeed(int speed) {
		this.speed = speed;
		
		
	}
	public int getSpeed() {
		return speed;
	}
	
	public void  setKind(String kind) {
		this.kind = kind;
		
	}
	public String getKind() {
		return kind;
	}
	
	public void turn () {
		System.out.println("턴을 돌다");
	}
	
	public void printInfo() {
		System.out.println("종류 : " +kind+"\t속도: " + getSpeed());
	}
}
