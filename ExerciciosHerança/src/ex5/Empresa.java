package ex5;

import java.util.Scanner;

public class Empresa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome, cpf, id;
		double salario;
		int op;
		
		System.out.println("Funcionario: ");
		nome = sc.next();
		System.out.println("CPF: ");
		cpf = sc.next();
		System.out.println("ID: ");
		id = sc.next();
		System.out.println("Meida do salario: ");
		salario = sc.nextDouble();
		
		System.out.println("QUAL O CARGO");
		System.out.println("1 - NORMAL");
		System.out.println("2 - ESTAGIARIO");
		System.out.println("3 - CHEFE");
		op = sc.nextInt();
		if (op == 1) {
			Normal n = new Normal(cpf, id, salario, nome);
			n.Imprime();
		} else if (op == 2) {
			Estagiario e = new Estagiario(cpf, id, salario, nome);
			e.Imprime();
		} else if (op == 3) {
			Chefe c = new Chefe(cpf, id, salario, nome);
			c.Imprime();
		}
		
		
		
		
		
		
	}

}
