package ch10;

import java.util.Random;

public class _05VoteThread implements Runnable{

	//멤버변수
	int sum=0; // 총개표수
	int targetNum = 100; //개표율 100%
	Random random = new Random(); //개표율 속도 - 랜덤객체생성 
	
	@Override
	public void run() {
		StringBuffer sb = new StringBuffer(); // *모양의 그래프를 출력하기 위함
		
		while(true) {
			sum +=random.nextInt(10); // 10까지의 난수 발생숫자를 누적
			sb.delete(0, sb.toString().length()); //초기화 ... *길이만큼 
			
		//	System.out.println("-----START---------");
			
			if(sum>= targetNum) {
				sum =100;
				for(int i=0; i<sum; i++) {
					sb.append('*');
				}
			//	System.out.println("100이상");
				System.out.println(Thread.currentThread().getName()+ "개표율 : " + sum + "\t"+sb);
				break;
			}else {
				for(int i=0 ; i<sum; i++) {
					sb.append('*');
					
				}
			//	System.out.println("100이하");
				System.out.println(Thread.currentThread().getName()+ "개표율 : " + sum + "\t"+sb);

			}
			try {
				Thread.sleep(50); 	//1000밀리초 =1초 /500밀리초 = 0.5초
			}catch(Exception e){ 	//cpu의 시간을 다른 스레드에 넘겨주는 효율적인 방법. 현작업을 중지하고 넘겨준다.
				e.printStackTrace();
			}
		}
	}

}
