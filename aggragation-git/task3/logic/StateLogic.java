package by.htp.task.aggregation.logic;

import by.htp.task.aggregation.bean.State;

public class StateLogic {

	public String[] regionCenter(State state) {

		String[] city = new String[state.getRegion().size()];
		for (int i = 0; i < state.getRegion().size(); i++) {

			city[i] = state.getRegion().get(i).getNameRegionCity();
		}
		return city;

	}

	public int numberOfRegion(State state) {
		return state.getRegion().size();
	}

}
