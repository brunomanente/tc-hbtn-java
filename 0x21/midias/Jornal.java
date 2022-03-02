
public class Jornal extends Midia {
	private int quantidadeArtigos;
	
	public Jornal() {
		
	}

	public Jornal(String titulo,int quantidadeArtigos) {
		super();
		setNome(titulo);
		this.quantidadeArtigos = quantidadeArtigos;
	}



	public int getQuantidadeArtigos() {
		return quantidadeArtigos;
	}

	public void setQuantidadeArtigos(int quantidadeArtigos) {
		this.quantidadeArtigos = quantidadeArtigos;
	}
	
	

}
