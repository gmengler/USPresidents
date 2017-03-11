package data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PresidentDAOMemoryImpl implements PresidentDAO {
	Map<String, President> presList = new HashMap<>();
	

	private void loadPresidentsInHashMap() {
		presList.put();
	}

	@Override
	public List<President> getAllPresidents() { // probably don't need
		return new ArrayList<>(presList.values());
		return null;
	}

	@Override
	public List<President> findByTermNumber() {
		// TODO Auto-generated method stub
		return null;
	}

}
