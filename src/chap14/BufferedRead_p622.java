package chap14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class BufferedRead_p622 {

	public static void main(String[] args) throws IOException {
		Reader reader = new FileReader("C:\\MyFolder\\IOTest/ReadTest.txt");
//		Reader reader = new FileReader(BufferedRead_p622.class.getResource("ReadTest.txt").getPath());
		
		BufferedReader br = new BufferedReader(reader);
		
		while(true) {
			String data = br.readLine();	// 줄단위 
			if(data == null)break;
			System.out.println(data);
		}
		br.close();
		
		
	}

}
