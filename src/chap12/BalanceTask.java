package chap12;

public class BalanceTask implements Runnable{
	private BankAccount account;
	
	public BalanceTask(BankAccount account) {
		this.account = account;
	}
	
	public void run() {
		System.out.println("현재 잔액 :" + account.getBalance());
	}
	
	

}
