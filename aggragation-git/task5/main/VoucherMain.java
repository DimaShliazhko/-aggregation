package by.htps.task.main;

import by.htps.task.bean.TravelAgency;
import by.htps.task.bean.Voucher;
import by.htps.task.logic.VoucherLogic;
import by.htps.task.view.VoucherView;

public class VoucherMain {
	
	public static void main(String[] args) {
		
		VoucherLogic logic = new VoucherLogic(); 
		VoucherView view = new VoucherView();  
		TravelAgency travelAgency = new TravelAgency("Тез Тур");
		Voucher voucher1 = new Voucher("семейный отдых","отдых", "машина", false, 10);
		Voucher voucher2 = new Voucher("экскурсия выхоного дня","экскурсия", "автобус", false, 4);
		Voucher voucher3 = new Voucher("балтика","круиз", "паром", true, 7);
		Voucher voucher4 = new Voucher("польша","шопинг", "автобус", false, 4);
		Voucher voucher5 = new Voucher("черногория","отдых", "автобус", true, 12);
		Voucher voucher6 = new Voucher("барселона","отдых", "автобус", true, 15);
		
		travelAgency.setVouncher(voucher1);
		travelAgency.setVouncher(voucher2);
		travelAgency.setVouncher(voucher3);
		travelAgency.setVouncher(voucher4);
		travelAgency.setVouncher(voucher5);
		travelAgency.setVouncher(voucher6);
		
		//view.printVoucher(travelAgency);
		//view.printVoucher(logic.sortNumberDate(travelAgency));
		view.printVoucher(logic.choiceVoucher(travelAgency));
	}

}
