package test;

public class _07Woribank extends _07Bank{
	private double ir ;
	   
	   public _07Woribank(){
		
	}
	   public _07Woribank(String bankname, String name , int balance, double ir){
		super(bankname, name, balance);
		this.ir = ir;
	}
	   /*public void ir(){  // 쓸데없는 값설정
		System.out.println(4.5);
	}*/ 
	   
	    public double getIr(){
		return ir;
	}
	    public String toString() {
			return "은행이름 : " + getBankname() + ", 이름 : " + getName() + ", 은행잔고 : " + getBalance()
					+ ", 이자율 : "+getIr();
		}  //to String의 리턴형 오류 + get 뒤에 소괄호 생략
}
