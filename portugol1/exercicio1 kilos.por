programa
{
	
	funcao inicio()
	{
		real M,P,E

		escreva("sistema de pesagem do estado de São Paulo")
		escreva("\nverifique aqui o peso dos seus produtos")
		escreva("\ninforme o kilo do produto:")
		leia (P) 

		E=P-50
		M=4.0*E

          se(P>50)
          {
          escreva("Você excedeu o peso de: ",E, " kilos")
          escreva("\nVocê deve pagar a multa no valor de:",M, " reais")
          }
          senao se (P<=50)
          {
          E=0
          M=0.00
          escreva("Seus produtos não excederam o peso ",E)
          escreva("\n Você não tem multas a pagar ",M)
          }
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 318; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */