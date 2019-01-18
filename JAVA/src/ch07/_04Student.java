package ch07;

public class _04Student {

	private int number;
	private String name;
	
	public _04Student() {}
	public _04Student(int number, String name) {
		this.number= number;
		this.name=name;
		
	}
	@Override
	public String toString() {
		return " [number=" + number + ", name=" + name + "]";
	}
	
	
}
