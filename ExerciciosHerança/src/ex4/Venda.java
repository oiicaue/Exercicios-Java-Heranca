package ex4;

import java.util.Scanner;

public class Venda {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String endere�o;
		double pre�o;
		int op;
		
		System.out.println("Onde voce quer a casa? ");
		endere�o = sc.next();
		System.out.println("Quanto voce quer pagar? ");
		pre�o = sc.nextDouble();
		System.out.println("---OP��ES DE CASA");
		System.out.println("---1- NOVO");
		System.out.println("---2- VELHO");
		op = sc.nextInt();
		
		if (op == 1) {
			Novo n = new Novo(endere�o, pre�o);
			n.Imprime();
		} else if (op == 2) {
			Velho v = new Velho(endere�o, pre�o);
			v.Imprime();
		}
		
		
	}

}
