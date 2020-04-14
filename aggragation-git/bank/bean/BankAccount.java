package by.htps.task.bean;

public class BankAccount {
	private String name;
	private int sum;
	private boolean lock;
	
	
	
	public BankAccount(String name, int sum, boolean lock) {
		
		this.name = name;
		this.sum = sum;
		this.lock = lock;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public boolean isLock() {
		return lock;
	}
	public void setLock(boolean lock) {
		this.lock = lock;
	}
	
	
	

}
