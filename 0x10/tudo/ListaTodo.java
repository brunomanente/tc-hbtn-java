import java.util.ArrayList;
import java.util.List;

public class ListaTodo {
	
	//Possui o atributo tarefas que é uma lista de Tarefa
	 List<Tarefa> tarefas = new ArrayList<>(); 

	public ListaTodo(List<Tarefa> tarefas) {
		this.tarefas = tarefas;
	}
	public ListaTodo() {
		
	}

	public void adicionarTarefa(Tarefa tarefaRealizada) {

		for (Tarefa tarefa : tarefas) {
			if (tarefa.getIdentificador() == tarefaRealizada.getIdentificador()) {
				throw new IllegalArgumentException(
						"Tarefa com identificador " + tarefaRealizada.getIdentificador() + " ja existente na lista");
			}

			if (tarefaRealizada.getDescricao().isEmpty() || tarefaRealizada.getDescricao().equals("")) {
				throw new IllegalArgumentException("Descricao de tarefa invalida");
			}

		}
		tarefas.add(tarefaRealizada);
	}
	public boolean marcarTarefaFeita(int tarefaFeita) {
		
		for (Tarefa tarefa : tarefas) {
			if(tarefa.getIdentificador() ==  tarefaFeita ) {
				tarefa.setEstahFeita(true);
				return true;
			}	
		}
		return false;	
	}
	
	public boolean desfazerTarefa(int desfazerTarefa) {
		
		for (Tarefa tarefa : tarefas) {
			if(tarefa.getIdentificador() == desfazerTarefa) {
				tarefa.setEstahFeita(false);
				return true;
			}	
		}
		return false;	
	}
	
	
	

	public void listarTarefas() {
		for(Tarefa tarefa : tarefas) {
			if(tarefa.isEstahFeita()) {
				System.out.println("[X]  Id: " + tarefa.getIdentificador() + " - Descricao: " + tarefa.getDescricao()  );
			}
			else {
				System.out.println("[ ]  Id: " + tarefa.getIdentificador() + " - Descricao: " + tarefa.getDescricao());
			}
		}
		
	}

	

	public void fazerTodas() {
		for(Tarefa tarefa : tarefas) {
			tarefa.setEstahFeita(true);
		}
		
	}

	public void desfazerTodas() {
		for(Tarefa tarefa : tarefas) {
			tarefa.setEstahFeita(false);
		}
		
	}






	



}
