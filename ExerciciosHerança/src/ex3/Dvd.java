package ex3;

public class Dvd extends Produto{
	
	private int minutos;
	
	public Dvd(String nome, double preco, int minutos) {
		super(nome, preco);
		this.minutos = minutos;
	}

	public void Imprime() {
		System.out.println("O filme: "+this.getNome()+", tem "+this.getMinutos()+" minutos e custa R$ "+this.getPreco());
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	
}
