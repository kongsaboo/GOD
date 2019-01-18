package ch04;

public class _07_MemberMainEx {
	public static void main(String[] args) {

		// 1. 매개변수 생성자를 이용해 출력 , 객체 생성시점에서 값을 넘긴다.()
		_07_Member mm = new _07_Member("이상철", 44, "soccer");
		mm.getDetail();

		// 2. 기본생성자, setter를 이용해 출력\
		// setter 객체에서 출력하기 위해서는 각각의 값을 넣어야 한다.
		_07_Member mm2 = new _07_Member();
/*		mm2.setName("이긍어");
		mm2.setAge(45);
		mm2.setHobby("swimming");*/
		
		mm2.getDetail();
		
		mm2.setName("이긍어");
		mm2.getName();
		mm2.getDetail();
		
		
		String str2 = " 안녕하세요 ";
		String str1 = mm2.getName();
		
		String str = str1+str2;
		System.out.println(str);
		System.out.println(mm2.getName());
		System.out.println(mm2.getAge());

		int result = mm.add(5, 10);
		System.out.println(result);
		//System.out.println(mm.add(5, 10));
		
		
		
	}
}
