package by.htp.task.aggregation.bean;

import java.util.ArrayList;

public class State {
	
	private String nameState;
	private String capital;
	private String area;
	private ArrayList<Region> region;
	public String getNameState() {
		return nameState;
	}
	public void setNameState(String nameState) {
		this.nameState = nameState;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public ArrayList<Region> getRegion() {
		return region;
	}
	
	
	public void setRegion(ArrayList<Region> region) {
		this.region = region;
	}
	public State(String nameState,String capital, String area, ArrayList<Region> region) {
		super();
		this.nameState = nameState;
		this.capital = capital;
		this.area = area;
		this.region = region;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	
	
	

}
