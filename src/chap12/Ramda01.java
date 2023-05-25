package chap12;

/*Ramda식(Ramda Expression)
 * JAVA8에서 도입.
 * 함수형 프로그래밍 개념
 * 익명함수를 생성하기 위해 간결한 표현방법
 * 함수를  할당,인자로 전달할 수 있다.
 * 코드의 가독성 향상, 간결함, 유연성
 * 
 * (매개변수리스트) -> { 람다식실행코드 }
 * 
 * 작업스레드 객체생성
   public class 작업Thread extends Thread{
     @Override
     public void run(){ 스레드실행코드; }
   }
   Thread thread = new 작업Thread();
 * 
 * Thread를 익명객체로  작업스레드 객체생성
   Thread thread = new Thread(){
  	 public void run(){ 스레드실행코드; }
   }
 * 
 *  
 * ----------------
   public class 작업Thread implements Runnable {
  	  @Override
     public void run(){ 스레드실행코드; }
   }
   Thread thread = new Thread(new 작업Thread());
 
  
  * Runnable인터페이스를 구현한 익명 Thread클래스 객체생성
   Thread thread = new Thread(new Runnable(){
         @Override
         public void run(){ 스레드실행코드; }
      }
   );
 
 * 람다식으로 구현
   Thread thread = new Thread( () -> { 스레드실행코드; }  );
 * 
 */
public class Ramda01 {
	Thread thread = new Thread(new Runnable(){
         @Override
         public void run(){
        	 System.out.println("출력");
         }
      }
   );
	
	// 람다식 표현
	Thread thread2 = new Thread( () -> {System.out.println("출력");});
	
	

}
