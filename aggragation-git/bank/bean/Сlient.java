package by.htps.task.bean;

import java.util.ArrayList;

public class Сlient {
	private String name;
	private ArrayList<BankAccount> bankAccount = new ArrayList<BankAccount>();

	public Сlient(String name) {
		this.name = name;
	}

	public Сlient(String name, ArrayList<BankAccount> bankAccount) {

		this.name = name;
		this.bankAccount = bankAccount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<BankAccount> getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(ArrayList<BankAccount> bankAccount) {
		this.bankAccount = bankAccount;
	}

	public void setBankAccount(BankAccount bank) {
		this.bankAccount.add(bank);
	}

}
