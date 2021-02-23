programa
{
	inclua biblioteca Matematica -->Mat
          
	funcao inicio()
	{
		real salario, somatorioSalario=0.0, somatorioFilhos=0.0,
		mediaSalario=0.0, mediaFilhos=0.0, maiorSalario=0.0, percentual=0.0
		inteiro filhos
    		const inteiro HABITANTES = 20
    		

    		para(inteiro contador=1; contador <= HABITANTES; contador++){
		    		escreva("qual o seu salário? ")
				leia(salario)
				escreva("Qual número de filhos você tem? ")
				leia(filhos)	
				somatorioSalario= somatorioSalario + salario
				somatorioFilhos= somatorioFilhos+ filhos 

				se(salario>maiorSalario){
					maiorSalario=salario
				}
				
				se(salario<=100){
				percentual++
				}
				
		    		}
				mediaSalario = somatorioSalario/HABITANTES
				mediaFilhos = somatorioFilhos/HABITANTES
				percentual=(percentual/HABITANTES)*100

				
				escreva("A média de salário é: ",Mat.arredondar(mediaSalario,2),"\n A média de filhos é: ",mediaFilhos,
				"\n O maior salario é: ", maiorSalario,"\nO percentual de salarios até 100 reais é: ",Mat.arredondar(percentual,2))
				
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 264; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */