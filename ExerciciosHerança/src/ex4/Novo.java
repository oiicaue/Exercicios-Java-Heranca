package ex4;

public class Novo extends Imovel{
	
	
	
	
	public Novo(String endere�o, double pre�o) {
		super(endere�o, pre�o);
		
	}

	double novoPreco() {
		return this.getPre�o() + 800;
	}
	
	public void Imprime() {
		System.out.println("O valor da casa nova em"+this.getEndere�o()+", custa: R$ "+novoPreco());
	}
}
