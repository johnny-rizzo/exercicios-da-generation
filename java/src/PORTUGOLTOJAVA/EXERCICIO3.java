package PORTUGOLTOJAVA;
import java.util.Scanner;

public class EXERCICIO3 {
	public static void main(String[] args)
	{
	Scanner ler = new Scanner(System.in);
	int idade;
	
    System.out.println("Digite um número:");
    idade= ler.nextInt();
    
    if (idade <=9)
	{
	System.out.println("infelizmente você é muito novo!\n ");
	}
	else if (idade <=14)
	{
	System.out.println("Infantil\n ");
	}
	else if (idade <=17)
	{
	System.out.println("juvenil\n ");
	}
	else if (idade <=25)
	{
	System.out.println("adulto\n ");
	}
	else {
	System.out.println("idoso");
	}
}
}
