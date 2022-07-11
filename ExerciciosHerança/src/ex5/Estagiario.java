package ex5;

public class Estagiario extends Funcionario{

	public Estagiario(String cpf, String id, double salario, String nome) {
		super(cpf, id, salario, nome);
		
	}

	public double salarioEstagio() {
		return this.getSalario() * 0.8;
	}
	
	public void Imprime() {
		System.out.println("Funcionario: "+this.getNome());
		System.out.println("CPF: "+this.getCpf());
		System.out.println("ID: "+this.getId());
		System.out.println("Salario do estagiario �: "+salarioEstagio());
	}
}
