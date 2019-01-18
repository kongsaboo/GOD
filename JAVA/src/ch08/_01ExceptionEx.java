package ch08;

public class _01ExceptionEx {

	public static void main(String[] args) {
		int[] array = new int[10];
		
		for(int i=0 ; i<10 ; i++) 
			array[i]=0;
		
		try {
			int result= array[12];
		}catch (Exception e) {
				
			System.out.println("배열의 인덱스가 잘못 되었습니다 : "+e.getMessage());  //getMessage 값인 12가 출력됨
			//e.printStackTrace(); -> 예외처리에 대한 디테일 실행
			}
			System.out.println("문장실행 ");
	
	}
}
