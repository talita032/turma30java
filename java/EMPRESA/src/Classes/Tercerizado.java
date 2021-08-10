package Classes;

public class Tercerizado extends Funcionario {

	private double adicional;

	public Tercerizado(String matricula, int horasTrabalhadas, double valorPorHora, double adicional) {
		//uso sempre que for fazer referencia a classe mãe
		super(matricula, horasTrabalhadas, valorPorHora);
		this.adicional = adicional;
	}
	
	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}

	@Override
	public double salario() {
		return getHorasTrabalhadas() * getValorPorHora() + adicional;
	}
	

}
	
	

