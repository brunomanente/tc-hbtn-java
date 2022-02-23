import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {
	private String nome;
	private double preco;
	private double percentualMarkUp = 0.10;
	
	public Produto(double preco, String nome) {
		this.nome = nome;
		this.preco = preco;
	}
	public Produto() {
		
	}
	Supplier<Double> precoComMarkUp = () ->  preco*(percentualMarkUp + 1);
	Consumer<Double> atualizarMarkUp = e -> percentualMarkUp = e/100;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getPercentualMarkUp() {
		return preco * percentualMarkUp;
	}
	public void setPercentualMarkUp(double percentualMarkUp) {
		this.percentualMarkUp = percentualMarkUp;
	}
	
	

}
