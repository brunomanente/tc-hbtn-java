package provedores;

public class Sedex implements ProvedorFrete {

	
	private static TipoProvedorFrete TIPO_PROVEDOR_FRETE = TipoProvedorFrete.SEDEX;

	@Override
	public Frete calcularFrete(double peso, double valor) {
		
		double valorFrete;
		if(peso > 1000) {
			valorFrete = valor * 0.10;
		}else {
			valorFrete = valor * 0.05;
		}
		return new Frete(valorFrete, obterTipoProvedorFrete());
	}

	@Override
	public TipoProvedorFrete obterTipoProvedorFrete() {
		return TIPO_PROVEDOR_FRETE;
	}


}
