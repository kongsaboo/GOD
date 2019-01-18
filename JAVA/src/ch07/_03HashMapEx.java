package ch07;

import java.util.HashMap;
import java.util.Map;

public class _03HashMapEx {
	public static void main(String[] args) {
	/*
	 * <면접>
	 * 해싱(hashing) : 키를 이용해서 해시테으블로부터 데이터를 가져오는 과정
	 * 
	 * HashMap :
	 * 	- 데이터의 순서를 보장하지 않는다.
	 * 	- key와 value 쌍으로 저장한다.
	 * 	- key는 중복되면 안된다.
	 * 	- key를 이용해서 value를 가져올 수 있다.
	 *  - List 계열과 달리 index가 없다.
	 *  - Map이라는 인터페이스를 구현한 클래스이다.
	 *  
	 *  Map.Entry : 인터페이스
	 *  Map : 인터페이스, Entry : 인터페이스
	 *   - 키와 값을 가진 객체의 순서쌍이다.
	 *   - 키는 getKey() : Object로 사용
	 *   - 값은 getValue() 사용
	 *  예) s.getKey();  / s.getValue();
	 *  
	 *  선언
	 *  - HashMap<key 타입, value 타입> map = new HashMap<key 타입, value 타입>();
	 *	- Map<key 타입, value 타입> map = new HashMap<key 타입, value 타입>(); //다형성적용
	 *
	 * 데이터 추가 : put(key, value)
	 * 데이터 가져오기 : get(key)
	 * 데이터 삭제 : remove(key)
	 * 데이터가 비어 있는지 여부 : isEmpty()
	 * 해당 키가 있는지 여부 : containsKey(key)
	 * 해당 값이 있는지 여부 : containsValue(value)
	 * 해싱 갯수 : size()
	 */
		
		
	//0, "홍길동"	
	Map<Integer, String> map = new HashMap<Integer, String>();	
	map.put(0, "홍길동");
	map.put(1, "홍길자");
	map.put(2, "홍동");
	map.put(3, "홍길");
	map.put(4, "홍길면");
	
	//맵 전체출력
	for(int i =0; i<map.size(); i++) {
		System.out.println(map.get(i));
}
	System.out.println("============");
	
	//데이터 가져오기
	System.out.println(map.get(4));
	
	//데이터 삭제
	map.remove(3);

	for (int i =0; i<map.size(); i++) {
		System.out.println(map.get(i));
	}
	
	System.out.println("============");
	
	//데이터가 비어있는지 여부 : isEmpty()
	System.out.println(map.isEmpty()); //false
	
	System.out.println("==========");
	
	//해당 키가 존재하는지 여부 :containsKey(key)
	System.out.println(map.containsKey(2));
	System.out.println("==========");
	
	//해당 값이 존재하는지 여부 : containsValue(value)
	System.out.println(map.containsValue("홍길면"));
	
	
	}
	
	
}
