package by.htps.task.main;

import by.htps.task.bean.BankAccount;
import by.htps.task.bean.Сlient;
import by.htps.task.logic.BankLogic;
import by.htps.task.view.BankView;

public class BankMain {
	
	public static void main(String[] args) {
		
		BankView view = new BankView();
		BankLogic logic = new BankLogic();
				
		Сlient client = new Сlient("Дима");
		BankAccount account1 = new BankAccount("Основной", 120, false);
		BankAccount account2 = new BankAccount("Капитал", -120, false);
		BankAccount account3 = new BankAccount("Базовый", 480, true);
		BankAccount account4 = new BankAccount("Резервный", -20, false);
		client.setBankAccount(account1);
		client.setBankAccount(account2);
		client.setBankAccount(account3);
		client.setBankAccount(account4);
				
		//view.printAmount(logic.totalAmountLock(client));
		//view.printClient(logic.sortSum(client));
		view.printAmount(logic.AmountPositive(client));
		view.printAmount(logic.AmountТegative(client));	
		
		
	}

}
