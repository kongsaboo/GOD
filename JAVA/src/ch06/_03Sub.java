package ch06;

public class _03Sub extends _03Calcurator{

	int a=4;
	int b=2;
	int []array = {2,3,4};
	
	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double average(int[] a) {
		int sum = 0; //sum에 대한 초기화가 에버리지 메서드 안에 있어야 포문 돌때마다 초기화 된다
		System.out.println("sum : "+sum);
		/*System.out.println(a.length);*/
		for(int i=0; i<a.length; i++) {
			//합계
			/*System.out.print(a[i]+", ");*/
			sum+= a[i];
		}
		System.out.println("result sum : "+sum);
		//평균	
		return sum/a.length;
	}

	
}
