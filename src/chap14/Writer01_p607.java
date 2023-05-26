package chap14;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

// 문자열을 보내기 위해 write
//  
public class Writer01_p607{
	public static void main(String[] args) {
		Writer writer = null;		// 객체 성성시 try문에서 사용하면 try문 안에서만 사용할 수 있는 지역변수가 되어버리므로 전역변수로 생성  
		String str = "abcc한글c1414141c";
		try {
			writer = new FileWriter("C:/MyFolder/javaTest.txt");
			writer.write(str);	
			writer.flush();			
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
