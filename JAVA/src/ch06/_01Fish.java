package ch06;

public class _01Fish extends  _01Animal{ // 상속 받고 추상부모클래스의 추상메소드를 오버라이드 해야함

	@Override
	public void move() {
		System.out.println("헤엄치다");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("물고기밥을 먹다");
	}

}
