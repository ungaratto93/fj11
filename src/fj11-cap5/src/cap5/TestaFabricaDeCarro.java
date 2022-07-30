package cap5;

public class TestaFabricaDeCarro {

	public static void main(String[] args) {
		
		FabricaDeCarro fb1 = FabricaDeCarro.getInstancia();
		FabricaDeCarro fb2 = FabricaDeCarro.getInstancia();

		System.out.println(fb1);
		System.out.println(fb2);

	}
	
}
