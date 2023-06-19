package chap14;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class File_p641 {

	public static void main(String[] args) throws IOException {
		// File 객체 생성
		File dir = new File("C:\\MyFolder\\IOTest/mydir/ddd/dirdir/rr");
		File file1 = new File("C:\\MyFolder\\IOTest/mydir/myfile1.txt");
		File file2 = new File("C:\\MyFolder\\IOTest/mydir/myfile2.txt");
		File file3 = new File("C:\\MyFolder\\IOTest/mydir/myfile3.txt");

		// 물리적 생성
		if(dir.exists()==false) {dir.mkdirs();}
		if(file1.exists()==false) {file1.createNewFile();}
		if(file2.exists()==false) {file2.createNewFile();}
		if(file3.exists()==false) {file3.createNewFile();}
		
		
		// mkdir  : 마지막에 명시된 폴더 경로가 존재하지 않으면 생성 (경로에 접근조차 불가능하면 생성안됨)
		// mkdirs : 명시된 경로중 필요한 폴더는 전부 생성
		// createNewFile : 명시된 경로의 파일을 생성 ( mkdir은 폴더가 생성, 이것은 파일임 )
		
		// 특정 디렉토리안의 파일목록조회
		File temp = new File("C:\\MyFolder\\IOTest/mydir");
		File[] contents = temp.listFiles();
		
		
		for (File item:contents) {
			// System.out.println(item);	// 전체 경로 뽑힘
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			System.out.println(sdf.format(new Date(item.lastModified())));
			// 날짜 형식은 쓰기 좋은 형식을 기억해두는게 좋음 ( DB에 입력할 때 필요하다. 형식은 자유지만 바꾸는 방법을 기억 )
			
			if(item.isDirectory()) {		// 폴더인지 확인
				System.out.println("<DIR> \t" + item.length() + "\t" + item.getName());
			} else {
				System.out.println(item.length() + "\t" + item.getName());
			}
		}
		
		// length는 파일 크기, getName은 파일의 이름과 확장자명
	}
	

}
