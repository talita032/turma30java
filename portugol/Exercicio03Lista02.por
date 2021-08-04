programa
{
	
	funcao inicio()
	{

		real numero = 0
		real soma = 0
		real media = 0
		real lidos = 0
		
		enquanto (numero >= 0)
		{
			escreva ("Digite um número: ")
			leia (numero)

			se (numero < 0)
			{
				soma = soma - numero
				lidos = lidos - 1
			}
			
			soma = soma + numero
			lidos = lidos + 1
		}
		
		media = soma / lidos
		
		escreva ("\nA média é: ", media)
		escreva ("\nO total é: ", soma)
		escreva ("\nOs número de valores lidos é: ", lidos)
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 475; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */