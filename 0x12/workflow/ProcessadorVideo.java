import java.util.ArrayList;

public class ProcessadorVideo {
	
	private ArrayList<CanalNotificacao > canais;
	


	public ProcessadorVideo() {
		
		this.canais = new ArrayList<>();
	}
	
	public void registrarCanal(CanalNotificacao canais) {
		this.canais.add(canais);
	}
	
	public void processar(Video listaDeArquivos) {
		for (CanalNotificacao canalNotificacao : canais) {
			canalNotificacao.notificar(new Mensagem(listaDeArquivos.getArquivo() + " - " + listaDeArquivos.getFormado(),TipoMensagem.LOG ));
		}
	}

}
