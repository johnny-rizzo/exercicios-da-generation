programa
{
	
	funcao inicio()
	{
		inteiro AN
		inteiro IA
		cadeia nome
		caracter parar = 's'
		
		
          enquanto( parar != 'N'){
	     
		escreva("digite seu nome: ")
		leia(nome)

		escreva("digite em qual ano você nasceu: ")
		leia(AN)

		IA = 2021 - AN

	     escreva("sua idade aproximada é: ", IA)
	     escreva("\nquer continuar? S ou N: ")
	     leia(parar)
	     
          }
	     

		
			
			
			
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 33; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */