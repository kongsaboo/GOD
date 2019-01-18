package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class _02ImageCopy {
	public static void main(String[] args) throws Exception {
			Scanner input = new Scanner(System.in);
			
			System.out.print("원본파일을 입력하세요 :");
			String inputFileName = input.next();
			
			System.out.print("복사파일 입력: ");
			String outputFileName = input.next();
			
			InputStream in = null;
			OutputStream out = null;
			
			try {
				in = new FileInputStream(inputFileName);
				out = new FileOutputStream(outputFileName);
				
				int i = 0;
				while((i=in.read())!=-1) {
					out.write(i);
				}
				System.out.println(inputFileName+"을 "+outputFileName+"으로 복사하였다");
				
			}catch(FileNotFoundException e){
				System.out.println(e.getMessage());
			}finally {
				if(in != null) in.close();
				if(out !=null) out.close();
			}
			
	}
/*
 * 원본파일을 입력하세요 :C:\DEV43\file\mini.jpg
복사파일 입력: C:\DEV43\file\happymini.jpg
C:\DEV43\file\mini.jpg을C:\DEV43\file\happymini.jpg으로 복사하였다

 */
	
	
}
