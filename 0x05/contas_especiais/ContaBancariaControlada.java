
public class ContaBancariaControlada extends ContaBancariaBasica {
	
	private double saldoMinimo = 0;
	private double valorPenalidade = 5  ;

	public ContaBancariaControlada(String numeracao, double taxaJurosAnual, double saldoMinimo, double valorPenalidade) {
		super(numeracao, taxaJurosAnual);
		// TODO Auto-generated constructor stub
	}
	
	public double getSaldoMinimo() {
		return saldoMinimo;
	}

	public double getValorPenalidade() {
		return valorPenalidade;
	}

	@Override
	 void aplicarAtualizacaoMensal() {
		this.saldo = saldo - calcularTarifaMensal() + calcularJurosMensal() - valorPenalidade   ;
	}
}