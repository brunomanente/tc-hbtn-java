
public class PersonagemGame {

	private String nome;
	private int saudeAtual;
	private String status;	
//construtor
	public PersonagemGame(int saudeAtual, String nome) {
		
		this.setSaudeAtual(saudeAtual);
		this.nome = nome;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome == "") {
			nome = this.nome;
		}		
	}

	public int getSaudeAtual() {
		return saudeAtual;
	}

	
	public String getStatus() {
		return status;
	}

	//////////////////////////////////////////////
	public void receberCura(int quantidadeDeCura) {
		this.saudeAtual = saudeAtual + quantidadeDeCura;
		this.setSaudeAtual(saudeAtual);
		//this.setSaudeAtual(saudeAtual);
		if (saudeAtual > 100) {
			this.saudeAtual = 100;	
		}
			

	}
	//////////////////////////////////////////////
	public void tomarDano(int quantidadeDeDano) {
		//this.setSaudeAtual(saudeAtual);
		this.saudeAtual = saudeAtual - quantidadeDeDano;
		this.setSaudeAtual(saudeAtual);
		if(saudeAtual <= 0) {
			this.saudeAtual = 0;
			
		}
	}
	/////////////////////////////////////////////
	public void setSaudeAtual(int saudeAtual) {
		this.saudeAtual = saudeAtual;
		if(saudeAtual > 0) {
			this.status = "vivo";
		}else {
			this.status = "morto";
		}
			
	}
		
		
	}


