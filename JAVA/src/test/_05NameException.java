package test;

public class _05NameException extends Exception{
	
		//멤버변수
		private String wrongName;
		//기본생성
		public _05NameException (){}
		//매개생성
		public _05NameException (String wrongName){
			this.wrongName = wrongName;	
	}
		//멤버 메소드 -get
		public String getWrongName(){
			return wrongName;
	}
		//메소드 -출력
		public void WrongNameInfo(){
			System.out.println("잘못된 이름입니다. : " + getWrongName());
	}
}
