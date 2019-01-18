package ch08;
import java.util.Scanner;

public class _07ExceptionEx2 {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		try {
			int age =checkAge();  //1
			System.out.println("그대의 나이는 : "+ age);

		}catch (_07InvalidAGeException e) {//4
			System.out.println(e.getMessage());
		}finally {
			input.close();//5
		}
		System.out.println("정상종료");
	}
	
	static int checkAge() throws _07InvalidAGeException{//3
		System.out.println("나이를 입력하세요 :");
		int age = input.nextInt();
		
		//1. 예외발생 : throw 예외
		if(age<1) {
			//throw new Exception("이름은 3자 이상입니다.");
			throw new _07InvalidAGeException(); //2 - 매개생성자를 받아옴
			
		}else {
			return age;
		}

		
	}
	
}
