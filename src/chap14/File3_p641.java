package chap14;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class File3_p641 {
	
	public static void main(String[] args) throws Exception {
		File2_p641 file = new File2_p641();
		// 폴더 및 파일 생성
		file.makeForder("C:\\MyFolder\\IOTest/mydir/method");
		file.makeFile("C:\\MyFolder\\IOTest/mydir/myfile4.txt");
		file.makeFile("C:\\MyFolder\\IOTest/mydir/myfile5.txt");
		file.makeFile("C:\\MyFolder\\IOTest/mydir/myfile6.txt");
		
		// 특정 디렉토리안의 파일목록조회
		file.showDir("C:\\MyFolder\\IOTest/mydir");
	}

}
