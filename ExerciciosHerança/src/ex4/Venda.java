package ex4;

import java.util.Scanner;

public class Venda {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String endereço;
		double preço;
		int op;
		
		System.out.println("Onde voce quer a casa? ");
		endereço = sc.next();
		System.out.println("Quanto voce quer pagar? ");
		preço = sc.nextDouble();
		System.out.println("---OPÇÕES DE CASA");
		System.out.println("---1- NOVO");
		System.out.println("---2- VELHO");
		op = sc.nextInt();
		
		if (op == 1) {
			Novo n = new Novo(endereço, preço);
			n.Imprime();
		} else if (op == 2) {
			Velho v = new Velho(endereço, preço);
			v.Imprime();
		}
		
		
	}

}
