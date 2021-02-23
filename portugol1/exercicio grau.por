programa
{
	inclua biblioteca Matematica
	//grupo 2 recebe uma temperaura em graus farrenheit 
	//e transform em celcius
	//°C = (°F − 32) ÷ 1, 8
     
	
	funcao inicio()
	{
	real f,c
	
	escreva("digite a temperatura em Farrenheit:")
	leia(f)

	c = (f - 32)/1.8

	escreva("o valor de celcius é: ", Matematica.arredondar (c,2))

	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 329; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */