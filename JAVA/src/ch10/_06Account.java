package ch10;

public class _06Account {
	String accountNo; //계좌번호
	String ownerName; // 예금주 잔액
	int balance; //잔액
	//기본생성
	public _06Account() {
		
	}
	//매개생성
	public _06Account(String accountNo, String ownerName, int balance) {
		this.accountNo =accountNo;
		this.ownerName=ownerName;
		this.balance =balance;
		
		
	//메소드 -get			
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	//메소드 -입금
	public void deposit(int amount) {
		balance +=amount;
	}
	//메소드 - 출금
	public int withdrow(int amount) {
		if(balance<amount) return 0;
		balance-= amount;
		return amount;
	}
}
