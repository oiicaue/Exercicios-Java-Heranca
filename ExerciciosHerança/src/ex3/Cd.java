package ex3;

public class Cd extends Produto{
	
	private int faixas;
	
	public Cd(String nome, double preco, int faixas) {
		super(nome, preco);
		this.faixas = faixas;
	}
	
	public void Imprime() {
		System.out.println("O CD: "+this.getNome()+", tem"+this.getFaixas()+", e custa R$"+this.getPreco());
	}

	public int getFaixas() {
		return faixas;
	}

	public void setFaixas(int faixas) {
		this.faixas = faixas;
	}
	
}
