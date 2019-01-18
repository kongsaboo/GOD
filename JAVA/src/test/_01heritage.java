package test;

public class _01heritage {

	//멤버변수
			private String bankname ;	// 은행명
			private String account ;	//계좌번호
			private String customer ;  // 예금주
			private int balance ;  //잔고

			public void setBankname (String bankname){ //소괄호 오타
			    this.bankname = bankname;

		}
			public void setAccount(String account){
			    this.account = account ;
		}
			public void setCustomer(String customer){ //set을 두번씀
			     this.customer = customer ;
		}
			public void setBalance(int balance){
			     this.balance = balance;
		}
			
			
			public String getBankname(){
			    return bankname ;

		}
			public String getAccount(){
			    return account;
		}

			public String getCustomer(){
			     return customer;

		}

			public int getBalance(){ //타입오류 + 소괄호 생략
				return balance ;
				
		}
			public void printInfo(){
				System.out.print("\n은행명 : " + getBankname() + "\n계좌번호: "+getAccount()+
						"\n예금주 : "+ getCustomer()+"\n잔고 : "+ getBalance()); //소괄호 하나 생략
		}

			public _01heritage (){ //기본
		}
			
			public _01heritage(String bankname, String account, String customer, int balance){
				this.bankname = bankname;
				this.account = account;
				this.customer = customer;
				this.balance = balance;
		}
}
