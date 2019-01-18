package test;

public class _AppCDInfo extends _CDInfo implements _Lendable{

	//멤버변수
	private String borrower;  //대출자
	private String checkOutDate;  // 대출일자
	private int state;  // 대출여부
	
	//생성자
	public _AppCDInfo(){

}
	public _AppCDInfo(String registerNo, String title){
		super(registerNo, title);  // 수퍼  변수명 생략
		
}

	//만약에 대출중 상태가 아니면
	//메소드
	@Override
	public void checkIn(){
		if(state != STATE_BORROWED){
		System.out.println("이미 반납된 상태입니다.");
		return;  
}
		
		this.borrower=null;
		this.checkOutDate= null;
		this.state =STATE_AVAILABLE;
		System.out.println( super.getTitle()+"이 반납되었습니다"); //출력문 생략
}
	// 만약에 가능하지 않으면 이미 대출중
	// 
	@Override
	public void checkOut(String borrower, String date){
		if(state != STATE_AVAILABLE){
		System.out.println("이미 대출중입니다.");
		return;
}
	this.borrower = borrower;
	this.checkOutDate =date;
	this.state = STATE_BORROWED;
	System.out.println("대출자: " +borrower + super.getTitle()+"이 대출되었습니다"+"대출일 : " +checkOutDate);
}
	}