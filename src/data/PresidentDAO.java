package data;

import java.util.List;

public interface PresidentDAO {
	List<President> getAllPresidents();
	List<President> findByTermNumber();
	President getPresident(String name, int termNumber, String datesInOffice, String fact); // add image?

}
