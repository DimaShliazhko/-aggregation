package by.htp.task.aggregation.view;

import by.htp.task.aggregation.bean.State;

public class SateView {
	public void printCapital(State state) {
		System.out.println(state.getCapital());
		
	}
	public void printArea(State state) {
		System.out.println(state.getArea());
		
	}
	
	public void printRagionCity(String[] city) {
		
		for(int i = 0; i < city.length; i++) {
			System.out.println(city[i]);
			
		}
			
	}
	public void printnumberOfRegion(int kol) {
		System.out.println(kol);
	}

}
