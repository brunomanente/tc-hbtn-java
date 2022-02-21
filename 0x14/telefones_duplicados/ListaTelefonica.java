import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ListaTelefonica {
	
	private HashMap<String, HashSet<Telefone>> map;

	public ListaTelefonica(HashMap<String, HashSet<Telefone>> listaTelefones) {
		super();
		this.map = listaTelefones;
	}
	public ListaTelefonica() {
		map = new HashMap<>();
	}
	

	public void adicionarTelefone(String nome, Telefone telefone) {
        HashSet<Telefone> hashSet = new HashSet<>();

        boolean encontrou = false;

        for (Map.Entry<String, HashSet<Telefone>> entry : map.entrySet()) {
            String key = entry.getKey();
            HashSet<Telefone> value = entry.getValue();
            if (value.contains(telefone)) {
                encontrou = true;
                if (key.equals(nome)) {
                    System.out.println("Telefone jah existente para essa pessoa");
                } else {
                    System.out.println("Telefone jah pertence a outra pessoa");
                }
            }
        }

        if (!encontrou) {
            if (map.containsKey(nome)) {
                map.get(nome).add(telefone);
            } else {
                hashSet.add(telefone);
                map.put(nome, hashSet);
            }
        }
    }
	
	public HashSet<Telefone> buscar(String nome) {				
		return map.get(nome);
	}
}