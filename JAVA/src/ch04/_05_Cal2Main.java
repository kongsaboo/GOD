package ch04;

public class _05_Cal2Main {

	public static void main(String[] args) {
		
		_05_Cal2 cc = new _05_Cal2(); //객체생성
		
		double sum = cc.add(4.0, 2.0); //맞는 타입을 준다
		double div =cc.div(4.0, 2.0);
		double mod =cc.mod(4.0, 2.0);
		double sub =cc.sub(4.0, 2.0);
		double mul=cc.mul(4.0, 2.0);
		
		System.out.println("mod : "+mod);
		System.out.println(div);
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mul);
		
	}
}
