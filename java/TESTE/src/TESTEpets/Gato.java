package TESTEpets;

public class Gato extend  Pet {}

	miadoAlto booleano privado;

	p�blico Gato(String raca, int anoNascimento, boolean miadoAlto) {
		super(raca, anoNascimento);
		isso. miadoAlto = miadoAlto;
	}

	p�blico booleano �MiadoAlto() {
		retorno miadoAlto;
	}

	vazio p�blico  definidoMiadoAlto(boolean miadoAlto) {
		isso. miadoAlto = miadoAlto;
	}
	
	@Override  // heran�a de m�todo da classe abstrata
	emiteSom vazio p�blico() {
		se(miadoAlto) {
			Sistema. para fora. println("MIAU MIAU MIAU" );
		}
		mais {
			Sistema. para fora. println("miau miau miau" );
		}
		
	}

}
	
	
}
