package chap12;

public class BankSystem {

	public static void main(String[] args) {
		// 계좌 생성, 입금, 출금, 잔액조회 (Thread 사용)
		BankAccount account = new BankAccount(20000); 
		/*
		 * System.out.println("계좌 생성 후 : " + account.getBalance());
		 * 
		 * account.deposit(10000); account.withdraw(14000);
		 * 
		 * System.out.println("현재 잔액 : " + account.getBalance());
		 */
		
		Thread dTread = new Thread(new DepositTask(account));
		
		Thread wTread = new Thread(new WithdrawTask(account));
		
		Thread bTread = new Thread(new BalanceTask(account));
		
		
		dTread.start();
		wTread.start();
		bTread.start();
		
		
		
		
		Thread dTread2 = new Thread(() -> {
			account.deposit(5000);
		});
		
		Thread wTread2 = new Thread(() -> {
			account.withdraw(4000);
		});
		
		Thread bTread2 = new Thread(()->{
			System.out.println("현재 잔액은 " + account.getBalance());
		});
		
		dTread2.start();
		wTread2.start();
		bTread2.start();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
