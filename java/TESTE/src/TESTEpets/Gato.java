package TESTEpets;

public class Gato extend  Pet {}

	miadoAlto booleano privado;

	público Gato(String raca, int anoNascimento, boolean miadoAlto) {
		super(raca, anoNascimento);
		isso. miadoAlto = miadoAlto;
	}

	público booleano éMiadoAlto() {
		retorno miadoAlto;
	}

	vazio público  definidoMiadoAlto(boolean miadoAlto) {
		isso. miadoAlto = miadoAlto;
	}
	
	@Override  // herança de método da classe abstrata
	emiteSom vazio público() {
		se(miadoAlto) {
			Sistema. para fora. println("MIAU MIAU MIAU" );
		}
		mais {
			Sistema. para fora. println("miau miau miau" );
		}
		
	}

}
	
	
}
