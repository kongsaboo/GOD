package test;

import java.util.Scanner;

public class _05MemberExMain {
	static Scanner scan = new Scanner(System.in);
	public static void main(String []args){
		try{
			_05MemberInfo info = readAll();
			info.PrintMemInfo(); //출력문 생략
		}catch(_05NameException e){
			e.WrongNameInfo(); //대문자 오류
		}catch(_05AgeException e){
			e.WrongAgeInfo();
		}finally{
			scan.close();
		}

}
	static String readName() throws _05NameException{
		System.out.print("이름을 입력하세요 : ");
		String name = scan.next();
		if(name.length()<2){
			throw new _05NameException(name);
		}else{
			return name;
}
}

	static int readAge() throws _05AgeException{
		System.out.print("나이를 입력하세요 : ");
		int age = scan.nextInt(); // 그냥 next();는 안됨
		if(age <0){
			throw new _05AgeException(age);
		}else{
			return age;
}
}
	static _05MemberInfo readAll() throws _05NameException,_05AgeException{
		int age =readAge();
		String name= readName();
		return new _05MemberInfo (name, age);
}
}
