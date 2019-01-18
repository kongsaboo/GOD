package ch04;

public class _06_GetSetter {

	// 멤버변수
	private String name ;//setName ()   getName()
	private int price;
	private String brand;
	
	
	//생성자
	public _06_GetSetter() {
		name = "dkdjf";
		price = 1555;
		brand = "tko";
	}
		
	
	//매개변수 생성자 : 값-> 매개변수->멤버변수 
	public _06_GetSetter(String name, int price, String brand ) {
		System.out.println("=====매개변수 생성자");
		this.name = name;
		this.price = price;
		this.brand = brand;
	}
	
	//멤버 메소드
	public void printInfo() {
		System.out.println("이름 : "+name+"\n가격 :"+price+"\n브랜드 : "+brand); 
		
		
		
	}
	//멤버 메서드...Setter/Getter
	// setter = 값 -> 매개변수()에 값이 넣어진 상태-> 멤버변수
	public void setName(String name){
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
		
	}
}
