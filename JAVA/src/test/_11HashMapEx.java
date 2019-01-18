package test;

import java.util.HashMap;
import java.util.Map;

public class _11HashMapEx {
	public static void main(String[] args) { // 메인 빼먹음
		Map<String, _11Member> member = new HashMap<String, _11Member>();
		member.put("mem001", new _11Member("id01", "홍길동1", "대치동")); // put을 다른걸로 씀
		member.put("mem002", new _11Member("id02", "홍길동2", "신림동")); // 중괄호 뒤에 생략
		member.put("mem003", new _11Member("id03", "홍길동3", "가산동"));

		System.out.println(member);

		member.remove("mem003");
		System.out.println(member);

		member.put("mem005", new _11Member("idKim", "김철수", "문래동")); // put을 add로 쓰고 맨마지막 중괄호 생략
		System.out.println(member);

		for (Map.Entry<String, _11Member> str : member.entrySet()) { // 엔트리 이용한 포 이치문 문법 틀림

			String key = str.getKey();
			_11Member value = str.getValue(); // 변수명.get메소드 인데 변수명. 생략
			System.out.println("키 :" + key + ",값 :" + value);
		}
	}/*
	 * for-each 문 for(type 변수명 : 결과값) ==> 모든 결과값을 변수명에 담는다.
	 * 
	 * Map.Entry<String,_04Student > str ==>인터페이스<key타입 , value타입> 맵이름(변수명)
	 * entrySet() 메소드는 map을 구성하는 기본단위인 Entry를 java.util.set의 행태로 변환한다. Entry 인터페이스는
	 * 하나의 key와 하나의 value를 나타낸다.
	 * 
	 */
}
