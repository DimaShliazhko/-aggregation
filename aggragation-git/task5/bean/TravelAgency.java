package by.htps.task.bean;

import java.util.ArrayList;

public class TravelAgency {
	private String name;

	private ArrayList<Voucher> vouncher = new ArrayList<Voucher>();

	public TravelAgency() {
	}

	public TravelAgency(String name) {
		this.name = name;
	}

	public TravelAgency(String name, ArrayList<Voucher> vouncher) {
		super();
		this.name = name;
		this.vouncher = vouncher;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Voucher> getVouncher() {
		return vouncher;
	}

	public void setVouncher(ArrayList<Voucher> vouncher) {
		this.vouncher = vouncher;
	}

	public void setVouncher(Voucher vouncher) {
		this.vouncher.add(vouncher);
	}

}
