package provedores;

public class Loggi implements ProvedorFrete {
	
	private static TipoProvedorFrete TIPO_PROVEDOR_FRETE = TipoProvedorFrete.LOGGI;

	@Override
	public Frete calcularFrete(double peso, double valor) {
		
		double valorFrete;
		if(peso > 5000) {
			valorFrete = valor * 0.12;
		}else {
			valorFrete = valor * 0.04;
		}
		return new Frete(valorFrete, obterTipoProvedorFrete());
	}

	@Override
	public TipoProvedorFrete obterTipoProvedorFrete() {
		return TIPO_PROVEDOR_FRETE;
	}

}
