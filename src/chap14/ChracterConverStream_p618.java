package chap14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class ChracterConverStream_p618 {
	static String file_dir = "C:/MyFolder/IOTest/fosTest1.txt";

	public static void main(String[] args) {
		write("한글 English 1234 !#*@");	// 내보내기
		

	}

	private static String read() throws IOException{
		FileInputStream fis = null;
		// 메인 스트림
		fis = new FileInputStream(file_dir);
		// 보조스트림 생성
		Reader reader = new InputStreamReader(fis);
		
		char[] buffer = new char[100];
		int readCharNum = reader.read(buffer);
		reader.close();
		String data = new String(buffer, 0 , readCharNum);
		
		return data;
	}

	private static void write(String info) {
		FileOutputStream fos = null;
		try {
			// 메인 스트림
			fos = new FileOutputStream(file_dir);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// 문자기반 - 보조스트림 생성
		Writer writer = new OutputStreamWriter(fos);
		try {
			writer.write(info);
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
