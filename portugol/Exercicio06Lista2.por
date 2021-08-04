programa
{
	
	funcao inicio()
	{

		inteiro numero = 0
		inteiro auxiliar = 1
		inteiro soma = 0

		escreva ("Digite um número: ")
		leia (numero)

		faca
		{   
			escreva (auxiliar)
			
			se (auxiliar != numero)
			{
			escreva (" + ")
			}

			soma = soma + auxiliar
			auxiliar = auxiliar + 1
		}
		
		enquanto (auxiliar > 1 e auxiliar <= numero)

		escreva (" = ", soma)
	}
	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 384; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */