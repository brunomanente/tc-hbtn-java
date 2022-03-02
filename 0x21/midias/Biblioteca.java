import java.util.ArrayList;
import java.util.List;

public class Biblioteca<T> extends Midia {

	private List<T> listaValores = new ArrayList<>();


	
	//adicionarMidia: que recebe um valor do tipo genérico e adiciona o elemento na lista.
	public void adicionarMidia (T tipo) {
		listaValores.add(tipo);
	}
	


	public List<T> obterListaMidias() {
		// TODO Auto-generated method stub
		return listaValores;
	}


}
