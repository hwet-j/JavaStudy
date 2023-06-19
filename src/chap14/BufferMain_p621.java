package chap14;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
성능 항샹 보조스트림 - 메모리버퍼를 추가적으로 제공하여 프로그램의 출입 실행 성능을 향상
BufferedInputStream bis = new BufferdInputStream(바이트기반 입력스트림);
BufferedReader br = new BufferedReader(문자기반 입력스트림);
BufferedOutputStream bos = new BufferedOutputStream(바이트기반 출력스트림);
BufferedWriter bw = new BufferedWriter(문자기반 출력스트림);

*/

public class BufferMain_p621 {
	static int data = -1;
	
	public static void main(String[] args) throws Exception {
		// BufferMain_p621.class.getResource("li.jpg").getPath();
		
		// 상대경로로 불러왔기 때문에 파일을 동일 폴더에 넣어서 확인
		//String oriPath = "C:\\MyFolder\\IOTest/li.jpg";
		String oriPath = BufferMain_p621.class.getResource("li.jpg").getPath();
		String copyPath = "C:\\MyFolder\\IOTest/licopy.jpg";
		String copyPath2 = "C:\\MyFolder\\IOTest/libufcopy.jpg";
		
		// 바이트기반 입력스트림 생성
		FileInputStream fis = new FileInputStream(oriPath);
		
		// 바이트기반 출력스트림 생성
		FileOutputStream fos = new FileOutputStream(copyPath);
		
		long nbtime = copy(fis, fos);
		System.out.println("버퍼를 사용하지 않았을 때 : \t" + nbtime + " ns");
		
		// 버퍼 보조 스트림에 연결 기본 스트림 생성
		FileInputStream fis2 = new FileInputStream(oriPath);
		FileOutputStream fos2 = new FileOutputStream(copyPath2);
		// 버퍼 보조 스트림 연결
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		
		long btime = copy(bis,bos);
		System.out.println("버터를 사용했을 때 : \t\t" + btime + " ns");
		
		//BufferedReader br = new BufferedReader();
		//BufferedWriter bw = new BufferedWriter()
		
		fis.close();
		fos.close();
		fis.close();
		fos2.close();
		bis.close();
		bos.close();
		
	}
	
	// 매개변수에 입출력 스트림을 받아서 실행시간을 리턴
	private static long copy(InputStream is, OutputStream os) throws IOException {	// 다형성에 의해서 FileInputStream이 아닌 InputStream으로 매개변수를 받아 작성한다.
		long start = System.nanoTime();
		while(true) {
			data = is.read();
			if(data == -1)break;
			os.write(data);
		}
		os.flush(); // 버터를 사용할 때 필요
		
		
		
		long end = System.nanoTime();
		
		return end-start;
	}
}
