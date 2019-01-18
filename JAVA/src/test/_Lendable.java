package test;

public interface _Lendable {
	public static final int STATE_BORROWED=1;
	public static final int STATE_AVAILABLE=0;

	public void checkIn();
	public void checkOut(String borrower, String date);

}
