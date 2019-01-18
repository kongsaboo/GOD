package ch06;

public class _01Animal_Main {

	public static void main(String[] args) {
		_01Animal ani = new _01Bird() ;
		ani.eat();
		ani.move();
	
		System.out.println();
		
		_01Animal fi = new _01Fish();
		fi.eat();
		fi.move();
		
		//_01Animal aa = new _01Animal(); >>객체생성 안됨
}
	}