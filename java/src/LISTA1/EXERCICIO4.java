package LISTA1;

import java.util.Scanner;

public class EXERCICIO4 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int numA, numB, numC, numD, numR, numS;
		
		System.out.print("Digite o n�mero A: ");
		numA = ler.nextInt();
		System.out.print("Digite o n�mero B: ");
		numB = ler.nextInt();
		System.out.print("Digite o n�mero C: ");
		numC = ler.nextInt();
		
		numR = (int) Math.pow((numA + numB), 2);
		numS = (int)Math.pow((numB + numC), 2);
		numD = (numR + numS) / 2;
		
		System.out.printf("O resultado � %d", numD);
		
	}

}