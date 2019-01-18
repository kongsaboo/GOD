package ch03;

public class _03_ArrayEx {
	public static void main(String[] args) {
		/*
		 * p173
		 * 2차원 배열
		 * 1. 방법1
		 *    int[][] 배열명 = new int[행의 갯수][열의 갯수]
		 * 
		 * 2. 방법2 
		 * 	  int[][] 배열명 ={ //값을 덮는 중괄호가 없으면 1차원 배열이 3개
		 * 					{값1, 값2, 값3},
		 * 					{값4, 값5, 값6},
		 * 					{값7, 값8, 값9},....
		 *					 }
		 */

		int[][] sung = new int[3][5];
		
		//첫번째 사람
		System.out.println("1번째\n");
		sung[0][0] = 100;
		sung[0][1] = 90;
		sung[0][2] = 80;
		sung[0][3] = 270;
		sung[0][4] = 90;
		
		System.out.println("2번째\n");
		sung[1][0] = 100;
		sung[1][1] = 100;
		sung[1][2] = 100;
		sung[1][3] = 300;
		sung[1][4] = 100;
		
		System.out.println("3번째\n");
		sung[2][0] = 80;
		sung[2][1] = 80;
		sung[2][2] = 80;
		sung[2][3] = 240;
		sung[2][4] = 80;
		
		for (int i=0; i<sung.length; i++ ) { //행 :0~2
			System.out.print(i+"번째 :");
			
			for(int j=0 ; j<sung[i].length ; j++) {//열 : 0~4 --> 열은 행에 의해 조정되므로 행의길이를 넣는다 sung[i]
					System.out.print(sung[i][j]+" " );
			}
		
				System.out.println();
			
		}
			
		
		/*int[][] sung =
		for(int i=0 ; i<sung.length ; i++) {
			*/
			
		}
		
		
	}

	

