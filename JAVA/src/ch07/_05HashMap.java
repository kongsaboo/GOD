package ch07;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _05HashMap {

	public static void main(String[] args) {
		/*
		 * 1. id, pwd 5건을 hashtable에 저장
		 * 2. 콘솔로부터 id, pwd를 입력받는다.
		 * 
		 * 1과 2를 비교해서
		 * 3. 아이디가 없으면 "입력하신 아이디가 존재하지 않습니다." 출력
		 * 4. 아이디가 있으면 비밀번호와 비교해서 일치시 "로그인 되었습니다." 출력
		 * 								불일치시 "비밀번호가 일치하지 않습니다." 출력 
		 * 
		 */
	
		// 1. id, pwd 5건을 hashtable에 저장
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("id1", "0111");
		map.put("id2", "1111");
		map.put("id3", "2111");
		map.put("id4", "3111");
		map.put("id5", "4111");
		/*HashMap<String, String > loginInfo = new HashMap<String, String >();
		loginInfo.put("id00", "pw00");
		loginInfo.put("id01", "pw01");
		loginInfo.put("id02", "pw02");
		loginInfo.put("id03", "pw03");
		loginInfo.put("id04", "pw04");
		
		
		// 2. 콘솔로부터 id, pwd를 입력받는다.*/
		String id= " ";
		String pwd= " ";
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("아이디 : ");
			id = scan.nextLine();
			
			System.out.print("패스워드 :");
			pwd = scan.nextLine();
			
			
			if(map.containsKey(id)) {
				
				//로그인 되었습니다. ...비밀번호
				//map.get(id) : 입력받은 id가 key가 된다, 값(패스워드)을 가져온다.
				//map.get(id) : 패스워드
				if(map.get(id).equals(pwd)) {
					System.out.println("로그인 되었습니다.");
					break; //반복문 탈출
			}else { 
				System.out.println("비밀번호가 일치하지 않습니다.");
			}	
			}else {
				System.out.println("입력하신 아이디가 존재하지 않습니다.");
			}
		}
		scan.close();
		//scan.close();
		/*Scanner scan = new Scanner(System.in);
		System.out.println("아이디와 비밀먼호를 입력하세요.");
		String id = scan.nextLine();
		// 3. 해시테이블안에 아이디와 비번(키값과 밸류값)이 있으면 로그인. 
		for (int i=0; i<loginInfo.size(); i++) {
			
		
		if(loginInfo)  {
			System.out.println("로그인 되었습니다.");//"로그인 되었습니다." 출력 또는
		}else {
			System.out.println("아이디가 일치하지 않습니다.");//"비밀번호가 일치하지 않습니다." 출력
			return;
		}
			
		// 4. 아이디가 없으면
		Scanner scan1 = new Scanner(System.in);
		System.out.println("아이디와 비밀먼호를 입력하세요.");
		String pwd = scan1.nextLine();
		if() {
			
		}
	}*/	//"입력하신 아이디가 존재하지 않습니다." 출력
}
	}