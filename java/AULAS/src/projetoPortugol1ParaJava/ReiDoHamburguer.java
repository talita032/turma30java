package projetoPortugol1ParaJava;

public class ReiDoHamburguer {

	public static void main(String[] args) {
		
		if (qntdDigitada <= 0){
			limpa()
			escreva("ATEN��O! Quantidade Inv�lida.\nDigite uma quantidade maior que 0\n")
		} senao se(estoque[produtoEscolhido] - qntdDigitada < 0) {
			limpa()
			escreva("\nATEN��O! Quantidade Inv�lida.\nFavor escolher um produto que tenha no estoque, e uma quantidade dispon�vel dele.\n")
		} senao {
			estoque[produtoEscolhido] = estoque[produtoEscolhido] - qntdDigitada
			carrinho[produtoEscolhido] += qntdDigitada
			qntdTotal += qntdDigitada
		}
		
		escreva("\nContinuar comprando? [S/N]: ")
		leia(continuarCompra)
		limpa()
	} enquanto(continuarCompra == 'S' ou continuarCompra == 's')

	//Calcula total com base no carrinho
	para(inteiro i=0;i<qntdProdutos;i++){
		se(carrinho[i] > 0){
			total += carrinho[i] * valor[i]
		}
	}
	}

}
