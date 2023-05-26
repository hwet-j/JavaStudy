package chap14;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Read01_p596 {
	public static void main(String[] args) throws IOException {
		// byte배열 일부 입력받기
		InputStream is = new FileInputStream("C:\\MyFolder\\javaWrite1.txt");
		System.out.println(is.read());
		System.out.println(is.read());
		System.out.println(is.read());
		System.out.println(is.read());
		System.out.println(is.read());
		is.close();
		
		InputStream is2 = new FileInputStream("C:\\MyFolder\\javaWrite1.txt");
		while(true) {
			int data = is2.read();
			if (data == -1) break;
			System.out.println(data);
		}
		is2.close();
		
		InputStream is3 = new FileInputStream("C:\\MyFolder\\javaWrite1.txt");
		byte[] buffer = new byte[100];
		
		while(true) {
			// int data = is3.read(buffer);
			int data = is3.read(buffer, 1 , 6);
			if (data == -1) break;
			for(int i=0;i<buffer.length;i++) {
				System.out.println(buffer[i]);
			}
		}
		is3.close();
		
		
		
	}
}

