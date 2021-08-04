programa
{
	
	funcao inicio()
	{

		real habitantes = 3
		real salario = 0
		real filhos = 0
		real somaSalario = 0
		real mediaSalario = 0
		real somaFilhos = 0
		real mediaFilhos = 0
		real maiorSalario = 0
		real percentualPessoas100 = 0

		para (inteiro x = 1; x <= habitantes; x = x + 1)
		{
			escreva ("Escreva numero de filhos: ")
			leia (filhos)
			escreva ("Digite o valor do salário: ")
			leia (salario)

			somaSalario = somaSalario + salario
			somaFilhos = somaFilhos + filhos

			mediaSalario = somaSalario / habitantes 
			mediaFilhos =  somaFilhos / habitantes

			se (salario > maiorSalario)
			{
				maiorSalario = salario
			}	

			se (salario <= 100)
			{
				percentualPessoas100 = percentualPessoas100 + 1
			}
			
		}

		percentualPessoas100 = (percentualPessoas100 / habitantes) * 100
		 
		escreva ("\nA média do salário da popolação é: ", mediaSalario)
		escreva ("\nA média do número de filhos é: ", mediaFilhos)
		escreva ("\nO maior salário da população é: ", maiorSalario)
		escreva ("\n O percentual de pessoas com salário até 100 é: ", percentualPessoas100)
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1101; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */