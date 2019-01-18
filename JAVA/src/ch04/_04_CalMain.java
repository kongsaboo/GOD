package ch04;

public class _04_CalMain {

	public static void main(String[]args) { //메인 메서드에서는 static 입력  필!!
		_04_Cal me = new _04_Cal();
		
		int sum = me.add(8, 4);
			System.out.println(sum);
			
		
			double mod = me.mod(8.0, 4.0);
			System.out.println(mod);
		
			double div = me.div(8.0, 4.0);
			System.out.println(div);
			
			double mul= me.mul(8.0, 4.0);
			System.out.println(mul);
			
			int sub = me.sub(8, 4);
			System.out.println(sub);
			
			
			
	}
}
