package lista3;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		
		//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.
		Scanner leia = new Scanner(System.in);
		int num,par=0,impar=0;
		for (int x =1; x<=10;x++) {
			System.out.print("Digite um numero: ");
			num = leia.nextInt();
				if(num % 2 ==0) {
					par++;
				} else if(num %2 ==1) {
					impar++;	
				} 
		}
			System.out.println("O numero de pares � "+par);
			System.out.println("O numero de impar � "+impar);
	}

}
