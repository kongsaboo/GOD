package REVIEW;

import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class _P623_AutoCloseable {
	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<String> list = new ArrayList<String>();
		list.add("item1");
		list.add("item2");
		list.add("item3");
		list.add("item4");
		
		try(PrintWriter output = new PrintWriter("myoutput.txt")){
			for(String s : list) {
				output.println(s.toLowerCase());
			}
		}
		System.out.println(list.size());
		list.remove("item4");
		System.out.println(list);
		list.add("gold");
		System.out.println(list);
		list.set(2, "silver");
		System.out.println(list);
		System.out.println(list.get(0)); // 값을 불러올때는 위치인덱스로만 불러온다.
	}
	
}
