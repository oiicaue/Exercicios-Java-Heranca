package ex2;

public class CamaroteInferior extends Ingresso{
	
	private String localizacao;
	
	public CamaroteInferior(double valor, String localizacao) {
		super(valor);
		this.localizacao = localizacao;
		
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	
	public double CI() {
		return this.getValor() * 1.2;
	}
	
	public void Imprime() {
		System.out.println("Valor do ingresso do camarote inferior: "+CI());
		System.out.println("Localizacao: "+this.getLocalizacao());
	}
}
