package ex3;

public class Livro extends Produto{
	
	private String autor;
	
	public Livro(String nome, double preco, String autor) {
		super(nome, preco);
		this.autor = autor;
	}

	public void Imprime() {
		System.out.println("O livro, "+this.getNome()+"escrito por; "+this.getAutor()+", custa R$"+this.getPreco());
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
}
