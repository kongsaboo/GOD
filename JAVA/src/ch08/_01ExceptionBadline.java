package ch08;

public class _01ExceptionBadline {

	public static void main(String[] args) {
		/*int[] array = new int [10];
		
		for (int i=0; i<10; i++)
			array[i]=0;
		
		int result = array[10];
		System.out.println("문장샗");
		*/
		int [] array = new int[10];
		
		for (int i = 0 ; i<10 ; i++) 
			array[i] =0;  // array[i]는 위에 for문에 초기값을 준 i(for문의 식이 적용되는)를 배열에 넣겠다.
			
			try {
				int result = array[12];
				
			} catch(ArrayIndexOutOfBoundsException e){
				System.out.print("배열의 인덱스가  잘못됨 : ");
				System.out.println(e.getMessage());
			}finally {
				System.out.println("탐색완료");
			}
			
			System.out.println("문장샐행");
			
			
		System.out.println("================");
		
		
	}
}
