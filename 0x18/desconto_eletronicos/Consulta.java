
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Consulta implements List<Produto> {

	public static List<Produto> obterLivrosDoPedido(Pedido pedido) {
	
		return pedido.getProdutos().stream().filter(p -> p.getCategoria().equals(CategoriaProduto.LIVRO) )
				.collect(Collectors.toList());
	}

	public static Produto obterProdutoMaiorPreco(List<Produto> produtos) {
	
		return produtos.stream().sorted(Comparator.comparing(Produto::getPreco).reversed()).findFirst().orElse(null);
	}

	public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> produtos, int precoMinimo) {	
		
		return produtos.stream().filter(t -> t.getPreco() >= precoMinimo).collect(Collectors.toList());	
				
	}
	

	public static List<Pedido> obterPedidosComEletronicos(List<Pedido> pedido) {
		
		return pedido.stream().filter(t -> t.getProdutos().stream().anyMatch
				(p -> p.getCategoria().equals(CategoriaProduto.ELETRONICO) ) )
				.collect(Collectors.toList());
	}
	
	public static List<Produto> aplicar15PorcentoDescontoEletronicos(List<Produto> produtos) {
		
		return produtos.stream()
                .map(produto ->
                {
                    if (produto.getCategoria().equals(CategoriaProduto.ELETRONICO))
                        produto.setPreco(produto.getPreco() - produto.getPreco() * 0.15);
                    return produto;
                }).collect(Collectors.toList());
		
	}


	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<Produto> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Produto e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends Produto> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends Produto> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Produto get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produto set(int index, Produto element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int index, Produto element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Produto remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<Produto> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<Produto> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produto> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}





	

}
