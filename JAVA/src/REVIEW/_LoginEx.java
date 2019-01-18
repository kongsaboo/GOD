package REVIEW;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
public class _LoginEx {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("0000", "청");
		map.put("0001", "산");
		map.put("0002", "에");
		map.put("0003", "살");
		map.put("0004", "어");
		map.put("0005", "리");
		map.put("0006", "랏");
		
		String id=" ";
		String pwd=" ";
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디 :");
			id=scan.nextLine();
			
			System.out.println("비밀번호 :");
			pwd=scan.nextLine();
			
			if(map.containsKey(id)) {
			
			if(map.get(id).equals(pwd)) {
				System.out.println("로그인성공");
				break;
	
			}else {
				System.out.println("비밀번호 불일치");
			}	
			}else {
				System.out.println("아이디가 존재 안함");
			}
		}
		scan.close();
	}
}
