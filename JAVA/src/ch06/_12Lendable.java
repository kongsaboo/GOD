package ch06;

public interface _12Lendable {

	//상수
	public static final int STATE_BORROWED=1; //대출중
	public static final int STATE_NORMAL=0;  // 비대출
	
	//추상메소드
	public void checkOut(String borrower, String date); // 대출중이니까 대출정보 넣어야함
	public void checkIn();
}
