package REVIEW;

public class _05StringBuffer {
	public static void main(String[] args) {
		/*
		 * StringBuffer : 문자열을 추가하거나 변경할 때 주로 사용하는 자료형
		 * - 추가 : append()
		 * - 삽입 : insert(시작위치, 문자열) : 특정위치에 원하는 문자열 삽입
		 * - substring(시작위치, 끝위치) : 시작부터 끝까지 문자열 추출 - 인덱스는 0에서 시작, 끝위치는 실제위치 -1
		 * - toString() : 메소드를 이용해서 String 자료형으로 변경
		 */
		
		StringBuffer sb = new StringBuffer();
		sb.append("절박함이");
		sb.append("기적을");
		sb.append("만든다");
		sb.insert(0, "간절한");
		sb.insert(7, "놀라운"); // 단어가 들어갈 위치로 선정
		
		//
		System.out.println(sb.substring(10, 12));
		System.out.println(sb.substring(0, 3));
		System.out.println(sb);
		
	}
}
