package ch06;

public class _08_InterfaceEx {

	public static void main(String[] args) {
		/*I10 i10 = new B10();
		i10.play();*/
		
		// 인터페이스의 유연성
		A10 a10 = new A10 ();
		 a10.autoPlay(new B10()); //play라는 메소드는 I10은 추상이고 B10에서 구현되어있기 때문 ->다형성 적용
		 a10.autoPlay(new C10());
	}
	
}

class A10 {
	public void autoPlay(I10 i10) { //메소드에서 I10이라는 타입에 i10 매개변수를 가져온다
		i10.play(); //인터페이스의 추상메소드 호출
		i10.dance();
	}
	
}

interface I10{
	public abstract void play(); //추상메소드-바디없다
	public void dance();
	
	
}
// I10이라는 인터페이스 구현

class B10 implements I10{

	@Override
	public void play() {
		System.out.println("B10클래스 - play() 호출");
	}

	@Override
	public void dance() {
		// TODO Auto-generated method stub
		
	}
	
}


class C10 implements I10{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.print("플레이C10");
	}

	@Override
	public void dance() {
		// TODO Auto-generated method stub
		System.out.println("    훌라");
	}
	
	
}
