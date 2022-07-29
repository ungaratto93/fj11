package cap5;

/*
 * Singleton Design Pattern
 * https://refactoring.guru/design-patterns/singleton
 */
public class FabricaDeCarro {
	private static FabricaDeCarro instancia;
	
	private FabricaDeCarro() {
		
	}
	
	private static FabricaDeCarro setInstancia() {
		 return new FabricaDeCarro();
	}
	
	public static FabricaDeCarro getInstancia() {
		if (FabricaDeCarro.instancia == null) {
			instancia = FabricaDeCarro.setInstancia();
		}
		return instancia;
	}
}
