package provedores;

public class JadLog implements ProvedorFrete {
	
	private static TipoProvedorFrete TIPO_PROVEDOR_FRETE = TipoProvedorFrete.JADLOG;

	@Override
	public Frete calcularFrete(double peso, double valor) {
		
		double valorFrete;
		if(peso > 2000) {
			valorFrete = valor * 0.07;
		}else {
			valorFrete = valor * 0.045;
		}
		return new Frete(valorFrete, obterTipoProvedorFrete());
	}

	@Override
	public TipoProvedorFrete obterTipoProvedorFrete() {
		return TIPO_PROVEDOR_FRETE;
	}

}
