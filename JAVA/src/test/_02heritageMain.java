package test;

public class _02heritageMain   {

	public static void main (String[]args){
		
		_04heritage_wori wori = new _04heritage_wori ();
		     	wori.setBankname("우리");
			wori.setAccount("45126488");
			wori.setCustomer("이정섭");
			wori.setBalance(450000);
			
			wori.setIr(2.5); //세미콜론 오류
			wori.printInfo();
	

		_03heritage_kakao kao = new _03heritage_kakao();
			kao.setBankname("카카오뱅크");
			kao.setAccount("4512644588");
			kao.setCustomer("이상아");
			kao.setBalance(4510000);
			
			kao.setLoanrate(5.5); //set 생략
			kao.printInfo();

			System.out.println("\n================================");
			
			_04heritage_wori wori1 = new _04heritage_wori ("우리","454577","이이",887551, 4.5); // setter문과 변수명 중복
			wori1.printInfo();  // 괄호안에 슈퍼에서 불러올 값을 넣지 않음


			_03heritage_kakao kao1 = new _03heritage_kakao("카카오","777845","정민",445122,1.2);
			kao1.printInfo();  // 괄호안에 슈퍼에서 불러올 값을 넣지 않음

}
}
