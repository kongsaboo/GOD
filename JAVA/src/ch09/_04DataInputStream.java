package ch09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class _04DataInputStream { 
	public static void main(String[] args) {
		Scanner scan = null;
		int sum=0;
		PrintWriter out = null;
		String str = " ";
		try {
			out = new PrintWriter(new FileWriter("C:\\DEV43\\file\\04_FileWriter.txt"));
			out.println("4 ");
			out.println("\tFeel so good ");
			out.println("\twhat a wonderful world");
			out.println("1000");
			/*
			 * .txt -> FileReader->in.read()->BufferedOutputStream : 버퍼-> OutputStream-> 화면출력
			 * 
			 * 버퍼 스트림은 버퍼를 가지고 있기 때문에 버퍼가 꽉 찼을 때만 출력되는 특징이 있다.
			 * 그러므로 프로그램에서 데이터를 출력하였지만 버퍼에 들어있어 출력장치에 보이지 않을 수도 있다.
			 * 버퍼가 다 차지 않은 상태에서 버퍼에 있는 데이터를 강제로 출력장치로 보니려면 flush()메소드를 호출
			 * out.flush(); // out스트림의 버퍼에 있는 데이터를 모두 출력장치에 출력
			 */
			out.flush();//버퍼를 수동으로 비우기..scan에서 값을 못읽어오므로
			
			//2.04_FileWriter.txt 파일을 읽어와서 scan에 담는다. 반드시 동일파일에서 읽어온다.
			scan = new Scanner(new BufferedReader(new FileReader("C:\\DEV43\\file\\04_FileWriter.txt")));
			
			//3.Scan에서 읽어온 값들을 더해서 콘솔에 출력 
			while(scan.hasNext()) { //뒤에 문자가 있을때 돌아라
				if(scan.hasNextInt()) {
					sum += scan.nextInt(); //숫자
					
				}else {
					str+=scan.next(); //문자
				}
			}
			System.out.println("sum : " +sum);
			System.out.println("문자열 :" + str);
			System.out.println("작업완료");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}finally {
			if(out != null) out.close();
		}
	}
	
}
