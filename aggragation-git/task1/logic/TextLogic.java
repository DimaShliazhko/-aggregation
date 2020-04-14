package by.htps.task.aggragation.logic;

import java.util.ArrayList;

import by.htps.task.aggragation.bean.Sentence;
import by.htps.task.aggragation.bean.Text;

/*
 * Слово. Методы: дополнить текст,
 *  вывести на консоль текст, заголовок текста.
 * 
 */

public class TextLogic {
	
	public  ArrayList<Sentence> addText(ArrayList<Sentence> sentence,Sentence sen) {
		sentence.add(sen);
		return sentence ; 
	}
 	
	
}
