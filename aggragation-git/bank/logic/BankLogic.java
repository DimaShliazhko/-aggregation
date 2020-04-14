package by.htps.task.logic;


import by.htps.task.bean.BankAccount;
import by.htps.task.bean.Сlient;

public class BankLogic {

	public int totalAmountLock(Сlient client) {
		int sum;
		sum = 0;
		
		for (int i = 0 ; i < client.getBankAccount().size(); i++ ) {
			if( client.getBankAccount().get(i).isLock() == false) {
			sum = sum + client.getBankAccount().get(i).getSum();
		}
		}
		
		return sum;
	}
	
	public int AmountPositive(Сlient client) {
		int sum;
		sum = 0;
		
		for (int i = 0 ; i < client.getBankAccount().size(); i++ ) {
			if( client.getBankAccount().get(i).getSum() > 0) {
			sum = sum + client.getBankAccount().get(i).getSum();
		}
		}
		
		return sum;
	}
	public int AmountТegative(Сlient client) {
		int sum;
		sum = 0;
		
		for (int i = 0 ; i < client.getBankAccount().size(); i++ ) {
			if( client.getBankAccount().get(i).getSum() < 0) {
			sum = sum + client.getBankAccount().get(i).getSum();
		}
		}
		
		return sum;
	}
	
	
	public Сlient sortSum(Сlient client) {
		for (int i = client.getBankAccount().size() - 1; i >= 0; i--) {

			for (int j = 0; j < i; j++) {

				if (client.getBankAccount().get(j+1).getSum() > client.getBankAccount().get(j).getSum()) {

					BankAccount temp;
					temp = client.getBankAccount().get(j);

					client.getBankAccount().set(j, client.getBankAccount().get(j + 1));
					client.getBankAccount().set(j + 1, temp);

				}
				// System.out.println(train.get(i));
			}
		}
		
		
		return client;
	}

}
