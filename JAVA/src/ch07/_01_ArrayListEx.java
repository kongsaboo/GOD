package ch07;

import java.util.ArrayList;
import java.util.Iterator;

public class _01_ArrayListEx {

	public static void main(String[] args) {
		/*	<면접>
		 * List : 인터페이스로서, 순서를 가지는 요소들의 모임, 중복된 요소를 가질 수 있다.
		 * 		   리스트의 가장 큰 특징은 index를 사용하여 요소에 접근한다는 점이다.
		 * 		   리스트에 들어있는 요소들의 인덱스는 0부터 시작한다.
		 * 		   종류 : ArrayList, Vector, KinkedList
		 * 
		 * ArrayList : 배열의 향상된 버전이며, 가변크기의 배열이다.
		 * 				저장되는 데이터의 갯수에 따라 자동적으로 크기가 변경된다.
		 * 				요소가 가득차게 되면 ArrayList의 크기를 동적으로 증가시킨다.
		 * 				반대로 요소가 삭제되면 그만큼 크기를 줄이게 된다.
		 * 1.선언
		 * ArrayList<데이터타입 클래스> list = new ArrayList<데이터타입 클래스>();
		 * 
		 * 다형성 적용
		 * List<데이터타입 클래스> list = new ArrayList<데이터타입 클래스>();
		 * 
		 * 2. 특징 : 데이터 순서가 있고, 중복허용된다.
		 * 
		 * 3. 추가 : list.add(추가할 위치 index(순서), 값);
		 * 4. 변경 : list.set(교체할 위치 index, 값);
		 * 5. 삭제 : list.remove(삭제할 위치 index);
		 * 6. 값 가져오기 : list.get(가져올 index);  list.size(); 만큼
		 * 7. 검색 : 
		 * 
		 * 8. 전체 삭제 : list.clear();
		 */
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("milk");
		list.add("bread");
		list.add("butter");
		list.add(1,"grape"); //1자리에 포도추가 빵과 버터는 밀리고
		list.set(2, "apple"); // 2자리인 빵이 사과로 변경
		list.remove(3); // 3자리인 버터가 삭제
		for (int i=0; i<list.size(); i++) {  //ArrayList의 길이는 length가 아닌 변수명.size()
		System.out.println(list.get(i)); //
		}
		System.out.println("==================");
		/*
		 * for-each 루프
		 * 	- 변수에 배열의 요소가 차례대로 대입되면서 반복된다.
		 * 	- for(변수 : 배열){
		 * 		System.out.println(변수명)
		 * }
		 */
		for (String glocery : list) { // 타입과 변수명은 list다  , list= 객체의 배열명 -->배열의 값 전부를 포문돌린다
			System.out.println(glocery);
			
		}
		System.out.println();
		//ArrayList를 이용해 계절을 출력한다.
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("봄");
		list2.add("여름");
		list2.add("가을");
		list2.add("겨울");
		
		//방법1 for문 -배열의 길이를 넣어서 구한다
		for(int i =0; i<list2.size();i++) {
		System.out.println(list2.get(i));	
		}
		
		System.out.println("=================");
		
		//방법2 - for each문
		for(String season : list2) {
			System.out.println(season);
		}
		//방법3 반복자(Iterator)사용하기
		/*
		 * -사용목적 : 반복자는 java.util 패키지에 정의되어 있는 Iterator 인터페이스를 구현하는 객체이다.
		 * 			즉 컬렉션의 원소들에 접근하는 것이 목적이다.
		 * 
		 * -사용메소드
		 * 	hasNext() : 아직 접근하지 않은 요소가 있으면 true를 반환
		 * 	next() : 다음 요소를 반환 ..object 타입을 반환
		 * 	remove() : 최근에 반환된 원소를 삭제
		 */
		/*String rr;
		Iterator e = list2.iterator();
		while (e.hasNext()) {
			
		}*/
		System.out.println("=====================");
		ArrayList<String> hobby = new ArrayList<String>();
		hobby.add("수영");
		hobby.add("독서");
		hobby.add("여행");
		hobby.add("헬스");
		hobby.add("음악감상");
		
		//방법3. 반복자 사용하기
		String str = " ";
		Iterator chi = hobby.iterator();
		
		while(chi.hasNext()) {			// ArrayList에 값이 존재하는지 물어봄
			str=(String)chi.next();  //문자열이 필요한데 object형을 리턴하기 때문에 형변환 필요
			System.out.println(str + " ");
		}
		
		//for-each 문
		System.out.println("=====================");
		for(String hob : hobby) {
			System.out.println(hob);
		}
	}
}
