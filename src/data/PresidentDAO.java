package data;

import java.util.List;

public interface PresidentDAO {
	List<President> getAllPresidents();
	President getPresident(int termNumber);
	President getNextPresident();
	President getPreviousPresident();

}
