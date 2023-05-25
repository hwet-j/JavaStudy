package chap12;

public class WithdrawTask implements Runnable{
	private BankAccount account;
	
	public WithdrawTask(BankAccount account) {
		this.account = account;
	}
	
	public void run() {
		account.withdraw(200);
	}
	
	

}
