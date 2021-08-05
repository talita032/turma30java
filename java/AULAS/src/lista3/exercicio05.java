package lista3;
import java.util.Scanner;
public class exercicio05 {
	
	public static void main (String [] args) {
		Scanner leia = new Scanner(System.in);
		
		int num  , soma=0 ;
			
		
		do { 
			System.out.println("Digite um numero :");
			num = leia.nextInt();
			
			soma= soma + num ;
			
		}
		
		while (num != 0 );
	
		System.out.println(" A soma dos numeros digitos é :" + soma );
	
	}
	
}

	


