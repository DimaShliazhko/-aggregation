package by.htps.task.view;

import by.htps.task.bean.Сlient;

public class BankView {

	public void printAmount(int sum) {

		System.out.println(sum);
	}
	
	
	public void printClient( Сlient client) {

		System.out.println(client.getName());
		for (int i = 0 ; i < client.getBankAccount().size(); i++ ) {
			System.out.println(client.getBankAccount().get(i).getName());
		}
		
	}
	
	

}
