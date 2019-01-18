package ch05;

public class _05_StudentMain {
	public static void main(String[] args) {
		
		_05_Student stu = new _05_Student(); //기본생성자의 값을 출력
		
			System.out.println(stu.toString());
			
		_05_Student stu1 = new _05_Student(2000, "고소영", 45);	//매개생성자 값을 출력
			System.out.println(stu1); // 문자열을 출력하라
		
		//stu1.printInf0();
	}
}
