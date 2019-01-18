package ch04;

public class Reviewingch {
	
	public static void main(String[] args) {
		/*
		 * ***성적표***
		 * ============================
		 * 번호 : 국어 	영어 	수학	 총점	 평균	학점
		 * ============================
		 * 1  	100 100 100 300 100
		 * 2  	90 	90 	90	270 90
		 * 3  	80 	80	80	240	80
		   4  	70 	70	70	210	70
		 * 5  	60 	60	60	180	60
		 * ============================
		 * 합계 	400	400 400
		 * 평균 : 소수점 이하 둘째자리
		 * scores 2차원 배열 : 국,영,수
		 * 		   총점, 평균 과목합계 , 학점 직접계산
		 */
		int [][] scores= { {100,100,100},
							{90,90,90},
							{80,80,80},
							{70,70,70},
							{60,60,60}
				
		};
		//타이틀 출력
				System.out.println("                   ******성적표*******                  ");
				System.out.println("=======================================================");
				System.out.println("번호\t"  +"국어\t"+  "영어\t"  +"수학\t"+  "총점\t"+ " 평균\t" +"학점\t");	
				System.out.println("=======================================================");
	
				
				int kortot =0;
				int engtot =0;
				int mathtot =0;
				
				
				
				//행 : 학생수.. 배열길이=5
				for (int i=0; i<scores.length;i++) {
					
					System.out.print((i+1)+ "\t"); //번호출력
			
					kortot+=scores[i][0];  //j열이 0일때 i행의 값을 누적한다 
					engtot+= scores[i][1]; //j열이 1일때 i행의 값을 누적한다
					mathtot+= scores[i][2];// mathtot+= +=의 공백위치 조심!!
					
					char grade =' ';
					int sum=0;
					float avg = sum/scores[i].length; //sum/3
					//열 : 과목수 ...배열길이=3
					for(int j=0; j<scores[i].length ;j++) {
						
						sum+=scores[i][j]; //i값은 고정이고 j값은 누적 -->j포문안에서만 돌기 때문
						System.out.print(scores[i][j]+"\t");  //과목들출력
						
						
					
						
					}
					System.out.print(sum+"\t");
					 avg = sum/scores[i].length; //sum/3
					System.out.printf("%.2f" ,avg);
				
					// 학점
					switch((int)avg/10) {
					case 10 :
					case 9 :
						grade = 'A';
						break ;
					case 8 :
						grade ='B';
						break;
					case 7 :
						grade= 'C';
						break ;
					case 6 :
						grade ='D';
						break ;
					default :
						grade = 'F';
						break;
				}
				
					System.out.print("\t"+grade);
					System.out.println();
				
				}
				System.out.println("===================================================");
				System.out.println("합계 : \t"+kortot+"\t"+engtot+"\t"+mathtot);
	}
	
}

	