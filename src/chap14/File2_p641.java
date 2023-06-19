package chap14;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class File2_p641 {
	File dir = new File("C:\\MyFolder\\IOTest/mydir/noStatic");
	
	// 생성자
	public File2_p641() {
		makeFolderNS();
	}
	
	
	public static void main(String[] args) throws Exception {
		
		File2_p641 fileTest = new File2_p641();	// 생성자 내에서 명시
		fileTest.makeFolderNS();	// 생성한 객체 내에서 메서드 호출 -> 일반적인 방법
		
		
		// 폴더 및 파일 생성
		makeForder("C:\\MyFolder\\IOTest/mydir/method");
		makeFile("C:\\MyFolder\\IOTest/mydir/myfile4.txt");
		makeFile("C:\\MyFolder\\IOTest/mydir/myfile5.txt");
		makeFile("C:\\MyFolder\\IOTest/mydir/myfile6.txt");
		
		// 특정 디렉토리안의 파일목록조회
		showDir("C:\\MyFolder\\IOTest/mydir");
	}
	
	
	// 필드와 매서드를 같이 사용하여 폴더(파일)생성 - static 사용 x 
	public void makeFolderNS () {
		if(dir.exists()==false) {dir.mkdirs();}
	}
	
	
	// 폴더 생성
	public static void makeForder(String dirRoot) throws Exception{
		File dir = new File(dirRoot); 
		if(dir.exists()==false) {dir.mkdirs();}
	}
	
	// 파일생성
	public static void makeFile(String fileRoot) throws Exception{
		File file = new File(fileRoot); 
		if(file.exists()==false) {file.createNewFile();}
	}
	
	// 폴더 내 파일목록 보기
	public static void showDir(String dir){
		File temp = new File(dir);
		File[] contents = temp.listFiles();
		
		for (File item:contents) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			System.out.println(sdf.format(new Date(item.lastModified())));
			
			if(item.isDirectory()) {
				System.out.println("<DIR> \t" + item.length() + "\t" + item.getName());
			} else {
				System.out.println(item.length() + "\t" + item.getName());
			}
		}
	}

}
