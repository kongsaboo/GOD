package ch06;

public class _10StaticTest {

	public static void main(String[] args) {
	//static 메소드에서 static 메소드는 호출가능
	//static 메소드는 자동으로 메모리에 올라가나, 일반 메소드는 객체 생성해야 함.
		
		add(10, 20);
		System.out.println(add(10,20)); // static 메소드에서 static메소드는 호출가능
		
}
	
	static int add(int x, int y) {
		return x+y;
	}
	 /*int add(int x, int y) {  -->static 메소드인 main에서 인스턴스 메소드 호출시 컴파일 오류
		return x+y;
	}
	*/
}
