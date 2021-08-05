
import java.util.Scanner;
	
	public class For {
	

	public static void main (String[] args) {
	Scanner leia =new Scanner(System.in);
		int idade;
		char sexo;
		char opçoes;
		int contadorPessoas;
		final int LIMITE_PESSOAS_ENTREVISTADAS  = 150;
		
		while (contadorPessoas <= LIMITE_PESSOAS_ENTREVISTADAS) {
		
		
		System.out.print("Digite a idade: ");
		idade = leia.nextint();
		 System.out.print("Digite\1 -feminino\n2-masculino\n3-outros:");
		 sexo = leia.nextin().charAt(0);
		 System.out.print("Digite a opção\n1 - pessoas calma\n2 -pessoas nervosas\n3 - pessoas agressiva" );
		 opçoes = leia.next().charAt(0);
		 contadorPessoas++;
		 System.out.println("Continua S/N : ");
		 op = leia.next().toUppercase().charAt(0);
		 if (op=='N') {
			 break
		 }
		 
}
		 
		 
	
	
