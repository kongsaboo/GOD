package REVIEW;

public class _07Account {
	//멤버변수
	String accountNo; //계좌
	String ownerName; //예금주 이름
	int balance; // 잔액
	//기본생성
	public _07Account() {
		// TODO Auto-generated constructor stub
	}
	//매개생성
	public _07Account(String accountNo, String ownerName, int balance) {
		this.accountNo =accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}	
	//메소드 -get
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	//메소드 입금
	public void deposit(int amount) {
		balance +=amount; 
	}
	//메소드 -출금
	public int withdrow(int amount) {
		if(balance<amount) return 0;
		balance -=amount;
		return amount;
	}
}
