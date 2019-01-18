package ch04;

public class _08_BankMain {

	public static void main(String[] args) {

		_08_Bank b = new _08_Bank("국민", "박순남", 4500000,

				"010-5548-5487");
		b.bankInfo();
		
		
		// setter getter를 이용
		
		b.setBankname("신한");
		b.setMoney(124520);
		b.setName("이중도");
		b.setTelN("012-5587-7784");
		b.bankInfo();
		
		System.out.println("getter를 이용한 출력");
		System.out.println("은행명 : "+b.getBankname());
		System.out.println("입금자 : "+b.getName());
		System.out.println("입금액 : "+b.getMoney());
	}
}