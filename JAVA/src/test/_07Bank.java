package test;

public class _07Bank {
	private String bankname;
	private String name;
	private int balance;

	public String getBankname() {
		return bankname;
	}

	public String getName() {
		return name;

	}

	public int getBalance() {
		return balance;

	}

	public _07Bank(){ //기본
		

	}

	public _07Bank(String bankname, String name , int balance){
		this.bankname = bankname;
		this.name = name;
		this.balance = balance;
	}

	public String toString() {
		return "은행이름 : " + getBankname() + ", 이름 : " + getName() + ", 은행잔고 : " + getBalance();
	}  //to String의 리턴형 오류 + get 뒤에 소괄호 생략
}
