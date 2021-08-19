
public class Preguiça {

	public static class Preguiça {

		public static void main(String[] args) {
			
			Preguiça animal1 = new Preguiça("T", 2021);
			
			Preguiça.animal('P');
			
			System.out.println(animal1.getRaca());
			System.out.println("Idade do bicho: " + (2021-animal1.getAnoNascimento()) + " anos");
			animal1.emiteSom();
			System.out.printf("\nA idade é: %d anos", animal1.idade());
			
			Preguiça Preguiça1 = new Preguiça("Pônei", 2018, true);
			System.out.printf("\nRaça da Preguiça: %s, ano nascimento: %d\n", Preguiça1.getRaca(), Preguiça.getAnoNascimento());
			
			Preguiça1.relincho();
			Preguiça.emiteSom();
			

		}

	}
}

