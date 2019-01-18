package REVIEW;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class _P622_FileError {

	private int[] list ;
	private static final int SIZE = 10;
	
	public _P622_FileError() {
		list = new int[SIZE];
		for(int i=0; i<SIZE; i++)
			list[i] =i;
		writeList();
		
		
	}
	public void writeList() {
		PrintWriter out = null;
		try {
			out = new PrintWriter(new FileWriter("outfile.txt"));
			for(int i=0; i<SIZE; i++)
				System.out.println("배열원소" + i + "=" +list[i]);
				
		}catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("ArrayIndexOutOfBoundsException :");
			System.out.println(e.getMessage());
		}catch (IOException e) {
			System.err.println("IOException");
			System.out.println(e.getMessage());
		}finally {
			if(out != null)
				out.close();
		}
	}
	//출력
	public static void main(String[] args) {
		new _P622_FileError();
	}
}
