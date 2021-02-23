programa
{
	inclua biblioteca Matematica-->Mat
	
	funcao inicio()
	{
		real n1,n2,n3,n4,q1,q2,q3,q4
		escreva("digite o primeiro numero:")
		leia(n1)

		escreva("digite o segundo numero:")
		leia(n2)

		escreva("digite o terceiro numero:")
		leia(n3)

		escreva("digite o quarto numero:")
		leia(n4)

		q1=Mat.potencia(n1,2)
		q2=Mat.potencia(n2,2)
		q3=Mat.potencia(n3,2)
		q4=Mat.potencia(n4,2)

		se(q3>=1000){
			
			escreva("Quadrado do terceiro numero: ",q3,"\n")
			
	}
senao{
	       escreva("O valor :", n1, "  sua potência é:", q1, "\n")
            escreva("O valor :", n2, "  sua potência é:", q2, "\n")
            escreva("O valor :", n3, "  sua potência é:", q3, "\n")
            escreva("O valor :", n4, "  sua potência é:", q4, "\n")}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 466; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */