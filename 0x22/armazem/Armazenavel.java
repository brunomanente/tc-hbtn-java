
public interface Armazenavel<T> {
	//adicionarAoInventario: recebe um nome e um valor do tipo genérico.
	public void adicionarAoInventario(String nome, T valor);
	
	//obterDoInventario: recebe um nome e retorna um valor do tipo genérico.
	public T obterDoInventario(String nome);
}
