package PORTUGOLTOJAVA;
/*1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.*/
import java.util.Scanner;

public class EXERCICIO1 
{
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		int n1,n2,n3,maiornumero = 0;
		
		System.out.println("digite o primeiro n�mero: ");
		n1 = ler.nextInt();
		
		System.out.println("digite o segundo numero: ");
		n2 = ler.nextInt();
		
		System.out.println("digite o terceiro: ");
		n3 = ler.nextInt();
		
		if(n1>n2)
		{
		maiornumero = n1;
		}
		else if(n2>n1) 
		{
		maiornumero = n2;
		}
		else if(n2>n3) 
		{
		maiornumero = n2;
		}
		else if(n3>n1) 
		{
		maiornumero = n3;
		}
		else if (n3>n2); 
		{
		maiornumero = n3;
		}
	    System.out.println("O maior n�mero �: "+ maiornumero);
	}
}
