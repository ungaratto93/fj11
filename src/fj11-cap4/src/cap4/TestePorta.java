package cap4;

public class TestePorta {

	public static void main(String[] args) {
		Porta p = new Porta();
		System.out.println("Chamando metodo abrir");
		p.abrir();
		System.out.println("A porta esta aberta ? " + p.estaAberta());

		p.pinta("vermelha");
		p.defineDimensoes(1.0, 1.0, 1.0);
		
		System.out.println("Chamando metodo fechar");
		p.fechar();
		System.out.println("A porta esta aberta ? " + p.estaAberta());

	}
	
}
