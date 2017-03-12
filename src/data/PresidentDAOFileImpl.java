package data;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;


public class PresidentDAOFileImpl implements PresidentDAO {
	Map<Integer, President> presList = new HashMap<>();
	President pres = new President();
	ServletContext servletContext;

	public PresidentDAOFileImpl (ServletContext s){
		servletContext = s;
	}

	private void loadPresidentsInHashMap() {
		InputStream is = servletContext .getResourceAsStream("presidents.csv");
		try (BufferedReader buf = new BufferedReader(new InputStreamReader(is))) {
			String line;
			while ((line = buf.readLine()) != null) {
				String[] param = line.split("	");
				Integer termNumber = Integer.parseInt(param[0]);
				String name = param[1];
				String startTerm = param[2];
				String endTerm = param[3];
				String party = param[4];
				String picURL = param[5];
				String fact = param[6];

//				President p = new President();
				presList.put(termNumber, pres);
			}
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	@Override
	public List<President> getAllPresidents() { // probably don't need
		return new ArrayList<>(presList.values());
	}


	@Override
	public President getPresident(int termNumber) {
		pres = presList.get(termNumber);
		return pres;
	}

//	@Override
//	public President getNextPresident(int termNumber) {
//		if (termNumber > 45) {
//			termNumber = 1;
//		}
//		pres = presList.get(termNumber + 1);
//		return pres;
//	}

//	@Override
//	public President getPreviousPresident(int termNumber) {
//		if (termNumber < 1) {
//			termNumber = 45;
//		}
//		pres = presList.get(termNumber - 1);
//		return pres;
//	}

}
