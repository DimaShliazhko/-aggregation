package by.htps.task.aggragation.bean;

import java.util.ArrayList;

public class Car {

	private String name;
	private Engine engine;
	private ArrayList<Wheel> wheel;

	public Car(String name, Engine engine, ArrayList<Wheel> wheel) {

		this.name = name;
		this.engine = engine;
		this.wheel = wheel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public ArrayList<Wheel> getWheel() {
		return wheel;
	}

	public void setWheel(ArrayList<Wheel> wheel) {
		this.wheel = wheel;
	}

}
