package ex4;

public class Novo extends Imovel{
	
	
	
	
	public Novo(String endereço, double preço) {
		super(endereço, preço);
		
	}

	double novoPreco() {
		return this.getPreço() + 800;
	}
	
	public void Imprime() {
		System.out.println("O valor da casa nova em"+this.getEndereço()+", custa: R$ "+novoPreco());
	}
}
