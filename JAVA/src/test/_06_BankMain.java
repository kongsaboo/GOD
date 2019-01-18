package test;

public class _06_BankMain {
	public static void main(String[] args){ //String 철자순서 오류
		
	_06_Bank b = new _06_Bank();

	
	
	b.setBankname("국민은행");  //set 설정값 입력 못함
	b.setMoney(500000);
	b.setName("이상철");
	b.setTelN(15455125);
	b.printInfo();
	
	_06_Bank a = new _06_Bank("신한",
			"이정섭",45132245, 5547412) ;
			a.printInfo();
		
	
}
}
