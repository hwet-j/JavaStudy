package other;

public class SamePack_DiffClass {
	// 같은 패키지 객체사용	  ==> default, protected, public 접근 가능
	AccessModifier01 test = new AccessModifier01();
	//int pri = test.pri;	// private 제한자 접근불가	
	int pack = test.pack;
	int pro = test.pro;
	int pub = test.pub;
	
		
}
			
