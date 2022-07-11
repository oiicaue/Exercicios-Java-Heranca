package ex1;

public class Pessoa {
	/*a classe aluno, professor, e funcionario
	 * serao filhas da classe pessoa.
	 * cada uma tera seus proprio atributos e metodos
	 */
	
	private String nome;
	private String cpf;
	
	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public void Imprime() {
		System.out.println("Nome: "+nome);
		System.out.println("CPF: "+cpf);
	}
	
	
}
