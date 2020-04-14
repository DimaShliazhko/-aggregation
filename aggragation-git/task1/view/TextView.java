package by.htps.task.aggragation.view;

import java.util.ArrayList;

import by.htps.task.aggragation.bean.Sentence;
import by.htps.task.aggragation.bean.Text;

public class TextView {

	public void printTextName(Text text) {
			System.out.println(	text.getName());
	}
	
	public void printTex(ArrayList<Sentence> sentence) {
		for( Sentence se :  sentence ) {
			System.out.println(se);
		}
		
		
}

	
}
