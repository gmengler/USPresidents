package data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PresidentDAOFileImpl implements PresidentDAO {
	Map<String, President> presList = new HashMap<>();
	

	private void loadPresidentsInHashMap() {
		presList.put();
	}

	@Override
	public List<President> getAllPresidents() { // probably don't need
		return new ArrayList<>(presList.values());
	}


	@Override
	public President getPresident(int termNumber) {
		// TODO Auto-generated method stub
		return null;
	}


}
