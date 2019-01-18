package test;

public class _11Member {
	private String id;
	private String name;
	private String address;

public _11Member(){}

public _11Member(String id, String name, String address){
	this.id = id;
	this.name = name;
	this.address= address;
}

	@Override
	public String toString() {
		return "아이디 : " + id + " 이름 : " + name + " 주소 : " + address;
	}

}
