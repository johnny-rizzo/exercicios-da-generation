programa
{
	inclua biblioteca Matematica -->Mat
	
	funcao inicio()
	{
		real numero=1,somatorio=0,media=0
		inteiro total=0

		enquanto(numero>0)
		{
			escreva("informe um numero positivo:" )
			leia (numero)
			
			se(numero>0){
				
			
			somatorio= somatorio+numero
			total++}
		}
		media= somatorio/total
		se(total !=0){
			
		}
		escreva("\n o total de numero informados é :", total)
		escreva("\ntotal de somatorio é:", somatorio)
		escreva("\n a media é:", media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 337; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */