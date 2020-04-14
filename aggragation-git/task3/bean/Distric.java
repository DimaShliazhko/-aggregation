package by.htp.task.aggregation.bean;

import java.util.ArrayList;

public class Distric {
	
	private String nameDistric;
	private String nameDistricCity;
	private ArrayList<City> city;
	
	
	public String getNameDistricCity() {
		return nameDistricCity;
	}
	public void setNameDistricCity(String nameDistricCity) {
		this.nameDistricCity = nameDistricCity;
	}
	public Distric(String nameDistric,String nameDistricCity, ArrayList<City> city) {
		
		this.nameDistric = nameDistric;
		this.nameDistricCity = nameDistricCity;
		this.city = city;
	}
	public String getNameDistric() {
		return nameDistric;
	}
	public void setNameDistric(String nameDistric) {
		this.nameDistric = nameDistric;
	}
	public ArrayList<City> getCity() {
		return city;
	}
	public void setCity(ArrayList<City> city) {
		this.city = city;
	}
	

}
