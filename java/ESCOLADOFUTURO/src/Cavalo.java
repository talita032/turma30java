
public class Cavalo {

	public static class Cavalo {

		public static void main(String[] args) {
			
			Cavalo animal1 = new Cavalo("Tr�ia", 2018);
			
			Cavalo.animal('C');
			
			System.out.println(animal1.getRaca());
			System.out.println("Idade do bicho: " + (2018-animal1.getAnoNascimento()) + " anos");
			animal1.emiteSom();
			System.out.printf("\nA idade �: %d anos", animal1.idade());
			
			Cavalo cavalo1 = new Cavalo("P�nei", 2018, true);
			System.out.printf("\nRa�a do cavalo: %s, ano nascimento: %d\n", cavalo1.getRaca(), cavalo.getAnoNascimento());
			
			cavalo1.relincho();
			cavalo.emiteSom();
			
			Gato pet2 = new Gato("Siames", 2014, false);
			pet2.emiteSom();

		}

	}
}
