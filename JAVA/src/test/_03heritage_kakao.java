package test;

public class _03heritage_kakao extends _01heritage {
	private double loanrate ;

	public  _03heritage_kakao(){ //기본

}
	public _03heritage_kakao(String bankname, String account, String customer, int balance, double loanrate){
		super(bankname, account, customer, balance);
		this.loanrate = loanrate;
}
	
	public void setLoanrate(double loanrate){
		this.loanrate = loanrate;

}
	public double getLoanrate(){
		return loanrate;
}
	public void printInfo(){
		System.out.print("\n은행명 : " + getBankname() + "\n계좌번호: "+getAccount()+
				"\n예금주 : "+ getCustomer()+"\n잔고 : "+getBalance() ); //소괄호 오류
		System.out.print("\n대출금리 : " +getLoanrate()); //소괄호 오류

}
}