package test;
import java.util.Scanner;


public class _12Exception {
	static Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[]args){
		try{
			int age = Age();	
			System.out.println("나이는 :"+ age);
		}catch(_12AgeException e){ //
			System.out.print(e.getMessage());
			e.printStackTrace();
		}finally{
			scan.close();		
		}
		
}

	static int Age() throws _12AgeException{ //스테틱 생략
		System.out.println("나이 :");	
		int age=scan.nextInt();  // 따로 타입 주기 생략
	if(age<0){
		throw new _12AgeException();
	}else{
		/*System.out.println("나이는 : " + age);*///->불필요한 출력문 추가
		return age;
}			
} 
		
}
