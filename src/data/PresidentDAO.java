package data;

import java.time.LocalDate;
import java.util.List;

public interface PresidentDAO {
	List<President> getAllPresidents();
	President getPresident(int termNumber);

}
