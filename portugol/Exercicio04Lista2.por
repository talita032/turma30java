programa
{
	
	funcao inicio()
	{
		inteiro numero
		escreva("digite um numero: ")
		leia(numero)
		se(numero %2 ==0 e numero != 0)
		{
			escreva("numero é par")
		}
			senao se (numero != 0){
				escreva("numero impar")
				
		}
		senao {
			escreva("")
			
		}
			se(numero >0)
		{
			escreva("\nnumero é positivo")
		}
			senao se (numero <0) {
				escreva("\nnumero negativo")
				
		}
				senao {
				escreva("\nnumero neutro")
				
				}
	}
	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 451; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */