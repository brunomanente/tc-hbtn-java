
public class InteiroPositivo {
	private int valor;
	private int cont =0;
	
	
	public InteiroPositivo(int valor) {
		this.valor = valor;
	}

	public InteiroPositivo(String valor)  {
		this.valor = validador(Integer.valueOf(valor));
	}
	
	public int validador(int valor)  {
		if(valor > 0) {
			return valor;
		}else {
			throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
		}
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) throws Exception {
		this.valor = validador(valor);
	}

	public boolean ehPrimo() {
		for(int i = 1; i <= valor; i++) {
			if(valor % i == 0) {
				cont++;
			}
		}
		if(cont == 2) {
			return true;
		}
		return false;
	}


	
	
	
	

}

