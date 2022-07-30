package cap4;

public class TesteData {
	public static void main(String[] args) {
		Data data = new Data();
		data.ano = 2022;
		data.mes = 07;
		data.dia = 14;
		System.out.println(data.dia + "/" + data.mes + "/" + data.ano);

		Data data1 = new Data();
		System.out.println(data1.dia + "/" + data1.mes + "/" + data1.ano);

		
		Conta c1 = new Conta();
		System.out.println(c1.dataAbertura.dia + "/" + c1.dataAbertura.mes + "/" + c1.dataAbertura.ano);
	}
}
