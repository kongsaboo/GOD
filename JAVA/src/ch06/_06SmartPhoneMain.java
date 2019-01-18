package ch06;

public class _06SmartPhoneMain {

	public static void main(String[] args) {
		_06SmartPhone sp = new _06SmartPhone();
		//sp.calculate(10, 5);--부모
		System.out.println("계산기 :" +sp.calculate(10, 5));
		sp.receiveSMS();
		sp.sendSMS();
		sp.play();
		sp.stop();
		
	}
}
