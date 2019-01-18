package REVIEW;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class _05BufferedReader {
	public static void main(String[] args) throws IOException {
		//한줄단위 입출력
		BufferedReader in = null;
		PrintWriter out = null;
		
		try {
			in = new BufferedReader(new FileReader("C:\\DEV43\\file\\_03FileReader.txt"));
			out = new PrintWriter(new FileWriter("C:\\DEV43\\file\\_03Filewriter.txt"));
			
			int i;
			while((i=in.read())!= -1) {
				out.write(i);
			}
			System.out.println("출력완료");
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}finally {
			if(in !=null) in.close();
			if(out != null) out.close();
		}
		
	}
}
