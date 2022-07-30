package cap5;

import java.time.LocalDateTime;

public class Data {

	private int dia = getCurrentLocalDateTime().getDayOfMonth();
	private int mes = getCurrentLocalDateTime().getMonthValue();
	private int ano = getCurrentLocalDateTime().getYear();
	
	private LocalDateTime getCurrentLocalDateTime() {
		return LocalDateTime.now();
	}
	
	public String formatada() {
		return  + this.dia + "/" + this.mes + "/" + this.ano;
	}
}
