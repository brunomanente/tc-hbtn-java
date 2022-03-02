
public class Video extends Midia {
	
	private int duracao;
	
	public Video() {
		
	}



	public Video(String titulo, int duracao) {
		super();
		setNome(titulo);
		this.duracao = duracao;
	}



	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	
}
