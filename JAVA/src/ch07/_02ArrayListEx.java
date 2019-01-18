package ch07;

import java.util.ArrayList;

public class _02ArrayListEx {
/*
 * 7.검색 : list.indexOf(검색할 값);
 * 	==> 리스트에서 검색할 값과 똑같은 값을 갖는 첫번째 데이터를 찾아서 그 위치의 인덱스를 리턴한다.
 * 		
 * 			list.lastIndexOf(검색할 값);
 * 			==> 리스트에서 검색할 값과 똑같은 값을 갖는 마지막 데이터를 찾아서 그 위치의 인덱스를 리턴한다.
 * 			검색할 값과 일치한 데이터가 없으면 -1을 리턴한다.
 * 
 */
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("H");  //0
		list.add("o");
		list.add("n");
		list.add("g");
		list.add("g");
		list.add("i");
		list.add("l");
		list.add("d");
		list.add("o");
		list.add("n");
		list.add("g");	//10
		
		//일치하는 첫번째 데이터를 찾아서 그 위치의 인덱스 리턴
		System.out.println("G문자의 인덱스 :"+list.indexOf("g") );
		System.out.println("N문자의 인덱스 :"+list.indexOf("n") );
		System.out.println("마지막 인덱스 :"+list.lastIndexOf("g") );
		System.out.println("Z문자의 인덱스 :"+list.indexOf("Z") );
		System.out.println();
		
		
		//전체 리스트 출력 -for each
		for(String hong : list) {
			System.out.print(hong);
		}
		//전체 리스트 삭제
			list.clear();
			System.out.println("\n리스트 삭제후");
			System.out.println("list : "+list);
		
	}
}
