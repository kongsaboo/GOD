package ch04;

public class _06_GetSetMainEx {
	public static void main(String[] args) {

		// 매개변수 생성자를 이용해서 값을 전달하고, 출력

		_06_GetSetter gs = new _06_GetSetter("국찌니빵", 2000, "삼립");

		gs.printInfo();

			System.out.println("=============");
		//2. getter setter를 이용해서 값을 전달, 출력
		gs.setBrand("v파리");
		gs.setName("상아빵");
		gs.setPrice(4500);
		
		gs.printInfo(); // 멤버메소드 값을 불러온다
		
		
	}
}
