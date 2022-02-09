
public class Tarefa {
	String descricao;
	boolean estahFeita;
	int identificador;
	public Tarefa() {
		
	}
	
	public Tarefa(String descricao, int identificador) {
		this.descricao = descricao;
		this.identificador = identificador;
	}
	
	public void modificarDescricao(String  mod) {
		if(descricao.isEmpty() || descricao.equals(null)) {
			throw new IllegalArgumentException("Descricao de tarefa invalida");
		}
		
			mod = descricao;
		

	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public boolean isEstahFeita() {
		return estahFeita;
	}

	public void setEstahFeita(boolean estahFeita) {
		this.estahFeita = estahFeita;
	}
	

	

}
