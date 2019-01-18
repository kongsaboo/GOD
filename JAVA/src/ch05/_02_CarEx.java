package ch05;

public class _02_CarEx {

	public static void main(String[] args) {
		
		
		
		_02_BMW bmw = new _02_BMW();
		bmw.setKind( "안정성X");
		bmw.setSpeed(120);
		bmw.printInfo();
		bmw.fire();
		
		System.out.println("============");
		
		_02_Police pol = new _02_Police();
		pol.setKind("공무원차량");
		pol.setSpeed(100);
		pol.printInfo();
		pol.siren();
	}
}
