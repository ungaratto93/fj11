package cap4;

public class TesteCasa {

	public static void main(String[] args) {
		Casa c = new Casa();
		c.pintar("amarela");
		System.out.println("Cor da casa : " +  c.consultarCor());
		c.porta1 = new Porta();
		c.porta2 = new Porta();
		c.porta3 = new Porta();
		
		c.porta1.abrir();
		c.porta2.abrir();
		c.porta3.abrir();
		System.out.println("Quantas portas estao abertas ? " +  c.quantasPortasEstaoAbertas());
		
	}
	
}
