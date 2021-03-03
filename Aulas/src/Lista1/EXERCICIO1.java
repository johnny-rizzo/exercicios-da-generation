package Lista1;

import java.util.Scanner;

public class EXERCICIO1 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int anos, meses, dias, totalEmDias;
		
		System.out.print("Informe os anos: ");
		anos = ler.nextInt();
		System.out.print("Informe os meses: ");
		meses = ler.nextInt();
		System.out.print("Informe os dias: ");
		dias = ler.nextInt();
		totalEmDias = (anos * 365) + (meses * 30) + (dias);
		
		System.out.printf("O total da sua idade em dias é de %d", totalEmDias);
		
	}

}