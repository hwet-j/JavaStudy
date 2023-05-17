package other2;
import other.AccessModifier01;

public class OtherPack_DiffClass {
	// 다른 패키지 객체사용 ==> public 접근 가능
	AccessModifier01 test = new AccessModifier01();
	// int pri = test.pri;	// private 제한자 접근불가	
	// int pack = test.pack;
	// int pro = test.pro;
	int pub = test.pub;
	
		
}
			
