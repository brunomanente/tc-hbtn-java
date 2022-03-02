
public class Livro extends Midia {
	private int edicao;
	
	public Livro() {
		
	}




	public Livro(String titulo, int edicao) {
		super();
		setNome(titulo);
		this.edicao = edicao;
	}






	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
	
}
