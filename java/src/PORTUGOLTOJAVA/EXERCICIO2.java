package PORTUGOLTOJAVA;
/*2- Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.*/

import java.util.Scanner;

public class EXERCICIO2 
{
 public static void main(String[] args)
{
	Scanner ler = new Scanner(System.in);
	int n1,n2,n3;
	
	System.out.println("Digite o primeiro n�mero:");
	n1 = ler.nextInt();
	
	System.out.println("Digite o segundo n�mero:");
	n2 = ler.nextInt();
			
    System.out.println("Digite o terceiro n�mero:");
	n3 = ler.nextInt();
	
	if (n1 <= n2 && n2 <= n3)
	{
	System.out.println("esta � a ordem crescente");
	}

}



}
