import java.util.ArrayList;

public class Cliente {
	private String nome;
	private ArrayList<Double> transacoes;
	public Cliente() {
	}
	
	public Cliente(String nome, double valorTransacaoInicial) {
		super();
		this.nome = nome;
		this.transacoes = new ArrayList<>();
	}


	public String getNome() {
		return nome;
	}

	public ArrayList<Double> getTransacoes() {
		return transacoes;
	}
	
	public void adicionarTransacao(double valorTransacao) {
		transacoes.add(valorTransacao);
	}
	
	
	

}
