package by.htps.task.view;

import by.htps.task.bean.TravelAgency;

public class VoucherView {

	public void printVoucher(TravelAgency travelAgency) {
		for (int i = 0; i < travelAgency.getVouncher().size(); i++) {
			System.out.println(travelAgency.getVouncher().get(i));
		}
	}

}
