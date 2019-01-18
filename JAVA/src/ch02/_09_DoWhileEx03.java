package ch02;
import java.util.Scanner;
public class _09_DoWhileEx03 {
	public static void main(String[] args) {
	   // 문자 입력~~,'q' || 'Q'를 만나면 종료를 출력한다.
		Scanner input = new Scanner(System.in);
		
		
		String str= " ";
		
		
		do {
			System.out.println("글자입력: ");
			 str= input.next();
		}  //str.length()>1 : quit일때 종료 안되도록 하기 위함
		while (str.charAt(0) != 'q' && str.charAt(0)!= 'Q' || str.length()>1);
		System.out.println("프로그램 종료");
	}
}
