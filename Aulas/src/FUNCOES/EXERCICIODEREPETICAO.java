package FUNCOES;
//2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
import java.util.Scanner;
public class EXERCICIODEREPETICAO {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		int n1,par=0,impar=0;
		
		for (int contador=0;contador<10;contador++)
		{
			System.out.printf("digite o n�mero: ");
			n1= ler.nextInt();
		if (n1%2 ==0) {
			
			//System.out.println("n�mero par");
			par++;
		}
		else {
			//System.out.println("numero impar");
			impar++;
		}
			
		}
		System.out.println("o total de numeros pares �: "+ par+ "\ntotal de n�meros impares:"+impar);	
		}
	}

