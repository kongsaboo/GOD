package ch11;

public class _01StringEx {
	public static void main(String[] args) {
		String proverb = "A Barking Dog ";
		String s1, s2, s3, s4;
		
		//문자열 길이 .length();
		System.out.println("문자열 길이 : "+ proverb.length());//13
		
		//문자열 결합
		s1= proverb.concat("never crying");
		System.out.println("s1 : "+s1);
		
		//문자 교환 
		s2 = s1.replace('r', 'c');
		System.out.println("s2 : "+ s2);
		
		//부분문자열 추출: substring(beginIndex, endIndex) .. 중요
		s3 = s1.substring(2,9);
		System.out.println("s3 : "+ s3);
		
		//대문자로 변환
		s4 = proverb.toUpperCase();
		System.out.println("s4 : "+ s4);
	}
}
