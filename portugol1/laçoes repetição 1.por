programa
{
	
	funcao inicio()
	{
		inteiro soma = 0
		

		para(inteiro n =0; n < 500; n++)
		{
			se((n % 2 !=0) e (n % 3 == 0))
			{
				escreva(n,"\n")
				soma= soma+n
			}
		}
		escreva("a soma dos numeros é" , soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 106; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */