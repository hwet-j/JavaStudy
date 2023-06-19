package chap14;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// 객체 입출력 보조스트림을 사용한 예제
public class ObjectStream_p629 {

	public static void main(String[] args) throws Exception {
		writeList();
		
		// 외부파일에서 데이터 읽어와 출력
		for (Board item:readList()) {
			System.out.println(item.toString());
		}
	}
	
	
	// 게시글 보기(읽기) 
	public static List<Board> readList() throws Exception {
		 FileInputStream fis = new FileInputStream("C:\\MyFolder\\IOTest/boardTest.txt");
		 ObjectInputStream ois = new ObjectInputStream(fis);
		 
		 List<Board> list = (ArrayList<Board>)ois.readObject();
		
		 return list;	
	}
	
	// 게시글 작성(쓰기)
	public static void writeList() throws Exception{
		List<Board> list = new ArrayList<Board>();
		Board board = new Board(1, "제목", "내용 내용 내용..", "홍길동", new Date());
		
		list.add(board);
		list.add(new Board(2, "제목임", "내용222 내용22 내용..", "김철수", new Date()));
		
		//readList(list);
		
		// 작성된 내용을 외부파일에 저장(DB를 안쓰기 때문에 임시적으로 사용, 이렇게 사용하기도 할수도)
		FileOutputStream fos = new FileOutputStream("C:\\MyFolder\\IOTest/boardTest.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(list);
		
		oos.flush();
		
		oos.close();
		
		} 
		 
		 
	} 
 
