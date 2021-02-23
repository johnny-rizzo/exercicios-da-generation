programa
{
	
	funcao inicio()
	{
		inteiro mat1, port1, cie1, art1
		inteiro media
		inteiro soma
		cadeia nome
		
		para (inteiro x=1;x<=4;x++){
		escreva("digite seu nome: ")
		leia(nome)
		escreva("digite sua nota de Matematica: ")
		leia(mat1)
		escreva("digite sua nota de Português: ")
		leia(port1)
		escreva("digite sua nota de Ciências: ")
		leia(cie1)
		escreva("digite sua nota de Artes: ")
		leia(art1)
		
		soma =(mat1+ port1+ cie1+ art1)
		media=(soma/4)

		limpa()	
			
		se(media <=5){
		escreva("aluno ",nome,"\n sua nota de Matemática é:",mat1,"\n sua nota de Português é: ",port1,"\n sua nota de ciências é: ",cie1,"\n sua nota de Artes é: ",art1)
		escreva("você precisa estudar mais")
		}
		se(media >5){
			escreva("parabéns você passou")
		}
		
		}

	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 767; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */