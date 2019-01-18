package test;

public class _04heritage_wori extends _01heritage {
	private double ir ;	//이자율
	
	public void setIr(double ir){
	    this.ir = ir;

}
	public double getIr(){ //get 빼먹음
	     return ir ;
}

	public _04heritage_wori(){  // 기본

}
	public _04heritage_wori(String bankname, String account, String customer, int balance, double ir){
  		super(bankname, account, customer, balance);
		this.ir = ir;
}

	public void printInfo(){
		System.out.print("\n은행명 : " + getBankname() + "\n계좌번호: "+getAccount()+
				"\n예금주 : "+ getCustomer()+"\n잔고 : "+getBalance() ); //소괄호 오류
		System.out.print("\n이자율 : " + getIr()); //소괄호 오류
}
}
