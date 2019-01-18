package ch07;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class _04HashMapEx {

	public static void main(String[] args) {

		// "0001" "홍길동"
		Map<String, _04Student> map = new HashMap<String, _04Student>();

		// map.put(key, value);
		map.put("H001", new _04Student(1, "김정남")); // 값을 스튜던트 클래스의 매개생성자로 받고 매개변수값을 넣어준다.
		map.put("H002", new _04Student(2, "정치호"));
		map.put("H003", new _04Student(3, "강경준"));

		// 모든 항목 출력
		System.out.println(map);

		// H002 하나의 항목 삭제
		map.remove("H002");
		System.out.println(map);

		// 하나의 항목 추가 ... H003
		map.put("H003", new _04Student(4, "이정섭"));
		System.out.println(map);

		/*
		 * for-each 문 for(type 변수명 : 결과값) ==> 모든 결과값을 변수명에 담는다.
		 * 
		 * Map.Entry<String,_04Student > str ==>인터페이스<key타입 , value타입> 맵이름(변수명)
		 * entrySet() 메소드는 map을 구성하는 기본단위인 Entry를 java.util.set의 행태로 변환한다. Entry 인터페이스는
		 * 하나의 key와 하나의 value를 나타낸다.
		 * 
		 */
		for (Map.Entry<String, _04Student> str : map.entrySet()) { // 키와 밸류를 모두 읽어 내기 위해 Map.Entry와 Map.entrySet()을 이용한다
			String key = str.getKey();
			_04Student value = str.getValue();
			System.out.println("KEY :" + key + " ,VALUE :" + value);

		}
	}
}
