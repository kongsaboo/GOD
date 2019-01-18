package ch05;

public class _08_Callbyrefer {

	int value =0; // 변수로 주소값에 할당
	
	public int getValue() { //메서드로 주소값에 할당
		return value;
	}
	
	//_08_Callbyrefer ctr = obj;
	// _08_Callbyrefer ctr = new _08_Callbyrefer
	public void inc( _08_Callbyrefer ctr ) { //주소값 100 ->_08_Callbyrefer = 데이터타입 
		ctr.value = ctr.value+1;					// ctr =변수명
		System.out.println("ctr.value : "+ctr.value);
			
		
	}
}
