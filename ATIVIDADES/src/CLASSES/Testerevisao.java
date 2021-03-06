package CLASSES;

import java.util.Scanner;

public class Testerevisao {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		String nome;
		int datanascimento;
		char genero;
		
		System.out.println("digite o nome do amigo: ");
		nome = leia.next();
		
		pessoa amigo= new pessoa(nome);
		
		System.out.println("digite o ano de nascimento:");
		datanascimento = leia.nextInt();
		
		System.out.println(" digite M, F ou O");
		genero = leia.next().toUpperCase().charAt(0);
		
		pessoa cliente = new pessoa(nome, datanascimento, genero);
		
		System.out.println("o nome da amizade é: "+amigo.getNome());
		
		if (amigo.idade() > 18) {
			System.out.println("cliente é adulto");
		}
		else {
			System.out.println("menor de 18 anos");
			System.out.println( "e a idade do mesmo é:"+cliente.idade());
		}
		
		
		

	}

}
