package ch06;

public class _06SmartPhone extends _06PDA implements _06MP3Interface, _06MobileInterface{

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		System.out.println("메시지 보낸다");
	}

	@Override
	public void receiveSMS() {
		// TODO Auto-generated method stub
		System.out.println("메시지 받는다");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("뮤직 큐");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("재생정지");
	}

	
}
