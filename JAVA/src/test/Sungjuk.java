package test;

public class Sungjuk {

	
	//멤버변수
		private int java ;  //타입 안씀
		private int jsp;
		private int spring;

		//생성자
		public Sungjuk() {
		
	}
		//매개 생성자
		public Sungjuk(int java, int jsp, int spring){
		  this.java = java;
		  this.jsp = jsp;
		  this.spring = spring ;

	}

		public void setJava(int java){
		   this.java = java;	
	}
		public void setJsp(int jsp){
		   this.jsp = jsp;	
	}

		public void setSpring(int spring){
		   this.spring = spring;	
	}
		public int getJava(){
		    return java ;
	}
		public int getJsp(){
		    return jsp ;
	}
		public int getSpring(){
		    return spring ;
	}
		public int getTotal(){
		    return getJava()+ getJsp()+getSpring() ;
	}
		public float getAvg(){
		    return getTotal() /3 ; //getTotal 괄호 오류
	}

		public char getGrade(){
		  char grade = ' '; 

		  switch((int)getAvg()/10){
			case 10 : //케이스옆 공백 오류
			case 9 :
			   grade = 'A';
			   break ;
			case 8 :
			   grade = 'B';
			   break ;
			case 7 :
			   grade ='C';
			   break ;
			case 6 :
			   grade = 'D';
			   break ;
			default :
			   grade ='F';
			   break ;

	}
		return grade;
	}
		public void getInfo(){
		  System.out.println("Java : "+getJava()+ "\nJsp : "+ getJsp()+ "\nSpring : "+ getSpring() +
				"\n총점 :" +getTotal()  +"\n학점 : "  +getGrade()  ) ;
		  System.out.printf("평균 : %.2f\n", getAvg()); //getAvg(철자오류) 소수점 두째자리 %.2f
		  /*System.out.println();*/
		  /*System.out.print("\n");*/
	}
		
		
		
}
