
public class Eletronico {
	private String descricao;
	private double valor;
	
	public Eletronico(String descricao, double valor) {
		super();
		this.descricao = descricao;
		this.valor = valor;
	}
	public Eletronico() {
		
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "[" + descricao +"] R$ " + String.format("%f",valor) ;
	}
	
	
	
	
	
}
