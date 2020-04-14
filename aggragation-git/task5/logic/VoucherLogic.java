package by.htps.task.logic;

import by.htps.task.bean.TravelAgency;
import by.htps.task.bean.Voucher;
import by.htps.task.readData.VoucherRead;

public class VoucherLogic {

	VoucherRead read = new VoucherRead();

	public TravelAgency sortNumberDate(TravelAgency travelAgency) {

		for (int i = travelAgency.getVouncher().size() - 1; i >= 0; i--) {

			for (int j = 0; j < i; j++) {

				if (travelAgency.getVouncher().get(j).getDay() > travelAgency.getVouncher().get(j + 1).getDay()) {

					Voucher temp;
					temp = travelAgency.getVouncher().get(j);

					travelAgency.getVouncher().set(j, travelAgency.getVouncher().get(j + 1));
					travelAgency.getVouncher().set(j + 1, temp);

				}

			}
		}
		return travelAgency;
	}

	public TravelAgency choiceVoucher(TravelAgency travelAgency) {
		TravelAgency newTravelAgency = new TravelAgency();
		String transport = read.choiсeTransport();
		int day = read.choiсeDay();
		boolean food = read.choiсeFood();

		for (int i = 0; i < travelAgency.getVouncher().size(); i++) {

			if (travelAgency.getVouncher().get(i).getTypeTransport().equals(transport) && 
					travelAgency.getVouncher().get(i).getDay() >= day
					&&
					travelAgency.getVouncher().get(i).isFood() == food) {
				newTravelAgency.setVouncher(travelAgency.getVouncher().get(i));
			}
		}
		return newTravelAgency;
	}

}
