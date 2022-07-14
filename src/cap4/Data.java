package cap4;

import java.time.LocalDateTime;

public class Data {

	int dia = getCurrentLocalDateTime().getDayOfMonth();
	int mes = getCurrentLocalDateTime().getMonthValue();
	int ano = getCurrentLocalDateTime().getYear();

	private LocalDateTime getCurrentLocalDateTime() {
		return LocalDateTime.now();
	}
	
}
