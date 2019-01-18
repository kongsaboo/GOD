package REVIEW;

import java.util.HashMap;
import java.util.Map;

public class _01HashMapEx {

	public static void main(String[] args) {
		Map<String, _01Student> map = new HashMap<String, _01Student>();
	
		//map.put (key, value)
		map.put("a11", new _01Student(1, "김정남"));
		map.put("a21", new _01Student(2, "정남"));
		map.put("a31", new _01Student(3, "김남"));
		
		//모든 항목 출력
		System.out.println(map);
		
		//a21 하나의 항목 삭제
		map.remove("a21");
		System.out.println(map);
		
		//하나의 항목 추가 ...b33
		map.put("b33", new _01Student(6,"정섭"));
		System.out.println(map);
		/*
		 * for-each 문
		 * for (type 변수명 : 결과값)-> 모든 결과값을 변수명에 담는다.
		 * 
		 * Map.Entry<String,_01Student > str --> 인터페이스 <key타입, value타입> 맵이름(변수명)
		 * entrySet()메소드는 map을 구성하는 기본단위인 Entry를 java.util.set의 형태로 변환한다.
		 * Entry 인터페이스는 하나의 key와 하나의 value를 나타낸다.
		 */
		for(Map.Entry<String, _01Student > str : map.entrySet()) { //키와 밸류 값을 모두 읽어내기 위해 Map.Entry와 Map.entrySet()을 이용한다.
			String key= str.getKey();
			 _01Student value = str.getValue();
			 System.out.println("KEY :" + key +",value : "+ value);
		}
	}
}
