package ch11;

import java.util.ArrayList;

public class _04Main {
	public static void main(String[] args) {
		_04Enum e = new _04Enum(animal.CAT, "고양이");
		_04Enum e1 = new _04Enum(animal.DOG, "개");
		_04Enum e2 = new _04Enum(animal.FISH, "물고기");
	
		//리스트에 담는다
		ArrayList<_04Enum> list = new ArrayList<_04Enum>();
		list.add(e);
		list.add(e1);
		list.add(e2);
		//for-each로 출력
		for( _04Enum ee : list) {
			System.out.println("종류 : "+ ee.getKind() + "\t이름 :" + ee.getName());
		}
			
		
	}
}
