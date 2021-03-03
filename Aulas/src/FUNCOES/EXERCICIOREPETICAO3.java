package FUNCOES;
import java.util.Scanner;
public class EXERCICIOREPETICAO3 {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
	int idade=33, menos=0, mais=0;
	while (idade != -99) {
		System.out.println("digite sua idade: ");
		idade = ler.nextInt();
		if (idade < 21){
			menos++;
		}
		
		else if (idade > 50) {
			mais++;
		}

	}
	System.out.println("número de pessoas com menos de 21 anos: "+(menos-1));
	System.out.println("número de pessoas com mais de 50 anos: "+mais);
	}
}
