package ch08;
import java.util.Scanner;

public class _06ExceptionEx {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		try {
			String name =readName();  //1
			System.out.println("그대의 이름은 ? "+ name);

		}catch (_06UserNameException e) {//4
			System.out.println(e.getMessage());
		}finally {
			input.close();//5
		}
		System.out.println("정상종료");
	}
	
	static String readName() throws _06UserNameException{//3
		System.out.println("이름을 입력하세요 :");
		String name = input.nextLine();
		
		//1. 예외발생 : throw 예외
		if(name.length()<3) {
			//throw new Exception("이름은 3자 이상입니다.");
			throw new _06UserNameException(); //2
			
		}else {
			return name;
		}

		
	}
	
}
