package ex5;

public class Funcionario {
	
	 private String cpf;
	 private String id;
	 private double salario;
	 private String nome;
	 
	 
	public Funcionario(String cpf, String id, double salario, String nome) {
		this.cpf = cpf;
		this.id = id;
		this.salario = salario;
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
