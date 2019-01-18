package ch04;

public class _07_Member {

	// 멤버변수
	private String name;
	private int age;
	private String hobby;

	// 기본 생성자
	public _07_Member() {
		System.out.println("기본생성자");
	}

	// 매개변수 생성자(객체 생성시점의 값->매개변수->멤버변수)
	public _07_Member(String name, int age, String hobby) {
		System.out.println("=========매개변수 생성자");
		
		this.name = name;
		this.age = age;
		this.hobby = hobby;

	}

	// 멤버 메소드
	public void getDetail() {
		System.out.println("이름 : " + name + "\n나이 : " + getAge() + "\n취미 : " + getHobby());
	}

	
	//멤버 메소드..Setter(값->매개변수->멤버변수)
	// Setter 메소드 작성시 타입과 이름을 넣어준다.
	public void setName(String name) {
		this.name = name;
	}
	
		//getter.. 멤버 변수의 값을 돌려준다.(return)
		public String getName(){
			return name;
			
		}
		public int getAge() {
			return age;
			
		}
		public String getHobby() {
			return hobby;
		}
	
	
	
	public int add(int n1,int n2) {
		return n1+n2;
	}
}
