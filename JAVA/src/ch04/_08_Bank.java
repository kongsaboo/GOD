package ch04;

public class _08_Bank {
	private String bankname;
	private String name;
	private int money;
	private String telN;

	public _08_Bank(String bankname, String name, int money, String telN) {
		System.out.println("======매개생성자======");
		this.bankname = bankname;
		this.name = name;
		this.money = money;
		this.telN = telN;

	}

	public void setBankname(String bankname) {
		this.bankname = bankname;

	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMoney(int money) {
		this.money = money;

	}

	public void setTelN(String telN) {
		this.telN = telN;

	}

	//public void bankInfo() {
	//	System.out.println("은행명 :" + bankname + "\n이름 : " + name + "\n입금액 : " + money + "\n연락처 : " + telN);

		
	//}
	
	public void bankInfo() { // 함수 호출  get함수명 +()
		System.out.println("은행명 :" + getBankname() + "\n이름 : " + getName() + "\n입금액 : " + getMoney() + "\n연락처 : " + getTelN());

	}
	public String getName() {
		return name;
		
	}

	
	public String getBankname() {
		return bankname;
		
	}
	public int getMoney() {
		return money;
		
	}
	public String getTelN() {
		return telN;
		
	}
}


