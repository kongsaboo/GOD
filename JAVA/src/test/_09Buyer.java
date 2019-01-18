package test;

public class _09Buyer {
	 
	private int money = 1000000 ;
	private int point ;

	  /*  public _09Buyer(){ //불필요한 삽입

	}*/
	   
	    public void buyer(_09Electro elect){
	    	
	    

	    	/*  public int getMoney(){  // 바이어에 갯메소드 넣을 필요 없음
	    		 	return money- =getPrice();

	    		}
	    		     public int getPoint(){
	    			return point + = getBonus();
	    		}
*/

	    if (money<elect.getPrice()){ // 다형성의 변수. 생략
		System.out.print("잔금부족");
		
	    }else{
		//제품정보
	    System.out.print(elect.toString()+ "\t 가격 :"+elect.getPrice());
	    
	    //잔액
	    money -= elect.getPrice(); // 바이어 메소드의 다형성 적용한 부모변수의 변수명 입력 생략
		System.out.print("\t 잔액 :"+money);
		double bonus = 0;
		if(elect instanceof _09Laptop) {
			bonus = ((_09Laptop) elect).getBonus();
		
		
		} else if(elect instanceof _09Audio){
			bonus = ((_09Audio) elect).getBonus();
		}
		System.out.print("\t 보너스 :" +bonus);	
	}
	    System.out.println();
	    }
}
