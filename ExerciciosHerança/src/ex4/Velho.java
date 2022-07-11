package ex4;

public class Velho extends Imovel{
	
	
	
	
	public Velho(String endereço, double preço) {
		super(endereço, preço);
		
	}
	
	public double velhoPreco() {
		return this.getPreço() - 500;
	}
	
	public void Imprime() {
		System.out.println("O valor da casa velha em"+this.getEndereço()+", custa: R$ "+this.getPreço());
	}
	
}
