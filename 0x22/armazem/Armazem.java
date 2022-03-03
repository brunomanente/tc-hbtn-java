import java.util.Map;
import java.util.TreeMap;

public class Armazem<T> implements Armazenavel<T> {
	
	private Map<String, T> map = new TreeMap<>();

	@Override
	public void adicionarAoInventario(String nome, T valor) {
		// TODO Auto-generated method stub
		map.put(nome, valor);
	}

	@Override
	public T obterDoInventario(String nome) {
		// TODO Auto-generated method stub
		return map.get(nome);
	}
	

	
}
