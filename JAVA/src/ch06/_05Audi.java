package ch06;

public class _05Audi implements _05Car{

	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		System.out.println("브랜드명 :"+ BRAND2);
		System.out.println("배기량 :"+DISPLACEMENT2);
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("운전한다");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("제동한다");
	}

	@Override
	public void speedUp(int speed) {
		// TODO Auto-generated method stub
		System.out.println(speed + "km 속도를 올리다");
	}

	@Override
	public void speedDown(int speed) {
		// TODO Auto-generated method stub
		System.out.println(speed + "km 속도를 내리다");
	}

}
