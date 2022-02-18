import java.util.ArrayList;
import java.util.HashMap;

public class ListaTelefonica {
	
	private HashMap<String, ArrayList<Telefone>> listaTelefones;

	public ListaTelefonica(HashMap<String, ArrayList<Telefone>> listaTelefones) {
		super();
		this.listaTelefones = listaTelefones;
	}
	public ListaTelefonica() {
		listaTelefones = new HashMap<>();
	}
	

	public void adicionarTelefone(String nome, Telefone telefone) {
		ArrayList<Telefone> list = new ArrayList<>();
		
		if(listaTelefones.containsKey(nome)) {
			listaTelefones.get(nome).add(telefone);
		}
		else {
			list.add(telefone);
			listaTelefones.put(nome, list);
		}
	}
	
	public ArrayList<Telefone> buscar(String nome) {
		ArrayList<Telefone> list = new ArrayList<Telefone>();
		list = listaTelefones.get(nome);		
		return list;
	}

	

	

}
