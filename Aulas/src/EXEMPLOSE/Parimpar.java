package EXEMPLOSE;

import java.util.Scanner;

public class Parimpar 
{
	public static void main(String [] args) 
	{
	Scanner ler = new Scanner(System.in);
	int valorDigitado = 0;
	
	System.out.println("digite o numero: ");
	valorDigitado = ler.nextInt();
	
	if (valorDigitado %2 == 0) 
	{
		System.out.println("o n�mero " +valorDigitado+" � par!!!");
	}
	else System.out.printf("\no n�mero %d � impar", valorDigitado);
	}
	
}
