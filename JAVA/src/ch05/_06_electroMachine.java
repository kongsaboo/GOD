package ch05;

public class _06_electroMachine {

	//멤버변수
	private String name;
	private String brand;
	private int price ;
	
	//기본 생성
	public _06_electroMachine() {
		System.out.println("기본생성자");
		
	}
	//매개 생성
	public _06_electroMachine(String name, String  brand, int price) {
		this.name = name;
		this.brand = brand;
		this.price = price;
		
		
	}
	
	//멤버 메소드
	public String getName() {
		return name;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public int getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "[name=" + getName() + ", brand=" + getBrand() + ", price=" + getPrice() + "]";
	}
	
	
}
