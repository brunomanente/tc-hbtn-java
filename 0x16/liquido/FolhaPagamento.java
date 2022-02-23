
public class FolhaPagamento {

	public static double calcularLiquido(Funcionario funcionario, CalculadorDeSalario calculadordesalario) {
		return calculadordesalario.calcular(funcionario.getSalario());
	}
}
