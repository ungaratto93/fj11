package cap3;

public class GastosEmpresa {

	public static void main(String[] args) {
		
		double gastoJan = 15000;
		double gastoFev = 23000;
		double gastoMar = 17000;
		
		double gastoTotal = gastoJan + gastoFev + gastoMar;
		System.out.printf("Gasto Total %.2f \n", gastoTotal);
		
		double gastoMedia = gastoTotal / 3;
		System.out.printf("Gasto Médio %.2f", gastoMedia);

	}
	
}
