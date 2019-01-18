package REVIEW;

import java.util.*;

public class _04HashMapFrequency {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		String[] sample= {"toi", "ffg", "dfqe", "dflakj", "dkeir", "dikd"};
		
		//빈도계산
		for(String a : sample) {
			Integer freq = map.get(a);
			map.put(a, (freq ==null) ? 1 : freq+1);
		}
		System.out.println(map.size());
		System.out.println(map.containsKey("tti"));
		System.out.println(map.isEmpty());
		System.out.println(map);
		
	
	}
}
