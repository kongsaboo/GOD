package ch07;

import java.util.*;

public class _07HashMapEx {

	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<String, Integer>();
		
		String[] sample = {"toi" , "ffg", "dfw", "eadf", "qerd", "toi"};
		
		//빈도계산
		for(String a : sample) { //a 변수가 배열 샘플과 같다면
			Integer freq = m.get(a);
			m.put(a, (freq == null) ? 1 : freq+1); //삼항연산자 변수명이 null이면 1 아니면 변수에 1증가시켜라
		}
		System.out.println(m.size());
		System.out.println(m.containsKey("ffg"));
		System.out.println(m.isEmpty());
		System.out.println(m); // m.toString 이 생략
	}
	
}
