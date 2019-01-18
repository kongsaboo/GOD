package test;

public class _08Sungjuk {
	public static void main(String[]args){
		
		int [][] jumsu={{100, 90, 80, 70},{90,80,90,80},{80,100,90,80},{70,80,50,30}};
		// 앞에 private으로 지역선언하고 중괄호 빼먹음
		
		
		System.out.println("========자바 전문가과정======");
		System.out.println("no\t java \t jsp\t spring\t sql");

		
		int javaTot =0; //완전까먹음
		int jspTot =0;
		int springTot =0;
		int sqlTot =0;
		
		//행 학생넘버
		for(int i=0 ; i<jumsu.length; i++){ // 타입 빼먹음, 배열변수명안씀
		System.out.print((i+1)+"번째 : \t");
	
		
		javaTot+= jumsu[i][0];
		jspTot+= jumsu[i][1];
		springTot += jumsu[i][2];
		sqlTot+= jumsu[i][3];
		int sum =0;
		float avg = sum/jumsu[i].length; 
		
			//열 학생들의 점수
		    for(int j=0 ; j<jumsu[i].length; j++){ //변수명 생략오류
			
			sum+= jumsu[i][j]; // 누적식에서 +는 꼭 =랑 붙여쓴다. 스페이스 용납X
		    System.out.print(jumsu[i][j]+ "\t");	 //과목 출력문
			
	}	
			
			
		char grade = ' ';
		avg = sum/jumsu[i].length;
		switch((int)avg/10){
			case 10 : // 기호 빼먹음
			case 9 :
			   grade = 'A';
			   break;
			case 8 :
			    grade ='B';
			    break ;
			case 7 :
			    grade ='C';
			    break;
			case 6 :
			    grade ='D';
			    break;
			default :
			   grade = 'F';
			   break;
	}
		
		System.out.print("총점 : "+sum + "\t평균 :"+avg+"\t학점 : "+ grade);
		System.out.println();
	}
		System.out.println("합계 :\t"+ javaTot+"\t" +jspTot+"\t"+ springTot+"\t"+sqlTot+"\t");
	}
		}
