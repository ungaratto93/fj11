package cap4;

public class Porta {

	private boolean estado = false;
	private String cor = "";
	private Double z = 0.0;
	private Double y = 0.0;
	private Double x = 0.0;

	private boolean getEstado() {
		return this.estado;
	}
	
	public boolean estaAberta() {
		return this.getEstado();
	}
	
	private void setEstado(boolean b) {
		this.estado = b;
	}
	
	public void abrir() {
		this.mudaEstado(!this.getEstado());
	}

	public void fechar() {
		this.mudaEstado(!this.getEstado());
	}

	private void mudaEstado(boolean estado) {
		this.setEstado(estado);
	}

	public void pinta(String cor) {
		this.setCor(cor);
	}

	private void setCor(String cor) {
		this.cor = cor;
	}

	public void defineDimensoes(Double x, Double y, Double z) {
		this.setX(x);
		this.setY(y);
		this.setZ(z);
	}

	private void setZ(Double z) {
		this.z = z;
	}

	private void setY(Double y) {
		this.y = y;
	}

	private void setX(Double x) {
		// TODO Auto-generated method stub
		this.x = x;
	}
	
}
