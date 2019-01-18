package ch07;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class _06HashMapEx {

	public static void main(String[] args) {
		//영어사전 작성
		Map<String, String> dictionary = new HashMap<String, String>();
		//dictionay.put (키 , 밸류)
		dictionary.put("school", "학교");
		dictionary.put("miracle", "기적");
		dictionary.put("magic", "마술");
		dictionary.put("class", "계급");
		dictionary.put("mobile", "핸드폰");
		
		String word = " ";
		
		//콘솔로 단어 입력
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("단어입력 :");
			word = scan.next();
			
			if(dictionary.containsKey(word)) { //만약 사전이 워드의 값을 갖고 있으면 출력해라
				System.out.println("단어의 의미 :"+dictionary.get(word)); //입력한 단어를 가지고 값을 검색한다.
			}else if(word.equals("q")) {
				System.out.println("시스템종료");
				break;
				//q일때 빠져나온다
				}else {
					System.out.println("없는 단어 입니다.");
				}
		} 
		scan.close();
	
	}
}
