package PORTUGOLTOJAVA;
/*2- Faça um programa que entre com três números e coloque em ordem crescente.*/

import java.util.Scanner;

public class EXERCICIO2 
{
 public static void main(String[] args)
{
	Scanner ler = new Scanner(System.in);
	int n1,n2,n3;
	
	System.out.println("Digite o primeiro número:");
	n1 = ler.nextInt();
	
	System.out.println("Digite o segundo número:");
	n2 = ler.nextInt();
			
    System.out.println("Digite o terceiro número:");
	n3 = ler.nextInt();
	
	if (n1 <= n2 && n2 <= n3)
	{
	System.out.println("esta é a ordem crescente");
	}

}



}
