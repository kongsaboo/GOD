package ch04;

public class _04_Cal {
	
	/*
	 * 메소드 : 클래스 안에 정의된 함수
	 * 		  특정한 작업을 수행하는 문장들의 모임
	 * 		  입력을 받아서  처리 결과를 반환하는 상자
	 * 
	 *  public + 반환형 + 메소드 이름 +(매개변수 1,2...){
	 *  	return 반환값 ; // 처리결과를 반환한다. 반환형과 일치
	 *  }
	 *  반환형이  void로 선언된 메소드는 결과값을 반화 X
	 */
	 public int add(int j, int i) {
		 int result = i+j;
		 //return j+i;
		 return result;
		 
	 }
	 public int sub(int i, int j) {
		 int result = i-j;
		 //return i-j;
		return result;
	 }
	
	
	 public double mul(double i, double j) {
		 return i*j;
	 }
	
	 public double div(double i, double j) {
		 return i/j;
	 }
	 public double mod(double i, double j) {//mod는 나머지
		 return i%j;
	 }
	
	
}
