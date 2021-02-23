programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro dado [10], maiornumero=0
		real media, vezes = 0.00, soma =0.00

		para(inteiro x=0; x<10; x++){
			dado[x] = Util.sorteia(1, 6)

			se (dado[x] > maiornumero){
				maiornumero = dado[x]
			}
			}
			
		para(inteiro y = 0; y<10; y++){
			escreva("\nvalor: ", dado[y],("\n"))

			soma= soma+dado[y]
			se (dado[y] == maiornumero){
			vezes++	
			}
			
		}
	escreva ("quantidade de vez que apareceu o maior numero:",vezes) 
	media = soma/10
	escreva("\na média é: ", media)
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 197; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */