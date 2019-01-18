package ch05;

public class _06_electromachineMainEx {
	
	public static void main(String[] args) {
		
		_06_Computer eem = new _06_Computer("노트북", "lg", 15000, 200);
			System.out.println(eem);
		
		_06_electroMachine em = new _06_electroMachine("갤력시","삼성",4562);
			System.out.println(em.toString());
			
}
}	
	/*
[name=노트북, brand=lg, price=15000, point=200]
[name=갤력시, brand=삼성, price=4562]
*/

