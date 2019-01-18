package ch08;
import java.io.IOException;
import java.util.Scanner;

public class _08MemberMainException {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		try {
			 _08MemberInfo info = readMemberInfo();
			 info.showMemberInfo();// 이 클래스의 메소드를 불러오기때문에 sysout이 필요치 않다.
			 
				
		}catch(_08InvalidAgeException e){ // 이 클래스의 메소드를 불러오기때문에 sysout이 필요치 않다.
			e.showWrongAge(); //잘못된 예외문 출력 
		}catch(_08InvalidNameException2 e2){// 이 클래스의 메소드를 불러오기때문에 sysout이 필요치 않다.
			e2.showWrongName(); //잘못된 예외문 출력
		}finally {
			scan.close();
		}
		
	}
	
	
	public static _08MemberInfo readMemberInfo() throws _08InvalidAgeException, _08InvalidNameException2{//부모에서 throws를 받아라(자식의)
		int age = readAge();
		String name = readName();
		
		//memberinfo 매개변수로 생성자 호출
		return new _08MemberInfo(name, age) ;
		//_08MemberInfo info = new _08MemberInfo(name, age) ;
		//return info ; 로도 가능
		
			
		
		//출력
	}
	public static int readAge() throws _08InvalidAgeException{//순서2
		System.out.print("나이를 입력하세요");
		int age =scan.nextInt();
		scan.nextLine();
		if(age<1) {
			throw new _08InvalidAgeException(age);//순서1 10\n

		}
			return age;
	}
	
	public static String readName() throws _08InvalidNameException2{
		System.out.print("이름을 입력하세요");
		String name =scan.nextLine();
		if(name.length()<2) {
			throw new _08InvalidNameException2(name); //throw로 떠넘기고 throws로 받고
			
		}	
		return name;
	}
}
