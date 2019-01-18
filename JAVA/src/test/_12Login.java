package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _12Login {
	public static void main(String [] args){
		Scanner scan = new Scanner (System.in);	
		Map<String, String> map = new HashMap<String, String>();
		map.put("0001", "p01");
		map.put("0002", "p02");
		map.put("0003", "p03");
		map.put("0004", "p04");
		map.put("0005", "p05");

		String id = " ";
		String pwd = " ";

		System.out.print("아이디 : ");
		id = scan.nextLine();	

		System.out.print("비밀번호 : ");
		pwd = scan.nextLine();

		if (map.containsKey(id)){
		
		if(map.get(id).equals(pwd)){
			System.out.println("로그인에 성공");
		}else{
			System.out.println("비밀번호가 틀렸습니다.");
		}
		}else{
			System.out.println("아이디가 없습니다.");
	}
		scan.close();	
	}
		
}
