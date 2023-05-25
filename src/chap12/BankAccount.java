package chap12;

public class BankAccount{
	private int balance;
	
	// 생성자로 객체생성시 초기 금액 입력 (계좌 생성)
	public BankAccount(int balance) {
		this.balance = balance;
	}
	
	// 입금과 출금은 동시 작동이 불가
	// 입금  sync 
	public synchronized void deposit(int amount) {
		this.balance += amount;
		System.out.println("입금 금액 : " + amount + "\t입금 후 잔액 : " + getBalance());
	}
	
	// 출금 sync
	public synchronized void withdraw(int amount) {
		this.balance -= amount; 
		System.out.println("출금 금액 : " + amount + "\t출금 후 잔액 : " + getBalance());
	}
	
	// 잔액조회 
	public synchronized int getBalance() {
		return balance;
	}
	
	
	
	
	

}
