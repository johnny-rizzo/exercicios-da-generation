package Lista1;

import java.util.Scanner;

public class EXERCICIO3 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int totalSegundos, segundos, minutos, horas;
		
		System.out.print("Informe o total de segundos do evento: ");
		totalSegundos = ler.nextInt();
		
		horas = totalSegundos / 3600;
		minutos = (totalSegundos % 3600) / 60;
		segundos = (totalSegundos % 3600) % 60;
		
		System.out.printf("A duração do evento da fábrica é de %d hora(s), %d minuto(s) e %d segundo(s)", 
				horas, minutos, segundos);
		
	}

}