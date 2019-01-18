package REVIEW;

public class _06MemberInfo {
	//멤버변수
	private String name;
	private int age;
	
	//기본생성
	public _06MemberInfo() {
		
	}
	//매개생성
	public _06MemberInfo(String name, int age) {
		this.name=name;
		this.age=age;
	}
	//메소드 -get
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//메소드 -출력용
	public void showInfo() {
		System.out.println("이름 : "+ getName()+ "나이 : "+ getAge());
	}
}
