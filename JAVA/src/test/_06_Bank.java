/**
 * 
 */
package test;

/**
 * @author k
 *
 */
public class _06_Bank {
	private String bankname;
	private String name;
	private int money;
	private int telN ;

	
public _06_Bank(){
   System.out.println("====기본생성자=====");

}
public _06_Bank(String bankname, String name, int money, int telN){
    System.out.println("======매개생성자======");
	this. bankname = bankname;
	this. name = name;
	this. money = money;
	this. telN = telN;
	

}

public void printInfo(){
   System.out.println("은행명 :"+bankname+"\n이름 : "+name+"\n입금액 : "+money+"\n연락처 : "+telN); //오타 tel

}

public void setBankname(String bankname){
   this. bankname = bankname;
	

}
public void setName (String name){
   this.name = name;
   
}
public void setMoney(int money){
    this.money = money;

}
public void setTelN(int telN){
    this.telN = telN;
}

public String getBankname(){
     
     return  bankname; //int result = bankname을 추가 이하 get 다 오류

}

public String getName(){
     
     return name;
	}

public int getMoney(){
     
     return money;
}

public int getTelN(){
     
     return telN;
}
}
