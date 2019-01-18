package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class _01FileOutputStream {
	public static void main(String[] args) throws IOException {
		/*
		 * 스트림: 시냇물이라는 뜻이지만 프로그램에서는 1차원적인 데이터의 흐름을 말한다.
		 * 자바에서는 입력되고 출력되는 모든 데이터를 스트림 형태로 주고 받는다.
		 * 
		 * 데이터 방향
		 * 1) 입력스트림 : 밖에서 프로그램 안쪽으로 들어오는 스트림
		 * 2) 출력스트림 : 프로그램 밖으로 나가는 스트림
		 * 
		 * 데이터 형태
		 * 1) 문자스트림 : 사람이 이해할 수 있는 문자로 구성된 스트림
		 * 2) 바이트스트림 : 사람이 이해할 수 없지만, 프로그램에서 사용할 수 있는 데이터(8비트)로 구성된 스트림
		 */
		
		//바이트 스트림 -한단어씩 입출력
		InputStream in =null;
		OutputStream out = null;
		
		try {
			in = new FileInputStream("C:\\DEV43\\file\\_01inPutStream.txt");//직접생성
			out = new FileOutputStream("C:\\DEV43\\file\\_01outPutStream.txt");//자동생성
			
			
			//방법1
			/*int c;
			while((c=in.read()) != -1) {
				out.write(c);
			}*/
			
			//방법2
			while(true) { //무한루프
				/*
				 * InputStream 클래스의 추상메소드
				 * - abstract int read();
				 * - 1바이트씩 읽어서 반환한다.(0~255 사이의 정수)
				 * - 만약 파일의 끝이면 -1을 반환한다.
				 */
				int i =in.read(); // 데이터를 1바이트씩 읽어들인다.
				if(i == -1) {//파일의 끝
					System.out.println("출력완료");
					break; //파일의 끝이면 와일문을 빠져나가
				}
				out.write(i); //읽은 파일을 출력하라.
			}
		}catch(FileNotFoundException e){
			System.out.println(e.getMessage());
		
		}finally {
			if (in !=null) in.close();
			if(out !=null) out.close();
		}
	}
}
