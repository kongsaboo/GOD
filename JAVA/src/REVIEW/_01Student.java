package REVIEW;

public class _01Student {

	//멤버변수
	private int number;
	private String name;
	
	//생성자
	public _01Student() {
		// TODO Auto-generated constructor stub
	}
	public _01Student(int number, String name) {
		this.number=number;
		this.name =name;
		
		
	}
	//메소드- toString
	@Override
	public String toString() {
		return "[number=" + number + ", name=" + name + "]";
	}
}
