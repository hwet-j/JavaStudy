package chap14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Write01_p596 {
	public static void main(String[] args) throws IOException {
		// byte배열 일부 전송 
		System.out.println("byte 배열 일부 전송");
		System.out.println();
		OutputStream os3 = new FileOutputStream("C:\\MyFolder\\javaWrite1.txt");
		byte[] array3 = {100, 110, 120, 122, 124};
		os3.write(array3, 1, 3);	// (배열, start int, length);
		os3.flush();		// 현재 버퍼에 저장되어있는 내용을 클라이언트로 전송하고 버퍼를 비운다. ( 버퍼에 데이터가 있던 없던 강제로 버퍼에서 데이터를 밀어낸다.) 
		os3.close();		// 명시적으로 스트림을 닫아준다. (자바 I/O 스트림을 닫음)
		// flush로 버터를 비우고 close로 스트림을 닫아준다.
		
		
		
		
		
		
		
		System.out.println("배열전체 전송");
		System.out.println();
		// byte배열 전체 전송
		OutputStream os2 = new FileOutputStream("C:\\MyFolder\\javaWrite1.txt");
		byte[] array2 = {100, 110, 120, 122, 124};
		os3.write(array2);
		os3.flush();		 
		os3.close();		
		
		// 1byte씩 전송
		System.out.println("1byte씩 전송");
		System.out.println();
		
		OutputStream os = new FileOutputStream("C:\\MyFolder\\javaWrite.txt");
		
		byte b1 = 0;
		byte b2 = 10;
		byte b3 = 20;
		
		os.write(b1);
		os.write(b2);
		os.write(b3);
		
		
		
	}
}