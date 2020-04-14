package by.htp.task.aggregation.bean;

import java.util.ArrayList;

public class Region {

	private String nameRegion;
	private String nameRegionCity;
	
	private ArrayList<Distric> distric;
	public Region(String nameRegion,String nameRegionCity, ArrayList<Distric> distric) {
		super();
		this.nameRegion = nameRegion;
		this.nameRegionCity = nameRegionCity;
		this.distric = distric;
	}
	public String getNameRegionCity() {
		return nameRegionCity;
	}
	public void setNameRegionCity(String nameRegionCity) {
		this.nameRegionCity = nameRegionCity;
	}
	public String getNameRegion() {
		return nameRegion;
	}
	public void setNameRegion(String nameRegion) {
		this.nameRegion = nameRegion;
	}
	public ArrayList<Distric> getDistric() {
		return distric;
	}
	public void setDistric(ArrayList<Distric> distric) {
		this.distric = distric;
	}

}
