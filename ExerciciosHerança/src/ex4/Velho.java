package ex4;

public class Velho extends Imovel{
	
	
	
	
	public Velho(String endere�o, double pre�o) {
		super(endere�o, pre�o);
		
	}
	
	public double velhoPreco() {
		return this.getPre�o() - 500;
	}
	
	public void Imprime() {
		System.out.println("O valor da casa velha em"+this.getEndere�o()+", custa: R$ "+this.getPre�o());
	}
	
}
