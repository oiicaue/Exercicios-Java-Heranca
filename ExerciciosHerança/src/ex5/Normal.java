package ex5;

public class Normal extends Funcionario{

	public Normal(String cpf, String id, double salario, String nome) {
		super(cpf, id, salario, nome);
		
	}
	
	public double salarioNormal() {
		return this.getSalario() * 1.1;
	}
	
	public void Imprime() {
		System.out.println("Funcionario: "+this.getNome());
		System.out.println("CPF: "+this.getCpf());
		System.out.println("ID: "+this.getId());
		System.out.println("O salario normal é: "+salarioNormal());
	}
	
}
