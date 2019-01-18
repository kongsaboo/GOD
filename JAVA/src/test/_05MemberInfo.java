package test;

public class _05MemberInfo {
	//멤버변수
	private String name;
	private int age;
	//기본생성
	public _05MemberInfo(){}
	//매개생성
	public _05MemberInfo(String name, int age){
		this.name = name;
		this.age= age;
}
	//멤버 메소드 -get
	public String getName(){
		return name;
}
	public int getAge(){
		return age;
}
	//메소드 -출력
	public void PrintMemInfo(){
		System.out.println("이름 : " +getName() + "나이 : " + getAge());
}
}
