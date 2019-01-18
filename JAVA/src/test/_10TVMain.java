package test;

public class _10TVMain {
	public static void main(String []args){

		_10Buyer buy = new _10Buyer(1000000);
		
		
		_10SamsungTV samtv = new _10SamsungTV(300000);
		
		samtv.turnOn();
		samtv.turnOff();
		
	}
}
