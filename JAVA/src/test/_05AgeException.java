package test;

public class _05AgeException extends Exception{
	//멤버변수
		private int wrongAge;
		//기본생성
		public _05AgeException (){}
		//매개생성
		public _05AgeException ( int wrongAge){
			this.wrongAge= wrongAge;
	}
		//메소드 -get
		public int getWrongAge(){
			return wrongAge;
	}
		//메소드 -출력
		public void WrongAgeInfo(){
			System.out.println("잘못된 나이입니다. : " + getWrongAge());
	}
}
