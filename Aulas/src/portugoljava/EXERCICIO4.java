package portugoljava;
import java.util.Scanner;
public class EXERCICIO4 {
	
	public static void main(String[] args)
	{
	Scanner ler = new Scanner(System.in);
	double numero, resul;
	
	
    System.out.println("Digite um número:");
    numero= ler.nextDouble();
    
    if(numero %2 ==0)
    {  
    	resul = Math.sqrt(0);
    	System.out.printf("este número é par %f",resul);
    	
    }
    else {
    System.out.println(" este número é impar");
    }
}
	
}