package chap12;

public class DepositTask implements Runnable{
	private BankAccount account;
	
	public DepositTask(BankAccount account) {
		this.account = account;
	}
	
	public void run() {
		account.deposit(100);
	}
	
	

}
