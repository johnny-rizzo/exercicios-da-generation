package PORTUGOLTOJAVA;
import java.util.Scanner;
public class EXERCICIO4 {
	
	public static void main(String[] args)
	{
	Scanner ler = new Scanner(System.in);
	double numero=0, resul=0;
	
	
    System.out.println("Digite um n�mero:");
    numero= ler.nextDouble();
    
    if(numero %2 ==0)
    {  
    	numero = Math.sqrt(2);
    	System.out.printf("este n�mero � par %f",numero);
    	
    }
    else {
    System.out.println(" este n�mero � impar");
    }
}
	
}