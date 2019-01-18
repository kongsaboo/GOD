package test;

public class _07Kookmin extends _07Bank{
	 private double loan;

	    public _07Kookmin(){
	}
	    public _07Kookmin(String bankname, String name , int balance, double loan){
		super(bankname, name, balance); // 수퍼 소괄호 안 값을 넣지 않
		this.loan = loan;
	}
	    /*public void kookmin(){ //쓸데없는 값설정
		System.out.println(1.2);
	}*/
	    public double getLoan(){
	  	return loan;
	}
	    public String toString() {
			return "은행이름 : " + getBankname() + ", 이름 : " + getName() + ", 은행잔고 : " + getBalance()
					+", 대출금리 :" + getLoan(); //super.toString()으로 대출금리 이전까지 대체가능
		}  //to String의 리턴형 오류 + get 뒤에 소괄호 생략
}
