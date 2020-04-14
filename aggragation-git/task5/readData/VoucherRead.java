package by.htps.task.readData;

import java.util.Scanner;

public class VoucherRead {

	public String choiсeTransport() {
		System.out.println("введите название транспорта");

		Scanner Input = new Scanner(System.in);
		String n = Input.nextLine();
		return n;
	}

	public int choiсeDay() {
		System.out.println("введите количество дней");

		Scanner Input = new Scanner(System.in);
		int n = Input.nextInt();
		return n;
	}

	public boolean choiсeFood() {
		System.out.println("питание включено?");

		Scanner Input = new Scanner(System.in);
		String n = Input.nextLine();
		if (n.equals("да")) {
			return true;
		}
		else return false;
	}

}
