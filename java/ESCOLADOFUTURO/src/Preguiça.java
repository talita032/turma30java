
public class Pregui�a {

	public static class Pregui�a {

		public static void main(String[] args) {
			
			Pregui�a animal1 = new Pregui�a("T", 2021);
			
			Pregui�a.animal('P');
			
			System.out.println(animal1.getRaca());
			System.out.println("Idade do bicho: " + (2021-animal1.getAnoNascimento()) + " anos");
			animal1.emiteSom();
			System.out.printf("\nA idade �: %d anos", animal1.idade());
			
			Pregui�a Pregui�a1 = new Pregui�a("P�nei", 2018, true);
			System.out.printf("\nRa�a da Pregui�a: %s, ano nascimento: %d\n", Pregui�a1.getRaca(), Pregui�a.getAnoNascimento());
			
			Pregui�a1.relincho();
			Pregui�a.emiteSom();
			

		}

	}
}

