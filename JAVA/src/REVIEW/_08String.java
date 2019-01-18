package REVIEW;

public class _08String {
	public static void main(String[] args) {
		String proverb = "What a wonderful world!!";
		String w1, w2, w3, w4;
		//문자열 길이 
		System.out.println("문자열 길이 : "+ proverb.length());
		//문자열결합 - 기존 문장 뒤에 이어붙임
		w1 = proverb.concat("Here is full of surprise!!");
		System.out.println("w1 :" +w1);
		//문자 교환
		w2= w1.replace('o', 'b');
		System.out.println("w2 :" + w2);
		//부분문자 추출
		w3 = w1.substring(5, 12);
		System.out.println("w3 : "+ w3);
		//대문자로 일괄변환
		w4 = w1.toUpperCase();
		System.out.println("w4 :" + w4);
	}
}
