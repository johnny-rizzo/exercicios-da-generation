package EXEMPLOSE;

import java.util.Scanner;
/* 6) Elabore um sistema que dada a idade de um nadador 
         * classifique-o em uma das seguintes categorias:
            Infantil A = 5 a 7 anos
            Infantil B = 8 a 11 anos
            Juvenil A = 12 a 13 anos
            Juvenil B = 14 a 17 anos
            Adultos = Maiores de 18 anos*/

public class exerciciodoPortugol
{

	public static void main(String[] args)
	{
	Scanner ler = new Scanner(System.in);
	int idadeNadador;
	
	System.out.println("sua idade: ");
	idadeNadador = ler.nextInt();
	
	if (idadeNadador<5);
	{
	System.out.println("infelizmente não podemos te atender!\n ");
	}
	if (idadeNadador <=7)
	{
	System.out.println(" Infantil A = 5 a 7 anos\n ");
	}
	else if (idadeNadador <=11)
	{
	System.out.println(" Infantil B = 8 a 11 anos\n ");
	}
	else if (idadeNadador <=13)
	{
	System.out.println(" juvenil A = 12 a 13 anos\n ");
	}
	else if (idadeNadador <=17)
	{
	System.out.println(" juvenil B = 14 a 17 anos\n ");
	}
	else
	{
	System.out.println(" adulto\n ");
	}
	System.out.println(" obrigado volte sempre\n ");
	}
	
}
