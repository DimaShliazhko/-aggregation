package by.htps.task.aggragation.bean;

import java.util.ArrayList;

public class Text {
	
	
	
	public Text(String name, ArrayList<Sentence> text) {
		super();
		this.name = name;
		this.text = text;
	}

	private String name; 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private ArrayList<Sentence> text;

	public Text(ArrayList<Sentence> text) {
		
		this.text = text;
	}

	public ArrayList<Sentence> getText() {
		return text;
	}

	public void setText(ArrayList<Sentence> text) {
		this.text = text;
	}
	

}
