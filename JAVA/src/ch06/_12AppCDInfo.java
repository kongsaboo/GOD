package ch06;


public class _12AppCDInfo extends _12CDInfo implements _12Lendable{

	//멤버변수
	private String borrower;  //대출인
	private String checkOutDate; //대출일
	private int state;  // 상수 -> 대출상태
	
	//기본생성
	public _12AppCDInfo() {
		// TODO Auto-generated constructor stub
	}
	public _12AppCDInfo(String registerNo, String title) {
		super(registerNo, title);
		/*this.borrower = borrower;
		this.checkOutDate =checkOutDate;*/
	}
	
		public String getBorrower() {
			return borrower;
		}
		public String getCheckOutDate() {
			return checkOutDate;
		}
	
	//대출하다
	@Override
	public void checkOut(String borrower, String date) { // 이곳의 매개변수의 값을 맴버변수로 넘겨라
		if(state !=STATE_NORMAL) {
			System.out.println("이미 대출중입니다.");
			return;
		}
		this.borrower = borrower;
		this.checkOutDate =date;
		this.state=  STATE_BORROWED; //상태 = 대출중
		
		System.out.println("대출상태: "+ "대출중" );
		System.out.println(super.getTitle()+"이 대출되었습니다");
		System.out.println("대출인 :"+getBorrower() );
		System.out.println("대출일 :" + getCheckOutDate());
	}
	
	
	//반납
	@Override
	public void checkIn() {
		// ~중이면 타지 말아라
		if(state !=STATE_BORROWED ) {  // ! = 같지 않다면 
			System.out.println("반납할 수 없습니다.");
			return;
		}
		
		this.borrower = null;
		this.checkOutDate = null;
		this.state = STATE_NORMAL; //반납
		
		System.out.println(super.getTitle()+ "이(가) 반납되었습니다.");
		System.out.println("대출상태 :" + "대출가능");
	}

	
}
