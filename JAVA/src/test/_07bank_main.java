package test;

public class _07bank_main {
	  public static void main(String[]args){
		  
		  	// 다형성 적용
		    _07Bank bank = new _07Woribank("우리은행","이정섭",45000, 4.5);
		      	
		    	//다형성을 적용했을지라도 오버라이드 메소드 호출시 자식의 메소드 호출
		    	System.out.println(bank);//스트링을 통한  출력문을 안씀
		    	
		    	/*bank.getBankname();
		      	bank.getName();
		      	bank.getBalance();
*/
			/*_07Woribank ww = (_07Woribank)bank; //소괄호 추가오류
				//ww.getIr(); // 형변환시 변수명 변경 안함
				System.out.println();
			*/
		     _07Bank bank1 = new _07Kookmin("국민은행", "이상아", 550000,2.2);
		     	System.out.println(bank1);
		    /* bank1.getBankname();
		     	bank1.getName();
		     	bank1.getBalance();*/

		 	/*_07Kookmin kk = (_07Kookmin)bank1;//소괄호 추가오류
		 		kk.getLoan();
		 		System.out.println(kk);*/
		     	
		     	
		     	
}
		}
