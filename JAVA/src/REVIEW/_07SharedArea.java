package REVIEW;

public class _07SharedArea {
	_07Account account1; //김태희 계좌
	_07Account account2; //비 계좌
	//계좌이체 -메소드
	synchronized void transfer(int amount) {
		account1.withdrow(amount);
		System.out.println("김태희 계좌 : "+amount + "인출,");
		
		account2.deposit(amount);
		System.out.println("비 계좌 : "+ amount + "입금");
	}
	//메소드 - 잔액 합계
	synchronized int getTotal() {
		return account1.getBalance()+account2.getBalance();
	}
}
