package FUNCOES;

import java.util.Scanner;

public class EXERCICIOREPETICAO5 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double numero, somatorio = 0;

		do {		
			System.out.print("Digite um número: ");
			numero = ler.nextDouble();
			somatorio += numero;	
		} 
		while (numero != 0);

		System.out.printf("O somatório dos números é: %.2f", somatorio);

		ler.close();
	}

}