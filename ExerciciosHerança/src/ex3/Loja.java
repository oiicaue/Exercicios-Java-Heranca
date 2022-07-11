package ex3;

import java.util.Scanner;

public class Loja {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);	
	
	String nome, autor;
	int minutos, faixas, op;
	double preco;
		
	System.out.println("---PRODUTOS DA LOJA---");
	System.out.println("---1- LIVROS");
	System.out.println("---2- CDs");
	System.out.println("---3- DVDs");
	System.out.println("---4- SAIR");
	op = sc.nextInt();
	
	if (op == 1) {
		System.out.println("Nome do livro: ");
		nome = sc.next();
		System.out.println("Autor do livro: ");
		autor = sc.next();
		System.out.println("Preço do livro: ");
		preco = sc.nextDouble();
		
		Livro l = new Livro(nome, preco, autor);
		l.Imprime();
	} else if (op == 2) {
		System.out.println("Nome do CD");
		nome = sc.next();
		System.out.println("Quantidade de faixas do CD: ");
		faixas = sc.nextInt();
		System.out.println("Preço do CD: ");
		preco = sc.nextDouble();
		
		Cd c = new Cd(nome, preco, faixas);
		c.Imprime();
	} else if (op == 3) {
		System.out.println("Nome do filme: ");
		nome = sc.next();
		System.out.println("Tempo de duração em minutos: ");
		minutos = sc.nextInt();
		System.out.println("Preço do filme: ");
		preco = sc.nextDouble();
		
		Dvd d = new Dvd(nome, preco, minutos);
		d.Imprime();
	} 
	
	
	
	
}
		

}

