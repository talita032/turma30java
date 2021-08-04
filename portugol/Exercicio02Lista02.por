programa
{
	
	funcao inicio()
	{
	
		inteiro numero = 1
		inteiro soma = 0

		para (inteiro x = 1; x <= 500; x = x + 1)
		{
			se (numero % 2 == 1 e numero % 3 == 0)
			{	
				soma = soma + numero
			}
			
			numero = numero + 1
		}
		escreva ("A soma dos número ímpares e multiplos de 3 é: ", soma)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 305; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */