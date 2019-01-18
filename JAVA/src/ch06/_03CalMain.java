package ch06;

public class _03CalMain {
	public static void main(String[] args) {
	

	 _03Sub cal = new  _03Sub();
	 System.out.println("덧셈 : "+cal.add(4, 2));
	 System.out.println("뺄셈 :"+cal.subtract(4, 2));
	 
	 int[] a= {2,3,4};
	 System.out.println("평균 :" +cal.average(a));
	 
	 // int []a ={2,3,4};
	 // int []a  = new int[]{2,3,4};
	 System.out.println(cal.average(new int[] {2,3,4}));
	}
}
