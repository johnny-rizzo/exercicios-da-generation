programa
{

    funcao inicio()
    {
        /* objetivo
         * 1) João, homem de bem, comprou um 
         * microcomputador para controlar o 
         * rendimento diário de seu trabalho. 
         * Toda vez que ele traz um peso de tomate 
         * maior que o estabelecido pelo regulamento 
         * do estado de São Paulo (50 quilos) deve 
         * pagar um multa de R$ 4,00 por quilo excedente. 
         * João precisa que você faça um sistema
         * que leia a variável P (peso de tomates) e
         * verifique se há excesso. Se houver, 
         * gravar na variável E (Excesso) e na variável M 
         * o valor da multa que João deverá pagar. 
         * Caso contrário mostrar tais variáveis com o 
         * conteúdo ZERO.
         */
         //variaveis
         inteiro pesoInformado = 0
         real multa = 0.00
         inteiro  excessoKg = 0
         const inteiro LIMITE = 50
         //PESO LIMITE DOS TOMATES
         const real VALORMULTA = 4.00 //VALOR EM REAIS POR KILO EXCEDENTE

         //entradas
         escreva("Informe o peso de tomates hoje em Kg:")
         leia(pesoInformado)

         //processamentos
         se (pesoInformado <= LIMITE)
         {
             escreva("Excesso :",excessoKg,"\n")
             escreva("Multa : R$ ",multa,"\n")
         }
         senao
         {
             excessoKg = pesoInformado - LIMITE
             multa = excessoKg * VALORMULTA
             escreva("Excesso :",excessoKg,"\n")
             escreva("Multa : R$ ",multa,"\n")
         }

         //saidas



    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1572; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */