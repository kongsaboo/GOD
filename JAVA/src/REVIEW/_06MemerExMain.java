package REVIEW;

import java.util.Scanner;

import ch08._06UserNameException;

public class _06MemerExMain {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		try {
			_06MemberInfo info = readAll();
			info.showInfo(); //출력메소드를 불러오기 때문에 출력문 따로 필요없음
		}catch(_06InvalidAgeEx e){
			e.showWrongAge();//출력메소드를 불러오기 때문에 출력문 따로 필요없음
		}catch(_06InvalidNameEx e){
			e.showWrongName();//출력메소드를 불러오기 때문에 출력문 따로 필요없음
		}finally {
			scan.close();
		}
	}
	
	public static int readAge() throws _06InvalidAgeEx{//상수매소드로써 _06InvalidAgeEx
		System.out.println("나이를 입력하세요");				//의 예외값을 던져줌
		int age = scan.nextInt(); //
		scan.nextLine();
		if(age<0) {
			throw new _06InvalidAgeEx(age); //0보다 작을 경우 에러메시지전달
		}
		return age;
	}
	public static String readName() throws _06InvalidNameEx{
		System.out.println("이름을 입력하세요");
		String name = scan.nextLine();
		if(name.length()<2) { // 2보다 작을경우 에러메시지 전달
			throw new _06InvalidNameEx(name);
		}
		return name;
	}
	// 여기서 realAll()메서드가 위에 readName()과 readAge()를 가져올 수 있는 이유는 상수메소드이기 때문에
	// 이메서드는 타입을 다른 클래스로 가져오지만 위와 동일하게 반환형을 취하고 있으므로 반드시 return을 명시해야한다.
	public static _06MemberInfo readAll() throws _06InvalidAgeEx, _06InvalidNameEx{
		int age = readAge();
		String name = readName();
		//매개변수로 생성자 호출
		return new _06MemberInfo(name, age);
		
	}
}
