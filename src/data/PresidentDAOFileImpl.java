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
				String firstName = param[1];
				String lastName = param[2];
				
				
				double price = Double.parseDouble(param[2]);
				President p = new President();
				presList.put(termNumber, p);
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
		// TODO Auto-generated method stub
		return null;
	}
	
	


}
