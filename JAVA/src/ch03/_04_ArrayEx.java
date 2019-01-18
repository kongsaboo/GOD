package ch03;

public class _04_ArrayEx {

	public static void main(String[] args) {
		String[][] fruits = { { "사과", "복숭아", "포도" }, { "수박", "참외", "토마토" }, { "한라봉", "레몬", "자몽" } };

		for (int i = 0; i < fruits.length; i++) {
			for (int j = 0; j < fruits[i].length; j++) {

				System.out.printf("[%d][%d] : %s", i, j, fruits[i][j]);
			}
			System.out.println();
		}

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
		
		int [][] jumsu = {
				{100, 100, 100},
				{90, 90, 90},
				{80,80,80},
				{70,70,70},{60,60,60}
		};
		
		//타이틀 출력
		System.out.println("                   ******성적표*******                  ");
		System.out.println("=======================================================");
		System.out.println("번호\t"  +"국어\t"+  "영어\t"  +"수학\t"+  "총점\t"+ " 평균\t" +"학점\t");	
		System.out.println("=======================================================");
		
		
		  
		for (int i =0; i< jumsu.length ; i++) { // length=5
	
		System.out.print((i+1)+"번째 : \t");
			
			for(int j=0; j<jumsu[i].length ;j++) {
			System.out.print(jumsu[i][j]+" \t");
				
			/*int sum1 =0;
			sum1+= jumsu[i][j];*/
				
			}
			
	
		int sum = jumsu[i][0] + jumsu[i][1]+jumsu[i][2] ;
		float avg = (int)sum/3 ;	
		char grade =' ';
		
			switch((int)avg /10) {
			
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
				case 5 :
					grade = 'F';
					break;
			}
				
			
			
			 												
			System.out.print(sum); 		// 포문 안에 있어서 i값이 포문을 완전히 	// 빠져나가기 전까지 0으로 고정됨
			
			System.out.printf( "\t%.2f ",avg);
			System.out.print("\t"+grade);
			System.out.println();
			
		
			//System.out.print(sum+ " ");
			
		}
			System.out.print("======================================================="+"\n합계 :");
		
		
		for (int j = 0; j < 3; j++) {
			int sum = 0;
			for (int i = 0; i <jumsu.length ; i++) {
				sum += jumsu[i][j]; //sum=sum+[i]
			
			}
			System.out.print(sum+" ");
		}
	}	
		}
			
			
			
				
			
			
		
	

