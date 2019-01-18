package ch09;

public class _05StringBuffer {
	public static void main(String[] args) {
		/*
		 * StringBuffer : 문자열을 추가하거나 변경할 때 주로 사용하는 자료형
		 * - 추가 : append()
		 * - 삽입 : insert(시작위치, 문자열) : 특정위치에 원하는 문자열을 삽입
		   - substring(시작위치, 끝위치) : 시작위치에서 끝위치 까지의 문자열을 추출한다.(공백포함) <중요>		   - 
		   				인덱스는 0부터 시작하며, 끝위치는 실제위치 -1;
		   - toString() : 메소드를 이용해서 String 자료형으로 변경한다.
		 */
		
		StringBuffer sb = new StringBuffer();
		sb.insert(0, "간절한 ");
		sb.append("절박함이 ");
		sb.append("기적을 ");
		sb.append("만든다.");
		System.out.println(sb.toString());
		System.out.println("sb : "+sb);
		
		//절박함
		System.out.println(sb.substring(4, 7)); //실제위치 : 4~6
		//기적을
		System.out.println(sb.substring(9, 11)); //실제위치 : 9~10 
	}
}
