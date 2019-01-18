package REVIEW;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class _05DataInpuStream { //특정 파일안에 코드를 이용하여 값을 넣기
	public static void main(String[] args) throws IOException {
		Scanner scan =null;
		
		// 초기값 설정
		int sum=0;
		PrintWriter out = null;
		String str = " ";
		
		try {
			out = new PrintWriter(new FileWriter("C:\\DEV43\\file\\04_FileWriter.txt"));
			//println()메소드는 한줄을 쓰는 메소드
			out.println("4");
			out.println("eat");
			out.println("paly");
			out.println("love");
			out.println("34");
			out.println("112");
			
			out.flush(); //수동으로 비워줌
			
			//2. FileWriter파일을 읽어와 스캔에 담는다 이때 파일은 FileWriter와 동일 파일을 읽어온다.
			scan = new Scanner(new BufferedReader(new FileReader("C:\\DEV43\\file\\04_FileWriter.txt")));
			
			//3. scan에서 읽은 값들을 더해서 콘솔에 출력
			while(scan.hasNext()) { // 뒤에 문자가 있다면
				if(scan.hasNextInt()) {
					sum += scan.nextInt(); //숫자들을 누적하여 더한다
				}else {
					str +=scan.next(); //문자를 누적
				}
			}
			System.out.println("sum = "+ sum);
			System.out.println("문자열 = "+ str);
			System.out.println("작업완료");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if(out !=null) out.close();
				
		}
	}
}
