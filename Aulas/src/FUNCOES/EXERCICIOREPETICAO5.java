package FUNCOES;

import java.util.Scanner;

public class EXERCICIOREPETICAO5 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double numero, somatorio = 0;

		do {		
			System.out.print("Digite um n�mero: ");
			numero = ler.nextDouble();
			somatorio += numero;	
		} 
		while (numero != 0);

		System.out.printf("O somat�rio dos n�meros �: %.2f", somatorio);

		ler.close();
	}

}