
public class Empregado {
	protected double salarioFixo;
	public double calcularBonus;

	public double getSalarioFixo() {
		return salarioFixo;
	}

	public Empregado(double salarioFixo) {
		super();
		this.salarioFixo = salarioFixo;
	}
	
	
	
	double calcularBonus(Departamento departamento) {
		if(departamento.alcancouMeta()) {			
			return salarioFixo*0.1;
		}else {
			return 0;
		}
	}
	
	
	
	double calcularSalarioTotal(Departamento departamento) {
		return calcularBonus(departamento) + salarioFixo;
	}
}

