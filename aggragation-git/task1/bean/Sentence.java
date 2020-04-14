package by.htps.task.aggragation.bean;

import java.util.ArrayList;

public class Sentence {
	
	private ArrayList<Word> sentence;

	public Sentence(ArrayList<Word> sentence) {
		
		this.sentence = sentence;
	}

	public ArrayList<Word> getSentence() {
		return sentence;
	}

	public void setSentence(ArrayList<Word> sentence) {
		this.sentence = sentence;
	} 
	

}
